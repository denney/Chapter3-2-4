package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_APP_KEY_DOMAIN_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(AmAppKeyDomainMappingPK.class)
public class AmAppKeyDomainMapping {
    private String consumerKey;
    private String authzDomain;

    @Id
    @Column(name = "CONSUMER_KEY")
    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @Id
    @Column(name = "AUTHZ_DOMAIN")
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

        AmAppKeyDomainMapping that = (AmAppKeyDomainMapping) o;

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
