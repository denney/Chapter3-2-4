package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_PERMISSION", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmPermissionPK.class)
public class UmPermission {
    private int umId;
    private String umResourceId;
    private String umAction;
    private int umTenantId;
    private Integer umModuleId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_RESOURCE_ID")
    public String getUmResourceId() {
        return umResourceId;
    }

    public void setUmResourceId(String umResourceId) {
        this.umResourceId = umResourceId;
    }

    @Basic
    @Column(name = "UM_ACTION")
    public String getUmAction() {
        return umAction;
    }

    public void setUmAction(String umAction) {
        this.umAction = umAction;
    }

    @Id
    @Column(name = "UM_TENANT_ID")
    public int getUmTenantId() {
        return umTenantId;
    }

    public void setUmTenantId(int umTenantId) {
        this.umTenantId = umTenantId;
    }

    @Basic
    @Column(name = "UM_MODULE_ID")
    public Integer getUmModuleId() {
        return umModuleId;
    }

    public void setUmModuleId(Integer umModuleId) {
        this.umModuleId = umModuleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmPermission that = (UmPermission) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umResourceId != null ? !umResourceId.equals(that.umResourceId) : that.umResourceId != null) return false;
        if (umAction != null ? !umAction.equals(that.umAction) : that.umAction != null) return false;
        if (umModuleId != null ? !umModuleId.equals(that.umModuleId) : that.umModuleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umResourceId != null ? umResourceId.hashCode() : 0);
        result = 31 * result + (umAction != null ? umAction.hashCode() : 0);
        result = 31 * result + umTenantId;
        result = 31 * result + (umModuleId != null ? umModuleId.hashCode() : 0);
        return result;
    }
}
