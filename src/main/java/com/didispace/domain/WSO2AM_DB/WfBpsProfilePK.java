package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class WfBpsProfilePK implements Serializable {
    private String profileName;
    private int tenantId;

    @Column(name = "PROFILE_NAME")
    @Id
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Column(name = "TENANT_ID")
    @Id
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

        WfBpsProfilePK that = (WfBpsProfilePK) o;

        if (tenantId != that.tenantId) return false;
        if (profileName != null ? !profileName.equals(that.profileName) : that.profileName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = profileName != null ? profileName.hashCode() : 0;
        result = 31 * result + tenantId;
        return result;
    }
}
