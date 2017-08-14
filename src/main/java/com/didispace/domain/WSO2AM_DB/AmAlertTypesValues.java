package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_ALERT_TYPES_VALUES", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmAlertTypesValues {
    private Integer alertTypeId;
    private String userName;
    private String stakeHolder;

    @Basic
    @Column(name = "ALERT_TYPE_ID")
    public Integer getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(Integer alertTypeId) {
        this.alertTypeId = alertTypeId;
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

        AmAlertTypesValues that = (AmAlertTypesValues) o;

        if (alertTypeId != null ? !alertTypeId.equals(that.alertTypeId) : that.alertTypeId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (stakeHolder != null ? !stakeHolder.equals(that.stakeHolder) : that.stakeHolder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alertTypeId != null ? alertTypeId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (stakeHolder != null ? stakeHolder.hashCode() : 0);
        return result;
    }
}
