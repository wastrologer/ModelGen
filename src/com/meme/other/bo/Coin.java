package com.meme.other.bo;

import java.util.Date;

public class Coin {
    private Integer coinRecordId;

    private Date coinRecordTime;

    private Integer coinNum;

    private Integer coinUserId;

    private String coinReason;

    private Date createTime;

    private Date lastupdatetime;

    public Integer getCoinRecordId() {
        return coinRecordId;
    }

    public void setCoinRecordId(Integer coinRecordId) {
        this.coinRecordId = coinRecordId;
    }

    public Date getCoinRecordTime() {
        return coinRecordTime;
    }

    public void setCoinRecordTime(Date coinRecordTime) {
        this.coinRecordTime = coinRecordTime;
    }

    public Integer getCoinNum() {
        return coinNum;
    }

    public void setCoinNum(Integer coinNum) {
        this.coinNum = coinNum;
    }

    public Integer getCoinUserId() {
        return coinUserId;
    }

    public void setCoinUserId(Integer coinUserId) {
        this.coinUserId = coinUserId;
    }

    public String getCoinReason() {
        return coinReason;
    }

    public void setCoinReason(String coinReason) {
        this.coinReason = coinReason == null ? null : coinReason.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}