package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_SYSTEM_USER", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmSystemUserPK.class)
public class UmSystemUser {
    private int umId;
    private String umUserName;
    private String umUserPassword;
    private String umSaltValue;
    private Boolean umRequireChange;
    private Timestamp umChangedTime;
    private int umTenantId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_USER_NAME")
    public String getUmUserName() {
        return umUserName;
    }

    public void setUmUserName(String umUserName) {
        this.umUserName = umUserName;
    }

    @Basic
    @Column(name = "UM_USER_PASSWORD")
    public String getUmUserPassword() {
        return umUserPassword;
    }

    public void setUmUserPassword(String umUserPassword) {
        this.umUserPassword = umUserPassword;
    }

    @Basic
    @Column(name = "UM_SALT_VALUE")
    public String getUmSaltValue() {
        return umSaltValue;
    }

    public void setUmSaltValue(String umSaltValue) {
        this.umSaltValue = umSaltValue;
    }

    @Basic
    @Column(name = "UM_REQUIRE_CHANGE")
    public Boolean getUmRequireChange() {
        return umRequireChange;
    }

    public void setUmRequireChange(Boolean umRequireChange) {
        this.umRequireChange = umRequireChange;
    }

    @Basic
    @Column(name = "UM_CHANGED_TIME")
    public Timestamp getUmChangedTime() {
        return umChangedTime;
    }

    public void setUmChangedTime(Timestamp umChangedTime) {
        this.umChangedTime = umChangedTime;
    }

    @Id
    @Column(name = "UM_TENANT_ID")
    public int getUmTenantId() {
        return umTenantId;
    }

    public void setUmTenantId(int umTenantId) {
        this.umTenantId = umTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmSystemUser that = (UmSystemUser) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;
        if (umUserPassword != null ? !umUserPassword.equals(that.umUserPassword) : that.umUserPassword != null)
            return false;
        if (umSaltValue != null ? !umSaltValue.equals(that.umSaltValue) : that.umSaltValue != null) return false;
        if (umRequireChange != null ? !umRequireChange.equals(that.umRequireChange) : that.umRequireChange != null)
            return false;
        if (umChangedTime != null ? !umChangedTime.equals(that.umChangedTime) : that.umChangedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + (umUserPassword != null ? umUserPassword.hashCode() : 0);
        result = 31 * result + (umSaltValue != null ? umSaltValue.hashCode() : 0);
        result = 31 * result + (umRequireChange != null ? umRequireChange.hashCode() : 0);
        result = 31 * result + (umChangedTime != null ? umChangedTime.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
