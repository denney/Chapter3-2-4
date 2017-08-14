package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_AUTH_SESSION_STORE", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnAuthSessionStorePK.class)
public class IdnAuthSessionStore {
    private String sessionId;
    private String sessionType;
    private String operation;
    private byte[] sessionObject;
    private long timeCreated;
    private Integer tenantId;

    @Id
    @Column(name = "SESSION_ID")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Id
    @Column(name = "SESSION_TYPE")
    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    @Id
    @Column(name = "OPERATION")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "SESSION_OBJECT")
    public byte[] getSessionObject() {
        return sessionObject;
    }

    public void setSessionObject(byte[] sessionObject) {
        this.sessionObject = sessionObject;
    }

    @Id
    @Column(name = "TIME_CREATED")
    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnAuthSessionStore that = (IdnAuthSessionStore) o;

        if (timeCreated != that.timeCreated) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (sessionType != null ? !sessionType.equals(that.sessionType) : that.sessionType != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        if (!Arrays.equals(sessionObject, that.sessionObject)) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessionId != null ? sessionId.hashCode() : 0;
        result = 31 * result + (sessionType != null ? sessionType.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(sessionObject);
        result = 31 * result + (int) (timeCreated ^ (timeCreated >>> 32));
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
