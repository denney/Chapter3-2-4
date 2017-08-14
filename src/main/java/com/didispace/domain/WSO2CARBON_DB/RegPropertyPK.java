package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegPropertyPK implements Serializable {
    private int regId;
    private int regTenantId;

    @Column(name = "REG_ID")
    @Id
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
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

        RegPropertyPK that = (RegPropertyPK) o;

        if (regId != that.regId) return false;
        if (regTenantId != that.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + regTenantId;
        return result;
    }
}
