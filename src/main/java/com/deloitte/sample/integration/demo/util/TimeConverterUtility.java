package com.deloitte.sample.integration.demo.util;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Date;

@Slf4j
public class TimeConverterUtility {
  private static final String INPUT_TIMESTAMP_FORMAT = "M/d/yyyy[' ']['T'][H:mm[:ss[.SSS]]][X]";
  private static final DateTimeFormatter TIME_STAMP_FORMATTER =
      DateTimeFormatter.ofPattern(INPUT_TIMESTAMP_FORMAT);
  private static DatatypeFactory datatypeFactory;

  static {
    try {
      datatypeFactory = DatatypeFactory.newInstance();

    } catch (DatatypeConfigurationException e) {
      log.error("Unable to create datatypeFactory instance");
    }
  }

  public static XMLGregorianCalendar getTargetFormat(String inputStr) {
    if (null == inputStr || inputStr == "") {
      return null;
    }
    return getDateAsXMLGregorianCalendar(inputStr);
  }

  public static XMLGregorianCalendar getDateAsXMLGregorianCalendar(String inputStr) {
    if (null == inputStr || inputStr == "") {
      return null;
    }
    LocalDateTime timestamp;
    LocalDate date;
    try {
      timestamp = LocalDateTime.parse(inputStr, TIME_STAMP_FORMATTER);
      return datatypeFactory.newXMLGregorianCalendar(
          timestamp.getYear(),
          timestamp.getMonthValue(),
          timestamp.getDayOfMonth(),
          timestamp.getHour(),
          timestamp.getMinute(),
          timestamp.getSecond(),
          timestamp.get(ChronoField.MILLI_OF_SECOND),
          DatatypeConstants.FIELD_UNDEFINED);
    } catch (DateTimeParseException e) {
      log.debug("unable to parse timestamp{} attempting date transofrmation" + inputStr);
    }
    try {
      date = LocalDate.parse(inputStr, TIME_STAMP_FORMATTER);
      return datatypeFactory.newXMLGregorianCalendar(
          date.getYear(),
          date.getMonthValue(),
          date.getDayOfMonth(),
          DatatypeConstants.FIELD_UNDEFINED,
          DatatypeConstants.FIELD_UNDEFINED,
          DatatypeConstants.FIELD_UNDEFINED,
          DatatypeConstants.FIELD_UNDEFINED,
          DatatypeConstants.FIELD_UNDEFINED);

    } catch (DateTimeParseException e) {
      log.debug("Unable to parse input {} as LocalDate. returning null", inputStr);
      return null;
    }
  }

  public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
    DateFormat dateFormat = new SimpleDateFormat(TradeMappingConstants.SOURCE_DATETIME_FORMAT);
    Date date = new Date();
    return TimeConverterUtility.getTargetFormat(dateFormat.format(date));
  }
}
