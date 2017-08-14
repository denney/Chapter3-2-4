package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_PROPERTY", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegPropertyPK.class)
public class RegProperty {
    private int regId;
    private String regName;
    private String regValue;
    private int regTenantId;

    @Id
    @Column(name = "REG_ID")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "REG_NAME")
    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    @Basic
    @Column(name = "REG_VALUE")
    public String getRegValue() {
        return regValue;
    }

    public void setRegValue(String regValue) {
        this.regValue = regValue;
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

        RegProperty that = (RegProperty) o;

        if (regId != that.regId) return false;
        if (regTenantId != that.regTenantId) return false;
        if (regName != null ? !regName.equals(that.regName) : that.regName != null) return false;
        if (regValue != null ? !regValue.equals(that.regValue) : that.regValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + (regName != null ? regName.hashCode() : 0);
        result = 31 * result + (regValue != null ? regValue.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
