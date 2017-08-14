package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_RATINGS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiRatings {
    private int ratingId;
    private Integer apiId;
    private Integer rating;
    private Integer subscriberId;
    private AmApi amApiByApiId;
    private AmSubscriber amSubscriberBySubscriberId;

    @Id
    @Column(name = "RATING_ID")
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    @Basic
    @Column(name = "API_ID")
    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    @Basic
    @Column(name = "RATING")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "SUBSCRIBER_ID")
    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApiRatings that = (AmApiRatings) o;

        if (ratingId != that.ratingId) return false;
        if (apiId != null ? !apiId.equals(that.apiId) : that.apiId != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (subscriberId != null ? !subscriberId.equals(that.subscriberId) : that.subscriberId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ratingId;
        result = 31 * result + (apiId != null ? apiId.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (subscriberId != null ? subscriberId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "API_ID", referencedColumnName = "API_ID")
    public AmApi getAmApiByApiId() {
        return amApiByApiId;
    }

    public void setAmApiByApiId(AmApi amApiByApiId) {
        this.amApiByApiId = amApiByApiId;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIBER_ID", referencedColumnName = "SUBSCRIBER_ID")
    public AmSubscriber getAmSubscriberBySubscriberId() {
        return amSubscriberBySubscriberId;
    }

    public void setAmSubscriberBySubscriberId(AmSubscriber amSubscriberBySubscriberId) {
        this.amSubscriberBySubscriberId = amSubscriberBySubscriberId;
    }
}
