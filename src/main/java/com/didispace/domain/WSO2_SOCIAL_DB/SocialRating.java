package com.didispace.domain.WSO2_SOCIAL_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SOCIAL_RATING", schema = "PUBLIC", catalog = "WSO2_SOCIAL_DB")
public class SocialRating {
    private long id;
    private long commentId;
    private String payloadContextId;
    private String userId;
    private String tenantDomain;
    private Byte rating;
    private String timestamp;
    private SocialComments socialCommentsByCommentId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "COMMENT_ID")
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "PAYLOAD_CONTEXT_ID")
    public String getPayloadContextId() {
        return payloadContextId;
    }

    public void setPayloadContextId(String payloadContextId) {
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
    @Column(name = "RATING")
    public Byte getRating() {
        return rating;
    }

    public void setRating(Byte rating) {
        this.rating = rating;
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

        SocialRating that = (SocialRating) o;

        if (id != that.id) return false;
        if (commentId != that.commentId) return false;
        if (payloadContextId != null ? !payloadContextId.equals(that.payloadContextId) : that.payloadContextId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (commentId ^ (commentId >>> 32));
        result = 31 * result + (payloadContextId != null ? payloadContextId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COMMENT_ID", referencedColumnName = "ID", nullable = false)
    public SocialComments getSocialCommentsByCommentId() {
        return socialCommentsByCommentId;
    }

    public void setSocialCommentsByCommentId(SocialComments socialCommentsByCommentId) {
        this.socialCommentsByCommentId = socialCommentsByCommentId;
    }
}
