package com.example.bean.db;

import java.io.Serializable;
import java.util.Date;

public class PaySub implements Serializable {
    private Integer id;

    private String subName;

    private String subType;

    private String subCount;

    private String subPay;

    private Date subTime;

    private String statusCd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getSubCount() {
        return subCount;
    }

    public void setSubCount(String subCount) {
        this.subCount = subCount == null ? null : subCount.trim();
    }

    public String getSubPay() {
        return subPay;
    }

    public void setSubPay(String subPay) {
        this.subPay = subPay == null ? null : subPay.trim();
    }

    public Date getSubTime() {
        return subTime;
    }

    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd == null ? null : statusCd.trim();
    }
}