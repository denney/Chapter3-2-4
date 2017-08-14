package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_SUBSCRIPTION", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmSubscription {
    private int subscriptionId;
    private String subscriptionType;
    private String tierId;
    private Timestamp lastAccessed;
    private String subStatus;
    private String trustedIdp;
    private Timestamp subscriptionTime;

    @Id
    @Column(name = "SUBSCRIPTION_ID")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Basic
    @Column(name = "SUBSCRIPTION_TYPE")
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
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
    @Column(name = "LAST_ACCESSED")
    public Timestamp getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Timestamp lastAccessed) {
        this.lastAccessed = lastAccessed;
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
    @Column(name = "TRUSTED_IDP")
    public String getTrustedIdp() {
        return trustedIdp;
    }

    public void setTrustedIdp(String trustedIdp) {
        this.trustedIdp = trustedIdp;
    }

    @Basic
    @Column(name = "SUBSCRIPTION_TIME")
    public Timestamp getSubscriptionTime() {
        return subscriptionTime;
    }

    public void setSubscriptionTime(Timestamp subscriptionTime) {
        this.subscriptionTime = subscriptionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmSubscription that = (ApmSubscription) o;

        if (subscriptionId != that.subscriptionId) return false;
        if (subscriptionType != null ? !subscriptionType.equals(that.subscriptionType) : that.subscriptionType != null)
            return false;
        if (tierId != null ? !tierId.equals(that.tierId) : that.tierId != null) return false;
        if (lastAccessed != null ? !lastAccessed.equals(that.lastAccessed) : that.lastAccessed != null) return false;
        if (subStatus != null ? !subStatus.equals(that.subStatus) : that.subStatus != null) return false;
        if (trustedIdp != null ? !trustedIdp.equals(that.trustedIdp) : that.trustedIdp != null) return false;
        if (subscriptionTime != null ? !subscriptionTime.equals(that.subscriptionTime) : that.subscriptionTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId;
        result = 31 * result + (subscriptionType != null ? subscriptionType.hashCode() : 0);
        result = 31 * result + (tierId != null ? tierId.hashCode() : 0);
        result = 31 * result + (lastAccessed != null ? lastAccessed.hashCode() : 0);
        result = 31 * result + (subStatus != null ? subStatus.hashCode() : 0);
        result = 31 * result + (trustedIdp != null ? trustedIdp.hashCode() : 0);
        result = 31 * result + (subscriptionTime != null ? subscriptionTime.hashCode() : 0);
        return result;
    }
}
