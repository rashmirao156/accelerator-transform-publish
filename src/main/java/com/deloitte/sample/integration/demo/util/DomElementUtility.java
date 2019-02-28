package com.deloitte.sample.integration.demo.util;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple helper methods for working with a DOM.
 *
 * <p>TODO: Move to common lib TODO: This doesn't support namespaces at the moment
 */
@AllArgsConstructor
@Slf4j
public class DomElementUtility {

  private Element element;

  /**
   * Basic implementation at present to get a String from a DOM Element.
   *
   * @param elementName
   * @return
   */
  public String getElementContentAsString(String elementName) {

    NodeList elements = element.getElementsByTagName(elementName);
    if (elements.getLength() == 0) {
      return null;
    }

    String elementContent = elements.item(0).getTextContent();
    return elementContent.isEmpty() ? null : elementContent;
  }

  public BigDecimal getElementContentAsBigDecimal(String elementName) {
    String content = getElementContentAsString(elementName);

    if (null != content && content != "") {
      try {

        return new BigDecimal(content);

      } catch (NumberFormatException e) {

        log.error(
            "Number format Exception while parsing BigDecimal value for element "
                + elementName
                + " continuing processing by returning null : ");
        return null;
      }
    }
    return null;
  }

  public BigInteger getElementContentAsInteger(String elementName) {
    String content = getElementContentAsString(elementName);
    if (null != content && content != "") {
      try {

        return BigInteger.valueOf(Integer.parseInt(content));

      } catch (NumberFormatException e) {
        log.error(
            "Number format Exception while parsing Integer for element "
                + elementName
                + " , continuing processing by returning null : ");
        return null;
      }
    }
    return null;
  }

  /**
   * Get the direct child elements of this utilities Element
   *
   * @param elementName
   * @return
   */
  public List<Element> getChildElementListByElementName(String elementName) {
    return DomUtils.getChildElementsByTagName(this.element, elementName);
  }

  /**
   * Finds all child elements in this utilities elements DOM tree that match the element name
   *
   * @param elementName
   * @return
   */
  public List<Element> getElementListByElementName(String elementName) {
    return searchElements(new ArrayList<>(), DomUtils.getChildElements(element), elementName);
  }

  private List<Element> searchElements(
      List<Element> matches, List<Element> search, String elementName) {
    List<Element> current;
    for (Element e : search) {
      if ((elementName.equals(e.getNodeName()) || elementName.equals(e.getLocalName()))) {
        matches.add(e);
      }

      current = DomUtils.getChildElements(e);
      if (!(current.isEmpty())) {
        searchElements(matches, current, elementName);
      }
    }
    return matches;
  }
}
