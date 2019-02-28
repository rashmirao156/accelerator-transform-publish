package com.deloitte.sample.integration.demo.publisher.route;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class StatusRoute extends RouteBuilder {
  public static final String LOG_TRADE_STATUS = "direct:trade-status-log";

  public static final String TRACKING_LOGGER_NAME = "status";

  @Override
  public void configure() throws Exception {


    from(LOG_TRADE_STATUS)
        .bean(new StatusLogBean(), "constructTradeStatusMessage")
        .log(LoggingLevel.INFO, LoggerFactory.getLogger(TRACKING_LOGGER_NAME), "${body}");
  }

  public class StatusLogBean {
    public String constructTradeStatusMessage(
        Exchange exchange,
        @ExchangeProperty("FUND") String fund,
        @ExchangeProperty("INVNUM") String inv) {
      return exchange.getProperty("log_message").toString() + fund + " - " + inv;
    }

  }
}
