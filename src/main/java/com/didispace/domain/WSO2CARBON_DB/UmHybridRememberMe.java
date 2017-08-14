package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_HYBRID_REMEMBER_ME", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmHybridRememberMePK.class)
public class UmHybridRememberMe {
    private int umId;
    private String umUserName;
    private String umCookieValue;
    private Timestamp umCreatedTime;
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
    @Column(name = "UM_COOKIE_VALUE")
    public String getUmCookieValue() {
        return umCookieValue;
    }

    public void setUmCookieValue(String umCookieValue) {
        this.umCookieValue = umCookieValue;
    }

    @Basic
    @Column(name = "UM_CREATED_TIME")
    public Timestamp getUmCreatedTime() {
        return umCreatedTime;
    }

    public void setUmCreatedTime(Timestamp umCreatedTime) {
        this.umCreatedTime = umCreatedTime;
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

        UmHybridRememberMe that = (UmHybridRememberMe) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;
        if (umCookieValue != null ? !umCookieValue.equals(that.umCookieValue) : that.umCookieValue != null)
            return false;
        if (umCreatedTime != null ? !umCreatedTime.equals(that.umCreatedTime) : that.umCreatedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + (umCookieValue != null ? umCookieValue.hashCode() : 0);
        result = 31 * result + (umCreatedTime != null ? umCreatedTime.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
