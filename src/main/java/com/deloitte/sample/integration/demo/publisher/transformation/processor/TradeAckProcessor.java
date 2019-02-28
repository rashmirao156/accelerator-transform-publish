package com.deloitte.sample.integration.demo.publisher.transformation.processor;

import com.deloitte.sample.integration.demo.publisher.constant.TradeAckTemplateFields;
import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.language.XPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeAckProcessor {
  public Map<String, String> createTemplateData(
      Exchange exchange,
      @XPath(TradeMappingConstants.FUNDXPATH) String fund,
      @XPath(TradeMappingConstants.INVNUMXPATH) String inv) {

    Map<String, String> data = new HashMap<>();
    data.put(TradeAckTemplateFields.FUNDKEY, fund);
    data.put(TradeAckTemplateFields.INVNUMKEY, inv);

    exchange.setProperty(TradeMappingConstants.FIXML_FILE_NAME_KEY, fund + "-" + inv );
    return data;
  }

  public void setSuccessfulTrade(
      @ExchangeProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY) Map<String, String> ackDataMap,
      Exchange exchange) {

    ackDataMap.put(TradeAckTemplateFields.ACK_CODE_KEY, TradeMappingConstants.ACK_SUCCESS_CODE);
    ackDataMap.put(
        TradeAckTemplateFields.ACK_MESSAGE_KEY, TradeMappingConstants.ACK_SUCCESS_MESSAGE);
  }

  public void setFailedTrade(
      @ExchangeProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY) Map<String, String> ackDataMap,
      Exchange exchange) {

    ackDataMap.put(TradeAckTemplateFields.ACK_CODE_KEY, TradeMappingConstants.ACK_FAILURE_CODE);
    ackDataMap.put(
        TradeAckTemplateFields.ACK_MESSAGE_KEY, TradeMappingConstants.ACK_FAILURE_MESSAGE);
  }

  public List<Map<String, String>> split(Exchange exchange) {
    Map<String, Map<String, String>> aggregatedAckDataMap =
        exchange.getProperty(TradeMappingConstants.AGGREGATED_ACK_DATA_MAP, Map.class);
    return new ArrayList<>(aggregatedAckDataMap.values());
  }
}
