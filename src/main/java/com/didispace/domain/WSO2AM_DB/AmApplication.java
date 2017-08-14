package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_APPLICATION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApplication {
    private int applicationId;
    private String name;
    private Integer subscriberId;
    private String applicationTier;
    private String callbackUrl;
    private String description;
    private String applicationStatus;
    private String groupId;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
    private String uuid;
    private AmSubscriber amSubscriberBySubscriberId;
    private Collection<AmApplicationKeyMapping> amApplicationKeyMappingsByApplicationId;
    private Collection<AmApplicationRegistration> amApplicationRegistrationsByApplicationId;
    private Collection<AmSubscription> amSubscriptionsByApplicationId;

    @Id
    @Column(name = "APPLICATION_ID")
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
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
    @Column(name = "SUBSCRIBER_ID")
    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Basic
    @Column(name = "APPLICATION_TIER")
    public String getApplicationTier() {
        return applicationTier;
    }

    public void setApplicationTier(String applicationTier) {
        this.applicationTier = applicationTier;
    }

    @Basic
    @Column(name = "CALLBACK_URL")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
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
    @Column(name = "APPLICATION_STATUS")
    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Basic
    @Column(name = "GROUP_ID")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

        AmApplication that = (AmApplication) o;

        if (applicationId != that.applicationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (subscriberId != null ? !subscriberId.equals(that.subscriberId) : that.subscriberId != null) return false;
        if (applicationTier != null ? !applicationTier.equals(that.applicationTier) : that.applicationTier != null)
            return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (applicationStatus != null ? !applicationStatus.equals(that.applicationStatus) : that.applicationStatus != null)
            return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (subscriberId != null ? subscriberId.hashCode() : 0);
        result = 31 * result + (applicationTier != null ? applicationTier.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (applicationStatus != null ? applicationStatus.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIBER_ID", referencedColumnName = "SUBSCRIBER_ID")
    public AmSubscriber getAmSubscriberBySubscriberId() {
        return amSubscriberBySubscriberId;
    }

    public void setAmSubscriberBySubscriberId(AmSubscriber amSubscriberBySubscriberId) {
        this.amSubscriberBySubscriberId = amSubscriberBySubscriberId;
    }

    @OneToMany(mappedBy = "amApplicationByApplicationId")
    public Collection<AmApplicationKeyMapping> getAmApplicationKeyMappingsByApplicationId() {
        return amApplicationKeyMappingsByApplicationId;
    }

    public void setAmApplicationKeyMappingsByApplicationId(Collection<AmApplicationKeyMapping> amApplicationKeyMappingsByApplicationId) {
        this.amApplicationKeyMappingsByApplicationId = amApplicationKeyMappingsByApplicationId;
    }

    @OneToMany(mappedBy = "amApplicationByAppId")
    public Collection<AmApplicationRegistration> getAmApplicationRegistrationsByApplicationId() {
        return amApplicationRegistrationsByApplicationId;
    }

    public void setAmApplicationRegistrationsByApplicationId(Collection<AmApplicationRegistration> amApplicationRegistrationsByApplicationId) {
        this.amApplicationRegistrationsByApplicationId = amApplicationRegistrationsByApplicationId;
    }

    @OneToMany(mappedBy = "amApplicationByApplicationId")
    public Collection<AmSubscription> getAmSubscriptionsByApplicationId() {
        return amSubscriptionsByApplicationId;
    }

    public void setAmSubscriptionsByApplicationId(Collection<AmSubscription> amSubscriptionsByApplicationId) {
        this.amSubscriptionsByApplicationId = amSubscriptionsByApplicationId;
    }
}
