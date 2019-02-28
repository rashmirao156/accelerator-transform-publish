package com.deloitte.sample.integration.demo.publisher.transformation.transformer;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.director.FIXMLDirector;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import org.apache.camel.Exchange;
import org.springframework.xml.xpath.Jaxp13XPathTemplate;
import org.springframework.xml.xpath.XPathOperations;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;
import java.util.Map;

public class TradeTransformer {

  protected XPathOperations template = new Jaxp13XPathTemplate();

  public FIXML transform(Document trade) throws Exception {

    DOMSource tradeSource = new DOMSource(template.evaluateAsNode(TradeMappingConstants.TRADE_ROOT, new DOMSource(trade)));
    FIXMLDirector fixmlDirector = new FIXMLDirector(tradeSource);
    return fixmlDirector.construct();
  }
}
