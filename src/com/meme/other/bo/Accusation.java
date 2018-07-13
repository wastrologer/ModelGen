package com.meme.other.bo;

import java.util.Date;

public class Accusation {
    private Long accusationId;

    private Long userId;

    private Long essayId;

    private String accusationContent;

    private Date createTime;

    private Date lastupdatetime;

    private Integer auditState;

    public Long getAccusationId() {
        return accusationId;
    }

    public void setAccusationId(Long accusationId) {
        this.accusationId = accusationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEssayId() {
        return essayId;
    }

    public void setEssayId(Long essayId) {
        this.essayId = essayId;
    }

    public String getAccusationContent() {
        return accusationContent;
    }

    public void setAccusationContent(String accusationContent) {
        this.accusationContent = accusationContent == null ? null : accusationContent.trim();
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

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }
}