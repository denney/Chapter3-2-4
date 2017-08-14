package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_TIER_PERMISSIONS", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmTierPermissions {
    private int tierPermissionsId;
    private String tier;
    private String permissionsType;
    private String roles;
    private int tenantId;

    @Id
    @Column(name = "TIER_PERMISSIONS_ID")
    public int getTierPermissionsId() {
        return tierPermissionsId;
    }

    public void setTierPermissionsId(int tierPermissionsId) {
        this.tierPermissionsId = tierPermissionsId;
    }

    @Basic
    @Column(name = "TIER")
    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Basic
    @Column(name = "PERMISSIONS_TYPE")
    public String getPermissionsType() {
        return permissionsType;
    }

    public void setPermissionsType(String permissionsType) {
        this.permissionsType = permissionsType;
    }

    @Basic
    @Column(name = "ROLES")
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmTierPermissions that = (ApmTierPermissions) o;

        if (tierPermissionsId != that.tierPermissionsId) return false;
        if (tenantId != that.tenantId) return false;
        if (tier != null ? !tier.equals(that.tier) : that.tier != null) return false;
        if (permissionsType != null ? !permissionsType.equals(that.permissionsType) : that.permissionsType != null)
            return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tierPermissionsId;
        result = 31 * result + (tier != null ? tier.hashCode() : 0);
        result = 31 * result + (permissionsType != null ? permissionsType.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }
}
