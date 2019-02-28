package com.deloitte.sample.integration.demo.publisher.gateway;

import com.deloitte.sample.integration.demo.publisher.configuration.TradePublisherConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradePublishOutboundGateway extends RouteBuilder {

  public static final String PUBLISH_ACK_TRADE ="direct:publish-ack" ;
  @Autowired TradePublisherConfiguration tradePublisherConfiguration;

  public static final String TRADE_PUB_TRADE_ROUTE_ID = "trade-trade-publish-outbound";
  public static final String PUBLISH_TRADE_ROUTE_OUTBOUND_GATEWAY_URI =
      "direct:" + TRADE_PUB_TRADE_ROUTE_ID;

  @Override
  public void configure() throws Exception {

    onException(Exception.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(PUBLISH_TRADE_ROUTE_OUTBOUND_GATEWAY_URI)
        .routeId(TRADE_PUB_TRADE_ROUTE_ID)
        .to(tradePublisherConfiguration.getTradePublishOutboundJmsUri());

  from(PUBLISH_ACK_TRADE)
        .to(tradePublisherConfiguration.getTradeAckPublishJmsUri());
}
}
