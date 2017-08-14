package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_SUBSCRIPTION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmSubscription {
    private int subscriptionId;
    private String tierId;
    private Integer apiId;
    private Timestamp lastAccessed;
    private Integer applicationId;
    private String subStatus;
    private String subsCreateState;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
    private String uuid;
    private AmApi amApiByApiId;
    private AmApplication amApplicationByApplicationId;
    private Collection<AmSubscriptionKeyMapping> amSubscriptionKeyMappingsBySubscriptionId;

    @Id
    @Column(name = "SUBSCRIPTION_ID")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Basic
    @Column(name = "TIER_ID")
    public String getTierId() {
        return tierId;
    }

    public void setTierId(String tierId) {
        this.tierId = tierId;
    }

    @Basic
    @Column(name = "API_ID")
    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    @Basic
    @Column(name = "LAST_ACCESSED")
    public Timestamp getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Timestamp lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    @Basic
    @Column(name = "APPLICATION_ID")
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "SUB_STATUS")
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    @Basic
    @Column(name = "SUBS_CREATE_STATE")
    public String getSubsCreateState() {
        return subsCreateState;
    }

    public void setSubsCreateState(String subsCreateState) {
        this.subsCreateState = subsCreateState;
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

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmSubscription that = (AmSubscription) o;

        if (subscriptionId != that.subscriptionId) return false;
        if (tierId != null ? !tierId.equals(that.tierId) : that.tierId != null) return false;
        if (apiId != null ? !apiId.equals(that.apiId) : that.apiId != null) return false;
        if (lastAccessed != null ? !lastAccessed.equals(that.lastAccessed) : that.lastAccessed != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (subStatus != null ? !subStatus.equals(that.subStatus) : that.subStatus != null) return false;
        if (subsCreateState != null ? !subsCreateState.equals(that.subsCreateState) : that.subsCreateState != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId;
        result = 31 * result + (tierId != null ? tierId.hashCode() : 0);
        result = 31 * result + (apiId != null ? apiId.hashCode() : 0);
        result = 31 * result + (lastAccessed != null ? lastAccessed.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (subStatus != null ? subStatus.hashCode() : 0);
        result = 31 * result + (subsCreateState != null ? subsCreateState.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "API_ID", referencedColumnName = "API_ID")
    public AmApi getAmApiByApiId() {
        return amApiByApiId;
    }

    public void setAmApiByApiId(AmApi amApiByApiId) {
        this.amApiByApiId = amApiByApiId;
    }

    @ManyToOne
    @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "APPLICATION_ID")
    public AmApplication getAmApplicationByApplicationId() {
        return amApplicationByApplicationId;
    }

    public void setAmApplicationByApplicationId(AmApplication amApplicationByApplicationId) {
        this.amApplicationByApplicationId = amApplicationByApplicationId;
    }

    @OneToMany(mappedBy = "amSubscriptionBySubscriptionId")
    public Collection<AmSubscriptionKeyMapping> getAmSubscriptionKeyMappingsBySubscriptionId() {
        return amSubscriptionKeyMappingsBySubscriptionId;
    }

    public void setAmSubscriptionKeyMappingsBySubscriptionId(Collection<AmSubscriptionKeyMapping> amSubscriptionKeyMappingsBySubscriptionId) {
        this.amSubscriptionKeyMappingsBySubscriptionId = amSubscriptionKeyMappingsBySubscriptionId;
    }
}
