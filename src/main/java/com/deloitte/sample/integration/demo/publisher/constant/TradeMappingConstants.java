package com.deloitte.sample.integration.demo.publisher.constant;

import java.util.HashMap;
import java.util.Map;

public class TradeMappingConstants {
  public static final String NAMESPACE = "http://www.fixprotocol.org/FIXML-5-0-SP2";
  public static final String EXECUTION_TIME = "EXECUTION_TIME";
  public static final String INVNUM = "INVNUM";
  public static final String TOUCHCOUNT = "TOUCHCOUNT";
  public static final String TOUCH_COUNT = "TOUCH_COUNT";
  public static final String TRD_CURRENCY = "TRD_CURRENCY";
  public static final String TRD_MODIFY_TIME = "TRD_MODIFY_TIME";
  public static final String TRD_PRICE = "TRD_PRICE";
  public static final String TRD_PRINCIPAL = "TRD_PRINCIPAL";
  public static final String TRD_STATUS = "TRD_STATUS";
  public static final String TRD_TRADE_DATE = "TRD_TRADE_DATE";
  public static final String SOURCE_DATETIME_FORMAT = "MM/dd/yyyy HH:mm:ss.SSS";
    public static final String FUNDXPATH = "//FUND";

  public static final String INVNUMXPATH ="//INVNUM" ;

  // Acknowledgement related fields
  public static final String ACK_MAP_HEADER_KEY="ACK_MAP";
  public static final String AGGREGATED_ACK_DATA_MAP = "AGGREGATED_ACK_DATA_MAP";
  public static final String ACK_SUCCESS_MESSAGE = "Trade Published Sucessfully";
  public static final String ACK_SUCCESS_CODE = "S";
  public static final String ACK_FAILURE_MESSAGE = "Failed to publish Trade";
  public static final String ACK_FAILURE_CODE = "F";


  public static final String ASSETCUSIPSET = "CUSIP2_set";
  public static final String TRDCONFIRMEDBY = "TRD_CONFIRMED_BY";
  public static final String COUNTERPARTY = "/COUNTERPARTY";
  public static final String YIELDYLD = "TRD_YIELD";
  public static final String TRDMODIFYTIME = "TRD_MODIFY_TIME";
  public static final String TRDREVIEWEDBY = "TRD_REVIEWED_BY";
  public static final String ASSETEXCHANGE = "EXCHANGE";
  public static final String INSTRMTSECTYP = "SM_SEC_TYPE";
  public static final String TRDID = "FUND";
  public static final String TRANSTYP = "TRD_STATUS";
  public static final String MATURITY = "MATURITY";
  public static final String TRDPURPOSE = "TRD_PURPOSE";
  public static final String SEDOL = "SEDOL";
  public static final String QUIK = "QUIK";
  public static final String TRDORIGENTRYDATE = "TRD_ORIG_ENTRY_DATE";
  public static final String PRICEASPCT = "PRICE_AS_PCT";
  public static final String TRDMODIFIEDBY = "TRD_MODIFIED_BY";
  public static final String ASSETFUTURECODE = "FUTURE_CODE";
  public static final String TRDPRICINGSPREAD = "TRD_PRICING_SPREAD";
  public static final String TRANTYPE = "TRAN_TYPE";
  public static final String INSTRMTFCTR = "TRD_FACTOR";
  public static final String ASSET = "//ASSETS/ASSET";
  public static final String PRICE = "//PRICE_LIST/SECURITY";
  public static final String BROKERREASONID = "BROKER_REASON";
  public static final String SETTLCCY = "TRD_CURRENCY";
  public static final String ASSETEQUITYCUSIP = "/CUSIP";
  public static final String RPTSIDESETTLCURRFXRT = "SETTLE_EXCH_RATE";
  public static final String ASSETSETTLELOCATION = "SETTLE_LOCATION";
  public static final String ASSETCUSIPCODE = "CODE";
  public static final String TXNTM = "EXECUTION_TIME";
  public static final String BROKERCOUNTERPARTIES = "BROKER/COUNTERPARTIES";
  public static final String TRDINTEREST = "TRD_INTEREST";
  public static final String TRDTDPAR = "TRD_TD_PAR";
  public static final String CFDFLAG = "CFD_FLAG";
  public static final String GROSSTRDAMT = "TRD_PRINCIPAL";
  public static final String ASSETCUSIPID = "IDENTIFIER";
  public static final String TICKER = "TICKER";
  public static final String ASSETEXCHANGEMIC = "EXCHANGE_MIC";
  public static final String ISIN = "ISIN";
  public static final String TRDTRADEDATE = "TRD_TRADE_DATE";
  public static final String SUBBROKERID = "SUB_BROKER_ID";
  public static final String RPTSIDEPTYIDBROKER = "TRD_EX_BROKER_CODE";
  public static final String TRDORIGFACE = "TRD_ORIG_FACE";
  public static final String TRDFINANCINGRATE = "TRD_FINANCING_RATE";
  public static final String ASSETCUSIPRECORD = "CUSIP2_record";
  public static final String ASSETCLEARINGORG = "CLEARING_ORG";
  public static final String ASSETSECGROUP = "SM_SEC_GROUP";
  public static final String INSTRMTID = "CUSIP";
  public static final String AMTFXRT = "TRD_EXCHANGE_RATE";
  public static final String TRDNUM = "INVNUM";
  public static final String ASSETMIPSECID = "MIP_SEC_ID";
  public static final String COUNTERPARTYBROKERID = "/BROKER_TYPE";
  public static final String ASSETDESCINSTMT = "DESC_INSTMT2";
  public static final String ASSETEQUITY = "/*";
  public static final String PRICEACCRUALDAYS = "/ACCRUAL_DAYS";
  public static final String SMCURRENCY = "SM_CURRENCY";
  public static final String TRDCOUNTERPARTY = "TRD_COUNTERPARTY";
  public static final String ASSETANNOUNCEDT = "ANNOUNCE_DT";
  public static final String INSTRMTSECGRP = "SM_SEC_GROUP";
  public static final String TRDVER = "TOUCH_COUNT";
  public static final String LASTPX = "TRD_PRICE";
  public static final String INSTRMTSUBID = "EX_SUB_BROKER_ID";
  public static final String RPTSIDEPTYIDTRADER = "TRD_TRADER";
  public static final String TRDEXDESKTYPE = "TRD_EX_DESK_TYPE";
  public static final String YIELDYLDDISCOUNT = "TRD_DISCOUNT";
  public static final String RPTSIDEINTATMAT = "INT_AT_MATURITY";
  public static final String TRDSETTLEDATE = "TRD_SETTLE_DATE";
  public static final String TRDCHARGESET = "TRDCHARGE_set";
  public static final String TRDCHARGERECORD = "/TRDCHARGE";
  public static final String CATEGORY = "/CATEGORY";
  public static final String TRDCHARGEAMOUNT = "/TRDCHARGE_AMOUNT";
  public static final String PORTFOLIONAME = "PORTFOLIOS_PORTFOLIO_NAME";
  public static final String HEADER_PORTFOLIONAME = "TRADE/PORTFOLIOS_PORTFOLIO_NAME";
  public static final String TD_NUM = "TD_NUM";
  // Constants for MiscFee Mappings
  public static final Map<String, String> CATEGORY_SUBTYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> CATEGORY_QUAL_MAP = new HashMap<>();
  public static final String SUB_TYPE_OTHERFEE = "other_fee";
  public static final String SUB_TYPE_COMMISSION = "commission";
  public static final String SUB_TYPE_EXCOMMISSION = "ex_commission";
  // END Constants for MiscFee Mappings

