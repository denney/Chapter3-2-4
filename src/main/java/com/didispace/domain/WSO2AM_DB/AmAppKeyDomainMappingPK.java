package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class AmAppKeyDomainMappingPK implements Serializable {
    private String consumerKey;
    private String authzDomain;

    @Column(name = "CONSUMER_KEY")
    @Id
    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @Column(name = "AUTHZ_DOMAIN")
    @Id
    public String getAuthzDomain() {
        return authzDomain;
    }

    public void setAuthzDomain(String authzDomain) {
        this.authzDomain = authzDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmAppKeyDomainMappingPK that = (AmAppKeyDomainMappingPK) o;

        if (consumerKey != null ? !consumerKey.equals(that.consumerKey) : that.consumerKey != null) return false;
        if (authzDomain != null ? !authzDomain.equals(that.authzDomain) : that.authzDomain != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = consumerKey != null ? consumerKey.hashCode() : 0;
        result = 31 * result + (authzDomain != null ? authzDomain.hashCode() : 0);
        return result;
    }
}
