package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApi {
    private int apiId;
    private String apiProvider;
    private String apiName;
    private String apiVersion;
    private String context;
    private String contextTemplate;
    private String apiTier;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
    private Collection<AmApiComments> amApiCommentsByApiId;
    private Collection<AmApiLcEvent> amApiLcEventsByApiId;
    private Collection<AmApiRatings> amApiRatingsByApiId;
    private Collection<AmApiScopes> amApiScopesByApiId;
    private Collection<AmExternalStores> amExternalStoresByApiId;
    private Collection<AmSubscription> amSubscriptionsByApiId;

    @Id
    @Column(name = "API_ID")
    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
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
    @Column(name = "API_NAME")
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    @Basic
    @Column(name = "API_VERSION")
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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
    @Column(name = "CONTEXT_TEMPLATE")
    public String getContextTemplate() {
        return contextTemplate;
    }

    public void setContextTemplate(String contextTemplate) {
        this.contextTemplate = contextTemplate;
    }

    @Basic
    @Column(name = "API_TIER")
    public String getApiTier() {
        return apiTier;
    }

    public void setApiTier(String apiTier) {
        this.apiTier = apiTier;
    }

    @Basic
    @Column(name = "CREATED_BY")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_TIME")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "UPDATED_BY")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "UPDATED_TIME")
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApi amApi = (AmApi) o;

        if (apiId != amApi.apiId) return false;
        if (apiProvider != null ? !apiProvider.equals(amApi.apiProvider) : amApi.apiProvider != null) return false;
        if (apiName != null ? !apiName.equals(amApi.apiName) : amApi.apiName != null) return false;
        if (apiVersion != null ? !apiVersion.equals(amApi.apiVersion) : amApi.apiVersion != null) return false;
        if (context != null ? !context.equals(amApi.context) : amApi.context != null) return false;
        if (contextTemplate != null ? !contextTemplate.equals(amApi.contextTemplate) : amApi.contextTemplate != null)
            return false;
        if (apiTier != null ? !apiTier.equals(amApi.apiTier) : amApi.apiTier != null) return false;
        if (createdBy != null ? !createdBy.equals(amApi.createdBy) : amApi.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(amApi.createdTime) : amApi.createdTime != null) return false;
        if (updatedBy != null ? !updatedBy.equals(amApi.updatedBy) : amApi.updatedBy != null) return false;
        if (updatedTime != null ? !updatedTime.equals(amApi.updatedTime) : amApi.updatedTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apiId;
        result = 31 * result + (apiProvider != null ? apiProvider.hashCode() : 0);
        result = 31 * result + (apiName != null ? apiName.hashCode() : 0);
        result = 31 * result + (apiVersion != null ? apiVersion.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (contextTemplate != null ? contextTemplate.hashCode() : 0);
        result = 31 * result + (apiTier != null ? apiTier.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmApiComments> getAmApiCommentsByApiId() {
        return amApiCommentsByApiId;
    }

    public void setAmApiCommentsByApiId(Collection<AmApiComments> amApiCommentsByApiId) {
        this.amApiCommentsByApiId = amApiCommentsByApiId;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmApiLcEvent> getAmApiLcEventsByApiId() {
        return amApiLcEventsByApiId;
    }

    public void setAmApiLcEventsByApiId(Collection<AmApiLcEvent> amApiLcEventsByApiId) {
        this.amApiLcEventsByApiId = amApiLcEventsByApiId;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmApiRatings> getAmApiRatingsByApiId() {
        return amApiRatingsByApiId;
    }

    public void setAmApiRatingsByApiId(Collection<AmApiRatings> amApiRatingsByApiId) {
        this.amApiRatingsByApiId = amApiRatingsByApiId;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmApiScopes> getAmApiScopesByApiId() {
        return amApiScopesByApiId;
    }

    public void setAmApiScopesByApiId(Collection<AmApiScopes> amApiScopesByApiId) {
        this.amApiScopesByApiId = amApiScopesByApiId;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmExternalStores> getAmExternalStoresByApiId() {
        return amExternalStoresByApiId;
    }

    public void setAmExternalStoresByApiId(Collection<AmExternalStores> amExternalStoresByApiId) {
        this.amExternalStoresByApiId = amExternalStoresByApiId;
    }

    @OneToMany(mappedBy = "amApiByApiId")
    public Collection<AmSubscription> getAmSubscriptionsByApiId() {
        return amSubscriptionsByApiId;
    }

    public void setAmSubscriptionsByApiId(Collection<AmSubscription> amSubscriptionsByApiId) {
        this.amSubscriptionsByApiId = amSubscriptionsByApiId;
    }
}
