package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegPathPK implements Serializable {
    private int regPathId;
    private int regTenantId;

    @Column(name = "REG_PATH_ID")
    @Id
    public int getRegPathId() {
        return regPathId;
    }

    public void setRegPathId(int regPathId) {
        this.regPathId = regPathId;
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

        RegPathPK regPathPK = (RegPathPK) o;

        if (regPathId != regPathPK.regPathId) return false;
        if (regTenantId != regPathPK.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regPathId;
        result = 31 * result + regTenantId;
        return result;
    }
}
