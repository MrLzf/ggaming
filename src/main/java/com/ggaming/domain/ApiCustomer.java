package com.ggaming.domain;

import lombok.ToString;

import java.util.Date;

@ToString
public class ApiCustomer {
    private String apicode;

    private String apiname;

    private String apicontact;

    private String apiurl;

    private String apiip;

    private String apistatus;

    private String apiupdate;

    private Date apitime;

    private String md5key;

    private String deskey;

    private String backup1;

    private String backup2;

    private String backup3;

    private String companyid;

    private String password;

    private String singlestatus;
    
    private String isNewPy;

    public String getApicode() {
        return apicode;
    }

    public void setApicode(String apicode) {
        this.apicode = apicode == null ? null : apicode.trim();
    }

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname == null ? null : apiname.trim();
    }

    public String getApicontact() {
        return apicontact;
    }

    public void setApicontact(String apicontact) {
        this.apicontact = apicontact == null ? null : apicontact.trim();
    }

    public String getApiurl() {
        return apiurl;
    }

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl == null ? null : apiurl.trim();
    }

    public String getApiip() {
        return apiip;
    }

    public void setApiip(String apiip) {
        this.apiip = apiip == null ? null : apiip.trim();
    }

    public String getApistatus() {
        return apistatus;
    }

    public void setApistatus(String apistatus) {
        this.apistatus = apistatus == null ? null : apistatus.trim();
    }

    public String getApiupdate() {
        return apiupdate;
    }

    public void setApiupdate(String apiupdate) {
        this.apiupdate = apiupdate == null ? null : apiupdate.trim();
    }

    public Date getApitime() {
        return apitime;
    }

    public void setApitime(Date apitime) {
        this.apitime = apitime;
    }

    public String getMd5key() {
        return md5key;
    }

    public void setMd5key(String md5key) {
        this.md5key = md5key == null ? null : md5key.trim();
    }

    public String getDeskey() {
        return deskey;
    }

    public void setDeskey(String deskey) {
        this.deskey = deskey == null ? null : deskey.trim();
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1 == null ? null : backup1.trim();
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2 == null ? null : backup2.trim();
    }

    public String getBackup3() {
        return backup3;
    }

    public void setBackup3(String backup3) {
        this.backup3 = backup3 == null ? null : backup3.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSinglestatus() {
        return singlestatus;
    }

    public void setSinglestatus(String singlestatus) {
        this.singlestatus = singlestatus == null ? null : singlestatus.trim();
    }

    public String getIsNewPy() {
        return isNewPy;
    }

    public void setIsNewPy(String isNewPy) {
        this.isNewPy = isNewPy;
    }
    
}