package com.ggaming.domain;

import lombok.ToString;

import java.util.Date;

@ToString
public class AccountInfo {
    private String accountno;

    private String apicode;

    private String accountname;

    private String pwd;

    private String initpwd;

    private String accStatus;

    private Date createtime;

    private String testflag;
    
    private String sessiondId;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getApicode() {
        return apicode;
    }

    public void setApicode(String apicode) {
        this.apicode = apicode == null ? null : apicode.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getInitpwd() {
        return initpwd;
    }

    public void setInitpwd(String initpwd) {
        this.initpwd = initpwd == null ? null : initpwd.trim();
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus == null ? null : accStatus.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTestflag() {
        return testflag;
    }

    public void setTestflag(String testflag) {
        this.testflag = testflag == null ? null : testflag.trim();
    }

	public String getSessiondId() {
		return sessiondId;
	}

	public void setSessiondId(String sessiondId) {
		this.sessiondId = sessiondId;
	}
}