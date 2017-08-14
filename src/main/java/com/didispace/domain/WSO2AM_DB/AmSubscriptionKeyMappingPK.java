package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class AmSubscriptionKeyMappingPK implements Serializable {
    private int subscriptionId;
    private String accessToken;

    @Column(name = "SUBSCRIPTION_ID")
    @Id
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Column(name = "ACCESS_TOKEN")
    @Id
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmSubscriptionKeyMappingPK that = (AmSubscriptionKeyMappingPK) o;

        if (subscriptionId != that.subscriptionId) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        return result;
    }
}
