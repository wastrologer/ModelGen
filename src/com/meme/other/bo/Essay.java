package com.meme.other.bo;

import java.util.Date;

public class Essay {
    private Long essayId;

    private Long userId;

    private String essayTitle;

    private String essayPic;

    private Byte essayType;

    private Date publishTime;

    private Integer clickNum;

    private Short topicId;

    private Integer recommendNum;

    private Integer commentNum;

    private Integer regionId;

    private Date createTime;

    private Integer isPublished;

    private String userNickname;

    private Date lastupdatetime;

    private Integer goldNum;

    private Integer isAward;

    private Integer isHiden;

    private String essayContent;

    public Long getEssayId() {
        return essayId;
    }

    public void setEssayId(Long essayId) {
        this.essayId = essayId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEssayTitle() {
        return essayTitle;
    }

    public void setEssayTitle(String essayTitle) {
        this.essayTitle = essayTitle == null ? null : essayTitle.trim();
    }

    public String getEssayPic() {
        return essayPic;
    }

    public void setEssayPic(String essayPic) {
        this.essayPic = essayPic == null ? null : essayPic.trim();
    }

    public Byte getEssayType() {
        return essayType;
    }

    public void setEssayType(Byte essayType) {
        this.essayType = essayType;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Short getTopicId() {
        return topicId;
    }

    public void setTopicId(Short topicId) {
        this.topicId = topicId;
    }

    public Integer getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(Integer goldNum) {
        this.goldNum = goldNum;
    }

    public Integer getIsAward() {
        return isAward;
    }

    public void setIsAward(Integer isAward) {
        this.isAward = isAward;
    }

    public Integer getIsHiden() {
        return isHiden;
    }

    public void setIsHiden(Integer isHiden) {
        this.isHiden = isHiden;
    }

    public String getEssayContent() {
        return essayContent;
    }

    public void setEssayContent(String essayContent) {
        this.essayContent = essayContent == null ? null : essayContent.trim();
    }
}