  public static final String TRD_SETTLE_TEMPLATE_NAME = "TRD_SETTLE_TEMPLATE_NAME";
  public static final String TRD_SETTLE_LOCATION = "TRD_SETTLE_LOCATION";

  public static final String COUNTRY = "COUNTRY";
  public static final String MULTI_FUND_ID = "MULTI_FUND_ID";
  public static final String SEC_DESC2 = "SEC_DESC2";

  public static final String RISK_COUNTRY = "RISK_COUNTRY";

  public static final String RATING_SET = "RATING_set";
  public static final String RATING_RECORD = "RATING_record";
  public static final String AGY = "AGY";
  public static final String VALUE = "VALUE";

  public static final String ST_WAL = "/ST_WAL";

  public static final String TRD_DIRTY_PRICE = "TRD_DIRTY_PRICE";
  public static final String TRD_DURATION = "TRD_DURATION";

  public static final String LEAD_MGR = "LEAD_MGR";
  public static final String TRD_COUPON = "TRD_COUPON";
  public static final String DESC_INSTMT2 = "DESC_INSTMT2";
  public static final String FUTURE_CODE = "FUTURE_CODE";
  public static final String SECURITY_DESCRIPTION_2 = "Security Description 2";

  public static final String TD_NUM_KEY = "//TD_NUM";
  public static final String TRANS_TYPE_KEY = "//TRAN_TYPE";
  public static final String TOUCH_COUNT_KEY = "//TOUCH_COUNT";


