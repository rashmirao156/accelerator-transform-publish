CREATE SCHEMA IF NOT EXISTS TradesMO;

DROP TABLE IF EXISTS TradesMO.TRADES;

CREATE TABLE TradesMO.TRADES(
    TRD_NUM BIGINT PRIMARY KEY,
    TRD_VER varchar(255) null,
    SETTL_CCY varchar(255) null,
    TXN_TM varchar(255) null,
    LAST_UPDATE_TM varchar(255) null,
    LAST_PX varchar(255) null,
    GROSS_TRD_AMT varchar(255) null,
    TRANS_TYP varchar(255) null,
    CUSIP varchar(255) null,
    FUND varchar(255) null,
    LAST_INSERT_TM varchar(255) null,
    ORIGFACE BIGINT null,
    SEC_TYPE varchar(255) null,
    PORTFOLIO_NAME varchar(255) null

);

CREATE SCHEMA IF NOT EXISTS SecurityMaster;

DROP TABLE IF EXISTS SecurityMaster.ISSUE_DETAILS;

CREATE TABLE SecurityMaster.ISSUE_DETAILS(
    ACCURAL_DT varchar(255) null,
    AGENCY varchar(255) null,
    CUSIP varchar(255)  PRIMARY KEY ,
NOTIONAL_FACE varchar(255),
AMT_ISU varchar (255),
ISSUE_DT varchar (255),
SEDOL varchar (255),
ISIN varchar (255),
TICKER_EXCH varchar (255),
ISSUER_ID varchar (255)
);
