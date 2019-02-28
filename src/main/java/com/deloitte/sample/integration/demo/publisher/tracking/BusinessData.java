package com.deloitte.sample.integration.demo.publisher.tracking;


public class BusinessData {
    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    private String fund;

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
    }

    @Override
    public String toString() {
        return "BusinessData{" +
                "fund='" + fund + '\'' +
                ", invNum='" + invNum + '\'' +
                '}';
    }

    private String invNum;
}
