package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegLogPK implements Serializable {
    private int regLogId;
    private int regTenantId;

    @Column(name = "REG_LOG_ID")
    @Id
    public int getRegLogId() {
        return regLogId;
    }

    public void setRegLogId(int regLogId) {
        this.regLogId = regLogId;
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

        RegLogPK regLogPK = (RegLogPK) o;

        if (regLogId != regLogPK.regLogId) return false;
        if (regTenantId != regLogPK.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regLogId;
        result = 31 * result + regTenantId;
        return result;
    }
}
