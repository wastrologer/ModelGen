package com.meme.other.bo;

import java.util.Date;

public class Statistics {
    private Long statisticId;

    private Integer logUserCount;

    private Integer addUserCount;

    private Integer addIdentifyUserCount;

    private Integer totalUserCount;

    private Integer newsCount;

    private String statisticsDate;

    private Date createTime;

    private Date lastupdatetime;

    public Long getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(Long statisticId) {
        this.statisticId = statisticId;
    }

    public Integer getLogUserCount() {
        return logUserCount;
    }

    public void setLogUserCount(Integer logUserCount) {
        this.logUserCount = logUserCount;
    }

    public Integer getAddUserCount() {
        return addUserCount;
    }

    public void setAddUserCount(Integer addUserCount) {
        this.addUserCount = addUserCount;
    }

    public Integer getAddIdentifyUserCount() {
        return addIdentifyUserCount;
    }

    public void setAddIdentifyUserCount(Integer addIdentifyUserCount) {
        this.addIdentifyUserCount = addIdentifyUserCount;
    }

    public Integer getTotalUserCount() {
        return totalUserCount;
    }

    public void setTotalUserCount(Integer totalUserCount) {
        this.totalUserCount = totalUserCount;
    }

    public Integer getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(Integer newsCount) {
        this.newsCount = newsCount;
    }

    public String getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate == null ? null : statisticsDate.trim();
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