    static {
    CATEGORY_SUBTYPE_MAP.put("AMFE", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("ASFE", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("CCPF", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("CHAR", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("CLNT", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("CLRF", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("COCA", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("COUN", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("CPFE", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("CRCC", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("DCMF", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("DECO", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("ECBE", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("EXCO", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("EXEC", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("EXFE", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("FEXE", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("FTRX", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("ISDI", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("LEVY", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("LOCL", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("LOCO", SUB_TYPE_COMMISSION);
    CATEGORY_SUBTYPE_MAP.put("OTHR", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("PAYD", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("RECO", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("REGF", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("RSCH", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("STAM", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("STEX", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("SWAI", SUB_TYPE_EXCOMMISSION);
    CATEGORY_SUBTYPE_MAP.put("TIFE", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("TRAN", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("TRAX", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("UFFE", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("VATA", SUB_TYPE_OTHERFEE);
    CATEGORY_SUBTYPE_MAP.put("WITH", SUB_TYPE_OTHERFEE);

    CATEGORY_QUAL_MAP.put("AMFE",0);
    CATEGORY_QUAL_MAP.put("ASFE",0);
    CATEGORY_QUAL_MAP.put("CCPF",0);
    CATEGORY_QUAL_MAP.put("CHAR",0);
    CATEGORY_QUAL_MAP.put("CLNT",0);
    CATEGORY_QUAL_MAP.put("CLRF",0);
    CATEGORY_QUAL_MAP.put("COCA",0);
    CATEGORY_QUAL_MAP.put("COUN",0);
    CATEGORY_QUAL_MAP.put("CPFE",1);
    CATEGORY_QUAL_MAP.put("CRCC",0);
    CATEGORY_QUAL_MAP.put("DCMF",0);
    CATEGORY_QUAL_MAP.put("DECO",0);
    CATEGORY_QUAL_MAP.put("ECBE",0);
    CATEGORY_QUAL_MAP.put("EXCO",1);
    CATEGORY_QUAL_MAP.put("EXEC",0);
    CATEGORY_QUAL_MAP.put("EXFE",1);
    CATEGORY_QUAL_MAP.put("FEXE",0);
    CATEGORY_QUAL_MAP.put("FTRX",0);
    CATEGORY_QUAL_MAP.put("ISDI",0);
    CATEGORY_QUAL_MAP.put("LEVY",0);
    CATEGORY_QUAL_MAP.put("LOCL",0);
    CATEGORY_QUAL_MAP.put("LOCO",0);
    CATEGORY_QUAL_MAP.put("OTHR",0);
    CATEGORY_QUAL_MAP.put("PAYD",0);
    CATEGORY_QUAL_MAP.put("RECO",1);
    CATEGORY_QUAL_MAP.put("REGF",0);
    CATEGORY_QUAL_MAP.put("RSCH",1);
    CATEGORY_QUAL_MAP.put("STAM",0);
    CATEGORY_QUAL_MAP.put("STEX",0);
    CATEGORY_QUAL_MAP.put("SWAI",1);
    CATEGORY_QUAL_MAP.put("TIFE",0);
    CATEGORY_QUAL_MAP.put("TRAN",0);
    CATEGORY_QUAL_MAP.put("TRAX",0);
    CATEGORY_QUAL_MAP.put("UFFE",0);
    CATEGORY_QUAL_MAP.put("VATA",0);
    CATEGORY_QUAL_MAP.put("WITH",0);

  }


  public static final String TRANSACTIONS = "TRANSACTIONS";
  public static final String TRANSTYPE = "/TRAN_TYPE";
  public static final String TRANSTYPE_REPO = "REPO";
  public static final String TRANSTYPE_RRP = "REV REPO";
  public static final String TRANSTYPE_COLL = "COLL";
  public static final String TRANSTYPE_CMAT = "CMAT";
  public static final String REPO_TRADE_MAP = "REPO_TRADE_MAP";
  public static final String TRADE_TYPE = "TRADE_TYPE";

  public static final String TRD_FINANCING_RATE = "TRD_FINANCING_RATE";
  public static final String TRD_ORIG_FACE = "TRD_ORIG_FACE";
  public static final String TRD_TD_PAR = "TRD_TD_PAR";

  public static final String HYPHEN = "-";
  public static final String TRADE_ROOT = "//TRADE";
  public static final String TRADE_AGGREGATION_KEY_NONREPO = "NON-REPO";
  public static final String TRADE_AGGRAGRATION_KEY = "TRADE_AGGRAGRATION_KEY";
  public static final String TRAN_TYPE_PROPERTY_KEY = "TRAN_TYPE_PROPERTY";
  public static final String REPO_COLL_MERGE_COMPLETE_KEY = "REPO_COLL_MERGE_COMPLETE";
  public static final String REPO_CMAT_MERGE_COMPLETE_KEY = "REPO_CMAT_MERGE_COMPLETE";
  public static final String TRADE_MERGE_COMPLETE_KEY = "TRADE_MERGE_COMPLETE";


  public static final String EXCHANGE_MAP_KEY = "EXCHANGE_MAP";
  public static final int REPO_TRADE_SIZE = 3;

  public static final String CANON_HEADER_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

  public static final String ACK_MAP_HEADER_KEY_AGGREGATTED = "ACK_MAP_HEADER_AGGREGATTED";


  public static final String ASSET_ATTRIBUTE_VALUE_CDS = "CDS";
  public static final String ASSET_ATTRIBUTE_VALUE_CDX = "CDX";
  public static final String ISSUER_TICKER = "./ISSR_EXCHANGE_set/ISSR_EXCHANGE[EXCHANGE = 'MIP_REDCODE']/TICKER";

  public static final String ISSUER = "//ISSUERS/ISSUER";

  public static final String FIXML_FILE_NAME_KEY = "FIXML_FILE_NAME";

  public static final String TRADE_KEY = "TRADE";

}
