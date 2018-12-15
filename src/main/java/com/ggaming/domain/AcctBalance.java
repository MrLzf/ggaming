package com.ggaming.domain;

public class AcctBalance {
    private String accountno;

    private String currencyid;

    private String banlance;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid == null ? null : currencyid.trim();
    }

    public String getBanlance() {
        return banlance;
    }

    public void setBanlance(String banlance) {
        this.banlance = banlance == null ? null : banlance.trim();
    }
}