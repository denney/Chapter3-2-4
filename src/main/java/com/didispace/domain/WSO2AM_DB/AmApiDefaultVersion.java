package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_DEFAULT_VERSION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiDefaultVersion {
    private int defaultVersionId;
    private String apiName;
    private String apiProvider;
    private String defaultApiVersion;
    private String publishedDefaultApiVersion;

    @Id
    @Column(name = "DEFAULT_VERSION_ID")
    public int getDefaultVersionId() {
        return defaultVersionId;
    }

    public void setDefaultVersionId(int defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    @Basic
    @Column(name = "API_NAME")
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    @Basic
    @Column(name = "API_PROVIDER")
    public String getApiProvider() {
        return apiProvider;
    }

    public void setApiProvider(String apiProvider) {
        this.apiProvider = apiProvider;
    }

    @Basic
    @Column(name = "DEFAULT_API_VERSION")
    public String getDefaultApiVersion() {
        return defaultApiVersion;
    }

    public void setDefaultApiVersion(String defaultApiVersion) {
        this.defaultApiVersion = defaultApiVersion;
    }

    @Basic
    @Column(name = "PUBLISHED_DEFAULT_API_VERSION")
    public String getPublishedDefaultApiVersion() {
        return publishedDefaultApiVersion;
    }

    public void setPublishedDefaultApiVersion(String publishedDefaultApiVersion) {
        this.publishedDefaultApiVersion = publishedDefaultApiVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApiDefaultVersion that = (AmApiDefaultVersion) o;

        if (defaultVersionId != that.defaultVersionId) return false;
        if (apiName != null ? !apiName.equals(that.apiName) : that.apiName != null) return false;
        if (apiProvider != null ? !apiProvider.equals(that.apiProvider) : that.apiProvider != null) return false;
        if (defaultApiVersion != null ? !defaultApiVersion.equals(that.defaultApiVersion) : that.defaultApiVersion != null)
            return false;
        if (publishedDefaultApiVersion != null ? !publishedDefaultApiVersion.equals(that.publishedDefaultApiVersion) : that.publishedDefaultApiVersion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = defaultVersionId;
        result = 31 * result + (apiName != null ? apiName.hashCode() : 0);
        result = 31 * result + (apiProvider != null ? apiProvider.hashCode() : 0);
        result = 31 * result + (defaultApiVersion != null ? defaultApiVersion.hashCode() : 0);
        result = 31 * result + (publishedDefaultApiVersion != null ? publishedDefaultApiVersion.hashCode() : 0);
        return result;
    }
}
