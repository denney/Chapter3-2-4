package com.didispace.domain.WSO2_SOCIAL_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SOCIAL_LIKES", schema = "PUBLIC", catalog = "WSO2_SOCIAL_DB")
public class SocialLikes {
    private long id;
    private long payloadContextId;
    private String userId;
    private String tenantDomain;
    private Byte likeValue;
    private String timestamp;
    private SocialComments socialCommentsByPayloadContextId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAYLOAD_CONTEXT_ID")
    public long getPayloadContextId() {
        return payloadContextId;
    }

    public void setPayloadContextId(long payloadContextId) {
        this.payloadContextId = payloadContextId;
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
    @Column(name = "TENANT_DOMAIN")
    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    @Basic
    @Column(name = "LIKE_VALUE")
    public Byte getLikeValue() {
        return likeValue;
    }

    public void setLikeValue(Byte likeValue) {
        this.likeValue = likeValue;
    }

    @Basic
    @Column(name = "TIMESTAMP")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocialLikes that = (SocialLikes) o;

        if (id != that.id) return false;
        if (payloadContextId != that.payloadContextId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;
        if (likeValue != null ? !likeValue.equals(that.likeValue) : that.likeValue != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (payloadContextId ^ (payloadContextId >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        result = 31 * result + (likeValue != null ? likeValue.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PAYLOAD_CONTEXT_ID", referencedColumnName = "ID", nullable = false)
    public SocialComments getSocialCommentsByPayloadContextId() {
        return socialCommentsByPayloadContextId;
    }

    public void setSocialCommentsByPayloadContextId(SocialComments socialCommentsByPayloadContextId) {
        this.socialCommentsByPayloadContextId = socialCommentsByPayloadContextId;
    }
}
