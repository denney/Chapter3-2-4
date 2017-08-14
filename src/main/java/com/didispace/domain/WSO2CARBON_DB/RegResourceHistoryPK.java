package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegResourceHistoryPK implements Serializable {
    private int regVersion;
    private int regTenantId;

    @Column(name = "REG_VERSION")
    @Id
    public int getRegVersion() {
        return regVersion;
    }

    public void setRegVersion(int regVersion) {
        this.regVersion = regVersion;
    }

    @Column(name = "REG_TENANT_ID")
    @Id
    public int getRegTenantId() {
        return regTenantId;
    }

    public void setRegTenantId(int regTenantId) {
        this.regTenantId = regTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegResourceHistoryPK that = (RegResourceHistoryPK) o;

        if (regVersion != that.regVersion) return false;
        if (regTenantId != that.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regVersion;
        result = 31 * result + regTenantId;
        return result;
    }
}
