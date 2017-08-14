package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_CLUSTER_LOCK", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class RegClusterLock {
    private String regLockName;
    private String regLockStatus;
    private Timestamp regLockedTime;
    private Integer regTenantId;

    @Id
    @Column(name = "REG_LOCK_NAME")
    public String getRegLockName() {
        return regLockName;
    }

    public void setRegLockName(String regLockName) {
        this.regLockName = regLockName;
    }

    @Basic
    @Column(name = "REG_LOCK_STATUS")
    public String getRegLockStatus() {
        return regLockStatus;
    }

    public void setRegLockStatus(String regLockStatus) {
        this.regLockStatus = regLockStatus;
    }

    @Basic
    @Column(name = "REG_LOCKED_TIME")
    public Timestamp getRegLockedTime() {
        return regLockedTime;
    }

    public void setRegLockedTime(Timestamp regLockedTime) {
        this.regLockedTime = regLockedTime;
    }

    @Basic
    @Column(name = "REG_TENANT_ID")
    public Integer getRegTenantId() {
        return regTenantId;
    }

    public void setRegTenantId(Integer regTenantId) {
        this.regTenantId = regTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegClusterLock that = (RegClusterLock) o;

        if (regLockName != null ? !regLockName.equals(that.regLockName) : that.regLockName != null) return false;
        if (regLockStatus != null ? !regLockStatus.equals(that.regLockStatus) : that.regLockStatus != null)
            return false;
        if (regLockedTime != null ? !regLockedTime.equals(that.regLockedTime) : that.regLockedTime != null)
            return false;
        if (regTenantId != null ? !regTenantId.equals(that.regTenantId) : that.regTenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regLockName != null ? regLockName.hashCode() : 0;
        result = 31 * result + (regLockStatus != null ? regLockStatus.hashCode() : 0);
        result = 31 * result + (regLockedTime != null ? regLockedTime.hashCode() : 0);
        result = 31 * result + (regTenantId != null ? regTenantId.hashCode() : 0);
        return result;
    }
}
