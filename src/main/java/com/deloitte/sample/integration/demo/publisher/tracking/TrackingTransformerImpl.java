package com.deloitte.sample.integration.demo.publisher.tracking;

import org.springframework.stereotype.Component;

@Component
public class TrackingTransformerImpl implements TrackingTransformer {
  @Override
  public String convertToString(Object var1) {
    return var1.toString();
  }
}
