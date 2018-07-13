package com.meme.other.bo;

import java.util.Date;

public class Comment {
    private Long commentId;

    private Long userId;

    private Long essayId;

    private String commentContent;

    private Short commentGrade;

    private Short commentSequence;

    private Long seniorCommentId;

    private Date publishTime;

    private Short topicId;

    private String userNickname;

    private Date createTime;

    private Date lastupdatetime;

    private Long recommendNum;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Short getCommentGrade() {
        return commentGrade;
    }

    public void setCommentGrade(Short commentGrade) {
        this.commentGrade = commentGrade;
    }

    public Short getCommentSequence() {
        return commentSequence;
    }

    public void setCommentSequence(Short commentSequence) {
        this.commentSequence = commentSequence;
    }

    public Long getSeniorCommentId() {
        return seniorCommentId;
    }

    public void setSeniorCommentId(Long seniorCommentId) {
        this.seniorCommentId = seniorCommentId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Short getTopicId() {
        return topicId;
    }

    public void setTopicId(Short topicId) {
        this.topicId = topicId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
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

    public Long getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(Long recommendNum) {
        this.recommendNum = recommendNum;
    }
}