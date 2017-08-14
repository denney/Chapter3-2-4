package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegContentPK implements Serializable {
    private int regContentId;
    private int regTenantId;

    @Column(name = "REG_CONTENT_ID")
    @Id
    public int getRegContentId() {
        return regContentId;
    }

    public void setRegContentId(int regContentId) {
        this.regContentId = regContentId;
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

        RegContentPK that = (RegContentPK) o;

        if (regContentId != that.regContentId) return false;
        if (regTenantId != that.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regContentId;
        result = 31 * result + regTenantId;
        return result;
    }
}
