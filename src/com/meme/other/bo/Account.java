package com.meme.other.bo;

import java.util.Date;

public class Account {
    private Integer accountId;

    private Integer totalGoldAccount;

    private Integer totalCoinAccount;

    private Integer allowWithdrawal;

    private Integer withdrawalFreeze;

    private Date createTime;

    private Date lastupdatetime;

    private Integer userId;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getTotalGoldAccount() {
        return totalGoldAccount;
    }

    public void setTotalGoldAccount(Integer totalGoldAccount) {
        this.totalGoldAccount = totalGoldAccount;
    }

    public Integer getTotalCoinAccount() {
        return totalCoinAccount;
    }

    public void setTotalCoinAccount(Integer totalCoinAccount) {
        this.totalCoinAccount = totalCoinAccount;
    }

    public Integer getAllowWithdrawal() {
        return allowWithdrawal;
    }

    public void setAllowWithdrawal(Integer allowWithdrawal) {
        this.allowWithdrawal = allowWithdrawal;
    }

    public Integer getWithdrawalFreeze() {
        return withdrawalFreeze;
    }

    public void setWithdrawalFreeze(Integer withdrawalFreeze) {
        this.withdrawalFreeze = withdrawalFreeze;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}