package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmApp {
    private int appId;
    private String appProvider;
    private Integer tenantId;
    private String appName;
    private String appVersion;
    private String context;
    private String trackingCode;
    private String visibleRoles;
    private String uuid;
    private String saml2SsoIssuer;
    private String logOutUrl;
    private Boolean appAllowAnonymous;
    private String appEndpoint;
    private boolean treatAsSite;
    private ApmApiConsumerApps apmApiConsumerAppsBySaml2SsoIssuer;

    @Id
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "APP_PROVIDER")
    public String getAppProvider() {
        return appProvider;
    }

    public void setAppProvider(String appProvider) {
        this.appProvider = appProvider;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
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
    @Column(name = "APP_VERSION")
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Basic
    @Column(name = "CONTEXT")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "TRACKING_CODE")
    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    @Basic
    @Column(name = "VISIBLE_ROLES")
    public String getVisibleRoles() {
        return visibleRoles;
    }

    public void setVisibleRoles(String visibleRoles) {
        this.visibleRoles = visibleRoles;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "SAML2_SSO_ISSUER")
    public String getSaml2SsoIssuer() {
        return saml2SsoIssuer;
    }

    public void setSaml2SsoIssuer(String saml2SsoIssuer) {
        this.saml2SsoIssuer = saml2SsoIssuer;
    }

    @Basic
    @Column(name = "LOG_OUT_URL")
    public String getLogOutUrl() {
        return logOutUrl;
    }

    public void setLogOutUrl(String logOutUrl) {
        this.logOutUrl = logOutUrl;
    }

    @Basic
    @Column(name = "APP_ALLOW_ANONYMOUS")
    public Boolean getAppAllowAnonymous() {
        return appAllowAnonymous;
    }

    public void setAppAllowAnonymous(Boolean appAllowAnonymous) {
        this.appAllowAnonymous = appAllowAnonymous;
    }

    @Basic
    @Column(name = "APP_ENDPOINT")
    public String getAppEndpoint() {
        return appEndpoint;
    }

    public void setAppEndpoint(String appEndpoint) {
        this.appEndpoint = appEndpoint;
    }

    @Basic
    @Column(name = "TREAT_AS_SITE")
    public boolean isTreatAsSite() {
        return treatAsSite;
    }

    public void setTreatAsSite(boolean treatAsSite) {
        this.treatAsSite = treatAsSite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApp apmApp = (ApmApp) o;

        if (appId != apmApp.appId) return false;
        if (treatAsSite != apmApp.treatAsSite) return false;
        if (appProvider != null ? !appProvider.equals(apmApp.appProvider) : apmApp.appProvider != null) return false;
        if (tenantId != null ? !tenantId.equals(apmApp.tenantId) : apmApp.tenantId != null) return false;
        if (appName != null ? !appName.equals(apmApp.appName) : apmApp.appName != null) return false;
        if (appVersion != null ? !appVersion.equals(apmApp.appVersion) : apmApp.appVersion != null) return false;
        if (context != null ? !context.equals(apmApp.context) : apmApp.context != null) return false;
        if (trackingCode != null ? !trackingCode.equals(apmApp.trackingCode) : apmApp.trackingCode != null)
            return false;
        if (visibleRoles != null ? !visibleRoles.equals(apmApp.visibleRoles) : apmApp.visibleRoles != null)
            return false;
        if (uuid != null ? !uuid.equals(apmApp.uuid) : apmApp.uuid != null) return false;
        if (saml2SsoIssuer != null ? !saml2SsoIssuer.equals(apmApp.saml2SsoIssuer) : apmApp.saml2SsoIssuer != null)
            return false;
        if (logOutUrl != null ? !logOutUrl.equals(apmApp.logOutUrl) : apmApp.logOutUrl != null) return false;
        if (appAllowAnonymous != null ? !appAllowAnonymous.equals(apmApp.appAllowAnonymous) : apmApp.appAllowAnonymous != null)
            return false;
        if (appEndpoint != null ? !appEndpoint.equals(apmApp.appEndpoint) : apmApp.appEndpoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId;
        result = 31 * result + (appProvider != null ? appProvider.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (appVersion != null ? appVersion.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (trackingCode != null ? trackingCode.hashCode() : 0);
        result = 31 * result + (visibleRoles != null ? visibleRoles.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (saml2SsoIssuer != null ? saml2SsoIssuer.hashCode() : 0);
        result = 31 * result + (logOutUrl != null ? logOutUrl.hashCode() : 0);
        result = 31 * result + (appAllowAnonymous != null ? appAllowAnonymous.hashCode() : 0);
        result = 31 * result + (appEndpoint != null ? appEndpoint.hashCode() : 0);
        result = 31 * result + (treatAsSite ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SAML2_SSO_ISSUER", referencedColumnName = "SAML2_SSO_ISSUER")
    public ApmApiConsumerApps getApmApiConsumerAppsBySaml2SsoIssuer() {
        return apmApiConsumerAppsBySaml2SsoIssuer;
    }

    public void setApmApiConsumerAppsBySaml2SsoIssuer(ApmApiConsumerApps apmApiConsumerAppsBySaml2SsoIssuer) {
        this.apmApiConsumerAppsBySaml2SsoIssuer = apmApiConsumerAppsBySaml2SsoIssuer;
    }
}
