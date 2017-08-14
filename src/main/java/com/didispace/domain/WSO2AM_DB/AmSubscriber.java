package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_SUBSCRIBER", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmSubscriber {
    private int subscriberId;
    private String userId;
    private int tenantId;
    private String emailAddress;
    private Timestamp dateSubscribed;
    private String createdBy;
    private Timestamp createdTime;
    private String updatedBy;
    private Timestamp updatedTime;
    private Collection<AmApiRatings> amApiRatingsBySubscriberId;
    private Collection<AmApplication> amApplicationsBySubscriberId;
    private Collection<AmApplicationRegistration> amApplicationRegistrationsBySubscriberId;

    @Id
    @Column(name = "SUBSCRIBER_ID")
    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "EMAIL_ADDRESS")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "DATE_SUBSCRIBED")
    public Timestamp getDateSubscribed() {
        return dateSubscribed;
    }

    public void setDateSubscribed(Timestamp dateSubscribed) {
        this.dateSubscribed = dateSubscribed;
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

        AmSubscriber that = (AmSubscriber) o;

        if (subscriberId != that.subscriberId) return false;
        if (tenantId != that.tenantId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (dateSubscribed != null ? !dateSubscribed.equals(that.dateSubscribed) : that.dateSubscribed != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriberId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (dateSubscribed != null ? dateSubscribed.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "amSubscriberBySubscriberId")
    public Collection<AmApiRatings> getAmApiRatingsBySubscriberId() {
        return amApiRatingsBySubscriberId;
    }

    public void setAmApiRatingsBySubscriberId(Collection<AmApiRatings> amApiRatingsBySubscriberId) {
        this.amApiRatingsBySubscriberId = amApiRatingsBySubscriberId;
    }

    @OneToMany(mappedBy = "amSubscriberBySubscriberId")
    public Collection<AmApplication> getAmApplicationsBySubscriberId() {
        return amApplicationsBySubscriberId;
    }

    public void setAmApplicationsBySubscriberId(Collection<AmApplication> amApplicationsBySubscriberId) {
        this.amApplicationsBySubscriberId = amApplicationsBySubscriberId;
    }

    @OneToMany(mappedBy = "amSubscriberBySubscriberId")
    public Collection<AmApplicationRegistration> getAmApplicationRegistrationsBySubscriberId() {
        return amApplicationRegistrationsBySubscriberId;
    }

    public void setAmApplicationRegistrationsBySubscriberId(Collection<AmApplicationRegistration> amApplicationRegistrationsBySubscriberId) {
        this.amApplicationRegistrationsBySubscriberId = amApplicationRegistrationsBySubscriberId;
    }
}
