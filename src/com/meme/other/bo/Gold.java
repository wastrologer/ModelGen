package com.meme.other.bo;

import java.util.Date;

public class Gold {
    private Integer goldRecordId;

    private Date goldRecordTime;

    private Integer goldNum;

    private Integer goldUserId;

    private String goldReason;

    private Date createTime;

    private Date lastupdatetime;

    private Integer waterType;

    private Long retId;

    public Integer getGoldRecordId() {
        return goldRecordId;
    }

    public void setGoldRecordId(Integer goldRecordId) {
        this.goldRecordId = goldRecordId;
    }

    public Date getGoldRecordTime() {
        return goldRecordTime;
    }

    public void setGoldRecordTime(Date goldRecordTime) {
        this.goldRecordTime = goldRecordTime;
    }

    public Integer getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(Integer goldNum) {
        this.goldNum = goldNum;
    }

    public Integer getGoldUserId() {
        return goldUserId;
    }

    public void setGoldUserId(Integer goldUserId) {
        this.goldUserId = goldUserId;
    }

    public String getGoldReason() {
        return goldReason;
    }

    public void setGoldReason(String goldReason) {
        this.goldReason = goldReason == null ? null : goldReason.trim();
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

    public Integer getWaterType() {
        return waterType;
    }

    public void setWaterType(Integer waterType) {
        this.waterType = waterType;
    }

    public Long getRetId() {
        return retId;
    }

    public void setRetId(Long retId) {
        this.retId = retId;
    }
}