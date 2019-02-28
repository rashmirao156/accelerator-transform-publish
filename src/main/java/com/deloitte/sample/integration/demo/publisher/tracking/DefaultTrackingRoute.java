package com.deloitte.sample.integration.demo.publisher.tracking;

import org.apache.camel.BeanInject;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DefaultTrackingRoute extends RouteBuilder {

  @BeanInject TrackingTransformer trackingTransformer;

  public static final String TRACKING_ROUTE_URI = "direct:tracking-info";
  public static final String TRACKING_LOGGER_NAME = "tracking";

  @Override
  public void configure() throws Exception {
    from(TRACKING_ROUTE_URI)
        .process(
            exchange -> {
              TrackingSample trackingSample = exchange.getIn().getBody(TrackingSample.class);
              exchange
                  .getIn()
                  .setBody(trackingTransformer.convertToString(trackingSample), String.class);
            })
        .log(LoggingLevel.INFO, LoggerFactory.getLogger(TRACKING_LOGGER_NAME), "${body}")
        .end();
  }
}
