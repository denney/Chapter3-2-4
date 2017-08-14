package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_SUBSCRIPTION_KEY_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(AmSubscriptionKeyMappingPK.class)
public class AmSubscriptionKeyMapping {
    private int subscriptionId;
    private String accessToken;
    private String keyType;
    private AmSubscription amSubscriptionBySubscriptionId;

    @Id
    @Column(name = "SUBSCRIPTION_ID")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Id
    @Column(name = "ACCESS_TOKEN")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "KEY_TYPE")
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmSubscriptionKeyMapping that = (AmSubscriptionKeyMapping) o;

        if (subscriptionId != that.subscriptionId) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (keyType != null ? !keyType.equals(that.keyType) : that.keyType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (keyType != null ? keyType.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIPTION_ID", referencedColumnName = "SUBSCRIPTION_ID", nullable = false)
    public AmSubscription getAmSubscriptionBySubscriptionId() {
        return amSubscriptionBySubscriptionId;
    }

    public void setAmSubscriptionBySubscriptionId(AmSubscription amSubscriptionBySubscriptionId) {
        this.amSubscriptionBySubscriptionId = amSubscriptionBySubscriptionId;
    }
}
