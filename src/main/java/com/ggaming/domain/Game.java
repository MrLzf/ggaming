package com.ggaming.domain;

import lombok.ToString;

import java.util.Date;

@ToString
public class Game {
    private String gameid;

    private String nameZh;

    private String nameEn;

    private String logoZh;

    private String logoEn;

    private String imageZh;

    private String imageEn;

    private String lang;

    private String type;

    private String status;

    private String description;

    private String createby;

    private Date createtime;

    private String updateby;

    private Date updatetime;

    private Byte priority;

    private Integer bak1;

    private Integer bak2;

    private String bak3;

    private String bak4;

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid == null ? null : gameid.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getLogoZh() {
        return logoZh;
    }

    public void setLogoZh(String logoZh) {
        this.logoZh = logoZh == null ? null : logoZh.trim();
    }

    public String getLogoEn() {
        return logoEn;
    }

    public void setLogoEn(String logoEn) {
        this.logoEn = logoEn == null ? null : logoEn.trim();
    }

    public String getImageZh() {
        return imageZh;
    }

    public void setImageZh(String imageZh) {
        this.imageZh = imageZh == null ? null : imageZh.trim();
    }

    public String getImageEn() {
        return imageEn;
    }

    public void setImageEn(String imageEn) {
        this.imageEn = imageEn == null ? null : imageEn.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Integer getBak1() {
        return bak1;
    }

    public void setBak1(Integer bak1) {
        this.bak1 = bak1;
    }

    public Integer getBak2() {
        return bak2;
    }

    public void setBak2(Integer bak2) {
        this.bak2 = bak2;
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3 == null ? null : bak3.trim();
    }

    public String getBak4() {
        return bak4;
    }

    public void setBak4(String bak4) {
        this.bak4 = bak4 == null ? null : bak4.trim();
    }
}