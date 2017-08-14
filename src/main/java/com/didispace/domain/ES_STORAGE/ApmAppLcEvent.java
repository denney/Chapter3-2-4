package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_LC_EVENT", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppLcEvent {
    private int eventId;
    private String previousState;
    private String newState;
    private String userId;
    private int tenantId;
    private Timestamp eventDate;

    @Id
    @Column(name = "EVENT_ID")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "PREVIOUS_STATE")
    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    @Basic
    @Column(name = "NEW_STATE")
    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
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
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "EVENT_DATE")
    public Timestamp getEventDate() {
        return eventDate;
    }

    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppLcEvent that = (ApmAppLcEvent) o;

        if (eventId != that.eventId) return false;
        if (tenantId != that.tenantId) return false;
        if (previousState != null ? !previousState.equals(that.previousState) : that.previousState != null)
            return false;
        if (newState != null ? !newState.equals(that.newState) : that.newState != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (eventDate != null ? !eventDate.equals(that.eventDate) : that.eventDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId;
        result = 31 * result + (previousState != null ? previousState.hashCode() : 0);
        result = 31 * result + (newState != null ? newState.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (eventDate != null ? eventDate.hashCode() : 0);
        return result;
    }
}
