package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
public class ApmAppHitsPK implements Serializable {
    private String uuid;
    private String userId;
    private int tenantId;
    private Timestamp hitTime;

    @Column(name = "UUID")
    @Id
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "USER_ID")
    @Id
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "TENANT_ID")
    @Id
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name = "HIT_TIME")
    @Id
    public Timestamp getHitTime() {
        return hitTime;
    }

    public void setHitTime(Timestamp hitTime) {
        this.hitTime = hitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppHitsPK that = (ApmAppHitsPK) o;

        if (tenantId != that.tenantId) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (hitTime != null ? !hitTime.equals(that.hitTime) : that.hitTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (hitTime != null ? hitTime.hashCode() : 0);
        return result;
    }
}
