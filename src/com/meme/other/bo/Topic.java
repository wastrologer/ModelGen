package com.meme.other.bo;

import java.util.Date;

public class Topic {
    private Long topicId;

    private String topicName;

    private String topicPic;

    private Date createTime;

    private Date lastupdatetime;

    private Integer isShow;

    private Long partakeNum;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    public String getTopicPic() {
        return topicPic;
    }

    public void setTopicPic(String topicPic) {
        this.topicPic = topicPic == null ? null : topicPic.trim();
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

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Long getPartakeNum() {
        return partakeNum;
    }

    public void setPartakeNum(Long partakeNum) {
        this.partakeNum = partakeNum;
    }
}