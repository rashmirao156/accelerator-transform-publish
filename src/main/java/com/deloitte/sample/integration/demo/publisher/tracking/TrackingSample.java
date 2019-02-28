package com.deloitte.sample.integration.demo.publisher.tracking;

import java.io.Serializable;


public class TrackingSample implements Serializable {

  private String id;

  public String getTrackingStatus() {
    return trackingStatus;
  }

  public void setTrackingStatus(String trackingStatus) {
    this.trackingStatus = trackingStatus;
  }

  private String trackingStatus;

  public BusinessData getBusinessData() {
    return businessData;
  }

  public void setBusinessData(BusinessData businessData) {
    this.businessData = businessData;
  }

  private BusinessData businessData;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public String toString() {
    return "TrackingSample{" +
            "id='" + id + '\'' +
            ", trackingStatus='" + trackingStatus + '\'' +
            ", businessData=" + businessData +
            '}';
  }
}
