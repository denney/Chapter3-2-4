package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_PATH", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegPathPK.class)
public class RegPath {
    private int regPathId;
    private String regPathValue;
    private Integer regPathParentId;
    private int regTenantId;

    @Id
    @Column(name = "REG_PATH_ID")
    public int getRegPathId() {
        return regPathId;
    }

    public void setRegPathId(int regPathId) {
        this.regPathId = regPathId;
    }

    @Basic
    @Column(name = "REG_PATH_VALUE")
    public String getRegPathValue() {
        return regPathValue;
    }

    public void setRegPathValue(String regPathValue) {
        this.regPathValue = regPathValue;
    }

    @Basic
    @Column(name = "REG_PATH_PARENT_ID")
    public Integer getRegPathParentId() {
        return regPathParentId;
    }

    public void setRegPathParentId(Integer regPathParentId) {
        this.regPathParentId = regPathParentId;
    }

    @Id
    @Column(name = "REG_TENANT_ID")
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

        RegPath regPath = (RegPath) o;

        if (regPathId != regPath.regPathId) return false;
        if (regTenantId != regPath.regTenantId) return false;
        if (regPathValue != null ? !regPathValue.equals(regPath.regPathValue) : regPath.regPathValue != null)
            return false;
        if (regPathParentId != null ? !regPathParentId.equals(regPath.regPathParentId) : regPath.regPathParentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regPathId;
        result = 31 * result + (regPathValue != null ? regPathValue.hashCode() : 0);
        result = 31 * result + (regPathParentId != null ? regPathParentId.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
