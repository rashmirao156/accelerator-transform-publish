package com.deloitte.sample.integration.demo.publisher.route;


import com.deloitte.sample.integration.demo.publisher.configuration.TradePublisherConfiguration;
import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishInboundGateway;
import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishOutboundGateway;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.TradeAckProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.TradeNuggetProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.transformer.TradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class TradePublishRoute extends RouteBuilder {
  DataFormat formatter =
      new JaxbDataFormat("com.deloitte.sample.integration.demo.publisher.transformation.fixml");

  @Autowired TradePublisherConfiguration tradeConfiguration;

  @Override
  public void configure() throws Exception {
    from(TradePublishInboundGateway.TRADE_PUBLISH_ROUTE_URI)
        .process(new TradeNuggetProcessor())
        .split(xpath("/TRANSACTIONS/TRADE"))
        .setProperty("INVNUM", xpath(TradeMappingConstants.INVNUMXPATH, String.class))
        .setProperty("FUND", xpath(TradeMappingConstants.FUNDXPATH, String.class))
        .setProperty(
            "log_message",
            constant(
                "Trade :: Started processing Trade from Trade publish Queue for FUND-INVNUM : "))
        .wireTap(StatusRoute.LOG_TRADE_STATUS)
        .wireTap(TrackingRoute.RECIEVED_TRACKING_ROUTE)
        .setProperty(
            TradeMappingConstants.ACK_MAP_HEADER_KEY,
            method(TradeAckProcessor.class, "createTemplateData"))
        .convertBodyTo(Document.class)
        .bean(new TradeTransformer())
        .to("direct:publish");

    from("direct:publish")
        .marshal(formatter)
        .setProperty(
            "log_message",
            constant("Trade ::TRADE TRANSFORMATION to FIXML Completed for FUND-INVNUM : "))
        .wireTap(StatusRoute.LOG_TRADE_STATUS)
        .to(
            tradeConfiguration.getFixmlOutboundDirURI()
                + "${exchangeProperty.FIXML_FILE_NAME}+.xml")
        .setProperty(
            "log_message",
            constant("Trade ::FIXML written to TRADE outbound folder for  FUND-INVNUM : "))
        .wireTap(StatusRoute.LOG_TRADE_STATUS)
        .to(TradePublishOutboundGateway.PUBLISH_TRADE_ROUTE_OUTBOUND_GATEWAY_URI)
        .setProperty(
            "log_message",
            constant("Trade ::Trade published to Trade subscribe queue  for  FUND-INVNUM : "))
        .wireTap(StatusRoute.LOG_TRADE_STATUS)
        .wireTap(TrackingRoute.SENT_TRACKING_ROUTE)
        .bean(TradeAckProcessor.class, "setSuccessfulTrade")
        .setHeader(TradeMappingConstants.ACK_MAP_HEADER_KEY, body())
        .to("direct:publish-ack-trade");

    from("direct:publish-ack-trade")
        .setBody(exchangeProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY))
        .process(
            exchange -> {
              System.out.print(exchange.getProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY));
            })
        .to("freemarker:acknowledgement.ftl")
        .to(TradePublishOutboundGateway.PUBLISH_ACK_TRADE)
        .setProperty(
            "log_message",
            constant(
                "Trade ::Acknowledgement of published trade sent to trade acknowledgement queue for FUND-INVNUM : "))
        .wireTap(StatusRoute.LOG_TRADE_STATUS);
  }
}
