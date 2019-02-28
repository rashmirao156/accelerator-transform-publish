package com.deloitte.sample.integration.demo.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class XMLConverterUtility {

  public static final DOMSource getDOMSourceFromString(String str)
      throws ParserConfigurationException, IOException, SAXException {

    if (str == null || str.isEmpty()) {
      return null;
    }

    DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    Document outputDoc = null;
    outputDoc = db.parse(new ByteArrayInputStream(str.getBytes()));
    return new DOMSource(outputDoc);
  }

  public static final Document getDocumentFromString(String str)
      throws ParserConfigurationException, IOException, SAXException {

    if (str == null || str.isEmpty()) {
      return null;
    }

    DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    return db.parse(new ByteArrayInputStream(str.getBytes()));
  }
}
