package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_DEFAULT_VERSION", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmAppDefaultVersion {
    private int defaultVersionId;
    private String appName;
    private String appProvider;
    private String defaultAppVersion;
    private String publishedDefaultAppVersion;
    private Integer tenantId;

    @Id
    @Column(name = "DEFAULT_VERSION_ID")
    public int getDefaultVersionId() {
        return defaultVersionId;
    }

    public void setDefaultVersionId(int defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
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
    @Column(name = "APP_PROVIDER")
    public String getAppProvider() {
        return appProvider;
    }

    public void setAppProvider(String appProvider) {
        this.appProvider = appProvider;
    }

    @Basic
    @Column(name = "DEFAULT_APP_VERSION")
    public String getDefaultAppVersion() {
        return defaultAppVersion;
    }

    public void setDefaultAppVersion(String defaultAppVersion) {
        this.defaultAppVersion = defaultAppVersion;
    }

    @Basic
    @Column(name = "PUBLISHED_DEFAULT_APP_VERSION")
    public String getPublishedDefaultAppVersion() {
        return publishedDefaultAppVersion;
    }

    public void setPublishedDefaultAppVersion(String publishedDefaultAppVersion) {
        this.publishedDefaultAppVersion = publishedDefaultAppVersion;
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

        ApmAppDefaultVersion that = (ApmAppDefaultVersion) o;

        if (defaultVersionId != that.defaultVersionId) return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;
        if (appProvider != null ? !appProvider.equals(that.appProvider) : that.appProvider != null) return false;
        if (defaultAppVersion != null ? !defaultAppVersion.equals(that.defaultAppVersion) : that.defaultAppVersion != null)
            return false;
        if (publishedDefaultAppVersion != null ? !publishedDefaultAppVersion.equals(that.publishedDefaultAppVersion) : that.publishedDefaultAppVersion != null)
            return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = defaultVersionId;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (appProvider != null ? appProvider.hashCode() : 0);
        result = 31 * result + (defaultAppVersion != null ? defaultAppVersion.hashCode() : 0);
        result = 31 * result + (publishedDefaultAppVersion != null ? publishedDefaultAppVersion.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
