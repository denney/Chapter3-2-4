package com.didispace.domain.WSO2_SOCIAL_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SOCIAL_COMMENTS", schema = "PUBLIC", catalog = "WSO2_SOCIAL_DB")
public class SocialComments {
    private long id;
    private String body;
    private String payloadContextId;
    private String userId;
    private String tenantDomain;
    private Byte likes;
    private Byte unlikes;
    private String timestamp;
    private Collection<SocialLikes> socialLikesById;
    private Collection<SocialRating> socialRatingsById;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BODY")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
    @Column(name = "LIKES")
    public Byte getLikes() {
        return likes;
    }

    public void setLikes(Byte likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "UNLIKES")
    public Byte getUnlikes() {
        return unlikes;
    }

    public void setUnlikes(Byte unlikes) {
        this.unlikes = unlikes;
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

        SocialComments that = (SocialComments) o;

        if (id != that.id) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (payloadContextId != null ? !payloadContextId.equals(that.payloadContextId) : that.payloadContextId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;
        if (likes != null ? !likes.equals(that.likes) : that.likes != null) return false;
        if (unlikes != null ? !unlikes.equals(that.unlikes) : that.unlikes != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (payloadContextId != null ? payloadContextId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        result = 31 * result + (unlikes != null ? unlikes.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "socialCommentsByPayloadContextId")
    public Collection<SocialLikes> getSocialLikesById() {
        return socialLikesById;
    }

    public void setSocialLikesById(Collection<SocialLikes> socialLikesById) {
        this.socialLikesById = socialLikesById;
    }

    @OneToMany(mappedBy = "socialCommentsByCommentId")
    public Collection<SocialRating> getSocialRatingsById() {
        return socialRatingsById;
    }

    public void setSocialRatingsById(Collection<SocialRating> socialRatingsById) {
        this.socialRatingsById = socialRatingsById;
    }
}
