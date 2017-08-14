package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegAssociationPK implements Serializable {
    private int regAssociationId;
    private int regTenantId;

    @Column(name = "REG_ASSOCIATION_ID")
    @Id
    public int getRegAssociationId() {
        return regAssociationId;
    }

    public void setRegAssociationId(int regAssociationId) {
        this.regAssociationId = regAssociationId;
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

        RegAssociationPK that = (RegAssociationPK) o;

        if (regAssociationId != that.regAssociationId) return false;
        if (regTenantId != that.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regAssociationId;
        result = 31 * result + regTenantId;
        return result;
    }
}
