package com.didispace.domain.s;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
@Entity

public class SocialRatingCache implements Serializable{
    private String payloadContextId;
    private Integer ratingTotal;
    private Integer ratingCount;
    private Double ratingAverage;
    private String tenantDomain;

    @Id
    @Column(name = "PAYLOAD_CONTEXT_ID")
    public String getPayloadContextId() {
        return payloadContextId;
    }

    public void setPayloadContextId(String payloadContextId) {
        this.payloadContextId = payloadContextId;
    }

    @Basic
    @Column(name = "RATING_TOTAL")
    public Integer getRatingTotal() {
        return ratingTotal;
    }

    public void setRatingTotal(Integer ratingTotal) {
        this.ratingTotal = ratingTotal;
    }

    @Basic
    @Column(name = "RATING_COUNT")
    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    @Basic
    @Column(name = "RATING_AVERAGE")
    public Double getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(Double ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    @Basic
    @Column(name = "TENANT_DOMAIN")
    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocialRatingCache that = (SocialRatingCache) o;

        if (payloadContextId != null ? !payloadContextId.equals(that.payloadContextId) : that.payloadContextId != null)
            return false;
        if (ratingTotal != null ? !ratingTotal.equals(that.ratingTotal) : that.ratingTotal != null) return false;
        if (ratingCount != null ? !ratingCount.equals(that.ratingCount) : that.ratingCount != null) return false;
        if (ratingAverage != null ? !ratingAverage.equals(that.ratingAverage) : that.ratingAverage != null)
            return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payloadContextId != null ? payloadContextId.hashCode() : 0;
        result = 31 * result + (ratingTotal != null ? ratingTotal.hashCode() : 0);
        result = 31 * result + (ratingCount != null ? ratingCount.hashCode() : 0);
        result = 31 * result + (ratingAverage != null ? ratingAverage.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        return result;
    }
}
