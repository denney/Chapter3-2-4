package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_APP", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpApp {
    private int id;
    private int tenantId;
    private String appName;
    private String userStore;
    private String username;
    private String description;
    private String roleClaim;
    private String authType;
    private String provisioningUserstoreDomain;
    private String isLocalClaimDialect;
    private String isSendLocalSubjectId;
    private String isSendAuthListOfIdps;
    private String isUseTenantDomainSubject;
    private String isUseUserDomainSubject;
    private String enableAuthorization;
    private String subjectClaimUri;
    private String isSaasApp;
    private String isDumbMode;
    private Collection<SpAuthStep> spAuthStepsById;
    private Collection<SpClaimMapping> spClaimMappingsById;
    private Collection<SpInboundAuth> spInboundAuthsById;
    private Collection<SpMetadata> spMetadataById;
    private Collection<SpProvisioningConnector> spProvisioningConnectorsById;
    private Collection<SpReqPathAuthenticator> spReqPathAuthenticatorsById;
    private Collection<SpRoleMapping> spRoleMappingsById;

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
    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "USER_STORE")
    public String getUserStore() {
        return userStore;
    }

    public void setUserStore(String userStore) {
        this.userStore = userStore;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "ROLE_CLAIM")
    public String getRoleClaim() {
        return roleClaim;
    }

    public void setRoleClaim(String roleClaim) {
        this.roleClaim = roleClaim;
    }

    @Basic
    @Column(name = "AUTH_TYPE")
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    @Basic
    @Column(name = "PROVISIONING_USERSTORE_DOMAIN")
    public String getProvisioningUserstoreDomain() {
        return provisioningUserstoreDomain;
    }

    public void setProvisioningUserstoreDomain(String provisioningUserstoreDomain) {
        this.provisioningUserstoreDomain = provisioningUserstoreDomain;
    }

    @Basic
    @Column(name = "IS_LOCAL_CLAIM_DIALECT")
    public String getIsLocalClaimDialect() {
        return isLocalClaimDialect;
    }

    public void setIsLocalClaimDialect(String isLocalClaimDialect) {
        this.isLocalClaimDialect = isLocalClaimDialect;
    }

    @Basic
    @Column(name = "IS_SEND_LOCAL_SUBJECT_ID")
    public String getIsSendLocalSubjectId() {
        return isSendLocalSubjectId;
    }

    public void setIsSendLocalSubjectId(String isSendLocalSubjectId) {
        this.isSendLocalSubjectId = isSendLocalSubjectId;
    }

    @Basic
    @Column(name = "IS_SEND_AUTH_LIST_OF_IDPS")
    public String getIsSendAuthListOfIdps() {
        return isSendAuthListOfIdps;
    }

    public void setIsSendAuthListOfIdps(String isSendAuthListOfIdps) {
        this.isSendAuthListOfIdps = isSendAuthListOfIdps;
    }

    @Basic
    @Column(name = "IS_USE_TENANT_DOMAIN_SUBJECT")
    public String getIsUseTenantDomainSubject() {
        return isUseTenantDomainSubject;
    }

    public void setIsUseTenantDomainSubject(String isUseTenantDomainSubject) {
        this.isUseTenantDomainSubject = isUseTenantDomainSubject;
    }

    @Basic
    @Column(name = "IS_USE_USER_DOMAIN_SUBJECT")
    public String getIsUseUserDomainSubject() {
        return isUseUserDomainSubject;
    }

    public void setIsUseUserDomainSubject(String isUseUserDomainSubject) {
        this.isUseUserDomainSubject = isUseUserDomainSubject;
    }

    @Basic
    @Column(name = "ENABLE_AUTHORIZATION")
    public String getEnableAuthorization() {
        return enableAuthorization;
    }

    public void setEnableAuthorization(String enableAuthorization) {
        this.enableAuthorization = enableAuthorization;
    }

    @Basic
    @Column(name = "SUBJECT_CLAIM_URI")
    public String getSubjectClaimUri() {
        return subjectClaimUri;
    }

    public void setSubjectClaimUri(String subjectClaimUri) {
        this.subjectClaimUri = subjectClaimUri;
    }

    @Basic
    @Column(name = "IS_SAAS_APP")
    public String getIsSaasApp() {
        return isSaasApp;
    }

    public void setIsSaasApp(String isSaasApp) {
        this.isSaasApp = isSaasApp;
    }

    @Basic
    @Column(name = "IS_DUMB_MODE")
    public String getIsDumbMode() {
        return isDumbMode;
    }

    public void setIsDumbMode(String isDumbMode) {
        this.isDumbMode = isDumbMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpApp spApp = (SpApp) o;

        if (id != spApp.id) return false;
        if (tenantId != spApp.tenantId) return false;
        if (appName != null ? !appName.equals(spApp.appName) : spApp.appName != null) return false;
        if (userStore != null ? !userStore.equals(spApp.userStore) : spApp.userStore != null) return false;
        if (username != null ? !username.equals(spApp.username) : spApp.username != null) return false;
        if (description != null ? !description.equals(spApp.description) : spApp.description != null) return false;
        if (roleClaim != null ? !roleClaim.equals(spApp.roleClaim) : spApp.roleClaim != null) return false;
        if (authType != null ? !authType.equals(spApp.authType) : spApp.authType != null) return false;
        if (provisioningUserstoreDomain != null ? !provisioningUserstoreDomain.equals(spApp.provisioningUserstoreDomain) : spApp.provisioningUserstoreDomain != null)
            return false;
        if (isLocalClaimDialect != null ? !isLocalClaimDialect.equals(spApp.isLocalClaimDialect) : spApp.isLocalClaimDialect != null)
            return false;
        if (isSendLocalSubjectId != null ? !isSendLocalSubjectId.equals(spApp.isSendLocalSubjectId) : spApp.isSendLocalSubjectId != null)
            return false;
        if (isSendAuthListOfIdps != null ? !isSendAuthListOfIdps.equals(spApp.isSendAuthListOfIdps) : spApp.isSendAuthListOfIdps != null)
            return false;
        if (isUseTenantDomainSubject != null ? !isUseTenantDomainSubject.equals(spApp.isUseTenantDomainSubject) : spApp.isUseTenantDomainSubject != null)
            return false;
        if (isUseUserDomainSubject != null ? !isUseUserDomainSubject.equals(spApp.isUseUserDomainSubject) : spApp.isUseUserDomainSubject != null)
            return false;
        if (enableAuthorization != null ? !enableAuthorization.equals(spApp.enableAuthorization) : spApp.enableAuthorization != null)
            return false;
        if (subjectClaimUri != null ? !subjectClaimUri.equals(spApp.subjectClaimUri) : spApp.subjectClaimUri != null)
            return false;
        if (isSaasApp != null ? !isSaasApp.equals(spApp.isSaasApp) : spApp.isSaasApp != null) return false;
        if (isDumbMode != null ? !isDumbMode.equals(spApp.isDumbMode) : spApp.isDumbMode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (userStore != null ? userStore.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (roleClaim != null ? roleClaim.hashCode() : 0);
        result = 31 * result + (authType != null ? authType.hashCode() : 0);
        result = 31 * result + (provisioningUserstoreDomain != null ? provisioningUserstoreDomain.hashCode() : 0);
        result = 31 * result + (isLocalClaimDialect != null ? isLocalClaimDialect.hashCode() : 0);
        result = 31 * result + (isSendLocalSubjectId != null ? isSendLocalSubjectId.hashCode() : 0);
        result = 31 * result + (isSendAuthListOfIdps != null ? isSendAuthListOfIdps.hashCode() : 0);
        result = 31 * result + (isUseTenantDomainSubject != null ? isUseTenantDomainSubject.hashCode() : 0);
        result = 31 * result + (isUseUserDomainSubject != null ? isUseUserDomainSubject.hashCode() : 0);
        result = 31 * result + (enableAuthorization != null ? enableAuthorization.hashCode() : 0);
        result = 31 * result + (subjectClaimUri != null ? subjectClaimUri.hashCode() : 0);
        result = 31 * result + (isSaasApp != null ? isSaasApp.hashCode() : 0);
        result = 31 * result + (isDumbMode != null ? isDumbMode.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpAuthStep> getSpAuthStepsById() {
        return spAuthStepsById;
    }

    public void setSpAuthStepsById(Collection<SpAuthStep> spAuthStepsById) {
        this.spAuthStepsById = spAuthStepsById;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpClaimMapping> getSpClaimMappingsById() {
        return spClaimMappingsById;
    }

    public void setSpClaimMappingsById(Collection<SpClaimMapping> spClaimMappingsById) {
        this.spClaimMappingsById = spClaimMappingsById;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpInboundAuth> getSpInboundAuthsById() {
        return spInboundAuthsById;
    }

    public void setSpInboundAuthsById(Collection<SpInboundAuth> spInboundAuthsById) {
        this.spInboundAuthsById = spInboundAuthsById;
    }

    @OneToMany(mappedBy = "spAppBySpId")
    public Collection<SpMetadata> getSpMetadataById() {
        return spMetadataById;
    }

    public void setSpMetadataById(Collection<SpMetadata> spMetadataById) {
        this.spMetadataById = spMetadataById;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpProvisioningConnector> getSpProvisioningConnectorsById() {
        return spProvisioningConnectorsById;
    }

    public void setSpProvisioningConnectorsById(Collection<SpProvisioningConnector> spProvisioningConnectorsById) {
        this.spProvisioningConnectorsById = spProvisioningConnectorsById;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpReqPathAuthenticator> getSpReqPathAuthenticatorsById() {
        return spReqPathAuthenticatorsById;
    }

    public void setSpReqPathAuthenticatorsById(Collection<SpReqPathAuthenticator> spReqPathAuthenticatorsById) {
        this.spReqPathAuthenticatorsById = spReqPathAuthenticatorsById;
    }

    @OneToMany(mappedBy = "spAppByAppId")
    public Collection<SpRoleMapping> getSpRoleMappingsById() {
        return spRoleMappingsById;
    }

    public void setSpRoleMappingsById(Collection<SpRoleMapping> spRoleMappingsById) {
        this.spRoleMappingsById = spRoleMappingsById;
    }
}
