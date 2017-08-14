package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_ASSOCIATION", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegAssociationPK.class)
public class RegAssociation {
    private int regAssociationId;
    private String regSourcepath;
    private String regTargetpath;
    private String regAssociationType;
    private int regTenantId;

    @Id
    @Column(name = "REG_ASSOCIATION_ID")
    public int getRegAssociationId() {
        return regAssociationId;
    }

    public void setRegAssociationId(int regAssociationId) {
        this.regAssociationId = regAssociationId;
    }

    @Basic
    @Column(name = "REG_SOURCEPATH")
    public String getRegSourcepath() {
        return regSourcepath;
    }

    public void setRegSourcepath(String regSourcepath) {
        this.regSourcepath = regSourcepath;
    }

    @Basic
    @Column(name = "REG_TARGETPATH")
    public String getRegTargetpath() {
        return regTargetpath;
    }

    public void setRegTargetpath(String regTargetpath) {
        this.regTargetpath = regTargetpath;
    }

    @Basic
    @Column(name = "REG_ASSOCIATION_TYPE")
    public String getRegAssociationType() {
        return regAssociationType;
    }

    public void setRegAssociationType(String regAssociationType) {
        this.regAssociationType = regAssociationType;
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

        RegAssociation that = (RegAssociation) o;

        if (regAssociationId != that.regAssociationId) return false;
        if (regTenantId != that.regTenantId) return false;
        if (regSourcepath != null ? !regSourcepath.equals(that.regSourcepath) : that.regSourcepath != null)
            return false;
        if (regTargetpath != null ? !regTargetpath.equals(that.regTargetpath) : that.regTargetpath != null)
            return false;
        if (regAssociationType != null ? !regAssociationType.equals(that.regAssociationType) : that.regAssociationType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regAssociationId;
        result = 31 * result + (regSourcepath != null ? regSourcepath.hashCode() : 0);
        result = 31 * result + (regTargetpath != null ? regTargetpath.hashCode() : 0);
        result = 31 * result + (regAssociationType != null ? regAssociationType.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
