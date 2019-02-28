package com.deloitte.sample.integration.demo.publisher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "integration.publish.demo")
public class TradePublisherConfiguration {
  private String tradePublishInboundJmsUri;
  private String tradePublishOutboundJmsUri;
  private String tradeAckPublishJmsUri;
  private String fixmlOutboundDirURI;
}
