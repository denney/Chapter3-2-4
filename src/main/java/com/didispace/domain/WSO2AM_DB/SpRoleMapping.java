package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_ROLE_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpRoleMapping {
    private int id;
    private int tenantId;
    private String idpRole;
    private String spRole;
    private int appId;
    private SpApp spAppByAppId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "IDP_ROLE")
    public String getIdpRole() {
        return idpRole;
    }

    public void setIdpRole(String idpRole) {
        this.idpRole = idpRole;
    }

    @Basic
    @Column(name = "SP_ROLE")
    public String getSpRole() {
        return spRole;
    }

    public void setSpRole(String spRole) {
        this.spRole = spRole;
    }

    @Basic
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpRoleMapping that = (SpRoleMapping) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (appId != that.appId) return false;
        if (idpRole != null ? !idpRole.equals(that.idpRole) : that.idpRole != null) return false;
        if (spRole != null ? !spRole.equals(that.spRole) : that.spRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (idpRole != null ? idpRole.hashCode() : 0);
        result = 31 * result + (spRole != null ? spRole.hashCode() : 0);
        result = 31 * result + appId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "ID", nullable = false)
    public SpApp getSpAppByAppId() {
        return spAppByAppId;
    }

    public void setSpAppByAppId(SpApp spAppByAppId) {
        this.spAppByAppId = spAppByAppId;
    }
}
