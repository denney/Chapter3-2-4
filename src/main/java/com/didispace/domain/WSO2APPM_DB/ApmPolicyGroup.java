package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_POLICY_GROUP", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmPolicyGroup {
    private int policyGrpId;
    private String name;
    private String authScheme;
    private String throttlingTier;
    private String userRoles;
    private Boolean urlAllowAnonymous;
    private String description;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public int getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(int policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AUTH_SCHEME")
    public String getAuthScheme() {
        return authScheme;
    }

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
    }

    @Basic
    @Column(name = "THROTTLING_TIER")
    public String getThrottlingTier() {
        return throttlingTier;
    }

    public void setThrottlingTier(String throttlingTier) {
        this.throttlingTier = throttlingTier;
    }

    @Basic
    @Column(name = "USER_ROLES")
    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    @Basic
    @Column(name = "URL_ALLOW_ANONYMOUS")
    public Boolean getUrlAllowAnonymous() {
        return urlAllowAnonymous;
    }

    public void setUrlAllowAnonymous(Boolean urlAllowAnonymous) {
        this.urlAllowAnonymous = urlAllowAnonymous;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGroup that = (ApmPolicyGroup) o;

        if (policyGrpId != that.policyGrpId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (authScheme != null ? !authScheme.equals(that.authScheme) : that.authScheme != null) return false;
        if (throttlingTier != null ? !throttlingTier.equals(that.throttlingTier) : that.throttlingTier != null)
            return false;
        if (userRoles != null ? !userRoles.equals(that.userRoles) : that.userRoles != null) return false;
        if (urlAllowAnonymous != null ? !urlAllowAnonymous.equals(that.urlAllowAnonymous) : that.urlAllowAnonymous != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (authScheme != null ? authScheme.hashCode() : 0);
        result = 31 * result + (throttlingTier != null ? throttlingTier.hashCode() : 0);
        result = 31 * result + (userRoles != null ? userRoles.hashCode() : 0);
        result = 31 * result + (urlAllowAnonymous != null ? urlAllowAnonymous.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
