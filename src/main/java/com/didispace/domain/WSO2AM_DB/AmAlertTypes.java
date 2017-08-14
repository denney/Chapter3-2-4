package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_ALERT_TYPES", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmAlertTypes {
    private int alertTypeId;
    private String alertTypeName;
    private String stakeHolder;

    @Id
    @Column(name = "ALERT_TYPE_ID")
    public int getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(int alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    @Basic
    @Column(name = "ALERT_TYPE_NAME")
    public String getAlertTypeName() {
        return alertTypeName;
    }

    public void setAlertTypeName(String alertTypeName) {
        this.alertTypeName = alertTypeName;
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

        AmAlertTypes that = (AmAlertTypes) o;

        if (alertTypeId != that.alertTypeId) return false;
        if (alertTypeName != null ? !alertTypeName.equals(that.alertTypeName) : that.alertTypeName != null)
            return false;
        if (stakeHolder != null ? !stakeHolder.equals(that.stakeHolder) : that.stakeHolder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alertTypeId;
        result = 31 * result + (alertTypeName != null ? alertTypeName.hashCode() : 0);
        result = 31 * result + (stakeHolder != null ? stakeHolder.hashCode() : 0);
        return result;
    }
}
