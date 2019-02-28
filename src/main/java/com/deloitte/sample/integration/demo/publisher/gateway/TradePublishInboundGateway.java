package com.deloitte.sample.integration.demo.publisher.gateway;

import com.deloitte.sample.integration.demo.publisher.configuration.TradePublisherConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectConsumerNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TradePublishInboundGateway extends RouteBuilder {
  public static final String TRADE_PUBLISH_ROUTE_URI = "direct:trade-publish-route-uri";

  public static final String TRADEPUBLISH_TRADE_QUEUE_ROUTE_ID = "trade_publisher_queue";

  @Autowired TradePublisherConfiguration tradePublisherConfiguration;

  @Override
  public void configure() throws Exception {

    onException(DirectConsumerNotAvailableException.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(tradePublisherConfiguration.getTradePublishInboundJmsUri())
        .routeId(TRADEPUBLISH_TRADE_QUEUE_ROUTE_ID)
        .to(TRADE_PUBLISH_ROUTE_URI);
  }
}
