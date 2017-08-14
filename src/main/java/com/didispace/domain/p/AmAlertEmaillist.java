package com.didispace.domain.p;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_ALERT_EMAILLIST", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmAlertEmaillist {
    private Integer emailListId;
    private String userName;
    private String stakeHolder;

    @Id
    @Column(name = "EMAIL_LIST_ID")
    public Integer getEmailListId() {
        return emailListId;
    }

    public void setEmailListId(Integer emailListId) {
        this.emailListId = emailListId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "STAKE_HOLDER")
    public String getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(String stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmAlertEmaillist that = (AmAlertEmaillist) o;

        if (emailListId != null ? !emailListId.equals(that.emailListId) : that.emailListId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (stakeHolder != null ? !stakeHolder.equals(that.stakeHolder) : that.stakeHolder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emailListId != null ? emailListId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (stakeHolder != null ? stakeHolder.hashCode() : 0);
        return result;
    }
}
