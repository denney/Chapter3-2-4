package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_THROTTLE_TIER_PERMISSIONS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmThrottleTierPermissions {
    private int throttleTierPermissionsId;
    private String tier;
    private String permissionsType;
    private String roles;
    private Integer tenantId;

    @Id
    @Column(name = "THROTTLE_TIER_PERMISSIONS_ID")
    public int getThrottleTierPermissionsId() {
        return throttleTierPermissionsId;
    }

    public void setThrottleTierPermissionsId(int throttleTierPermissionsId) {
        this.throttleTierPermissionsId = throttleTierPermissionsId;
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
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmThrottleTierPermissions that = (AmThrottleTierPermissions) o;

        if (throttleTierPermissionsId != that.throttleTierPermissionsId) return false;
        if (tier != null ? !tier.equals(that.tier) : that.tier != null) return false;
        if (permissionsType != null ? !permissionsType.equals(that.permissionsType) : that.permissionsType != null)
            return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = throttleTierPermissionsId;
        result = 31 * result + (tier != null ? tier.hashCode() : 0);
        result = 31 * result + (permissionsType != null ? permissionsType.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
