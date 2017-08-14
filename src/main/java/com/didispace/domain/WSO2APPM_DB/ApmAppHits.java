package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_HITS", schema = "PUBLIC", catalog = "WSO2APPM_DB")
@IdClass(ApmAppHitsPK.class)
public class ApmAppHits {
    private String uuid;
    private String appName;
    private String version;
    private String context;
    private String userId;
    private int tenantId;
    private Timestamp hitTime;

    @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "VERSION")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "CONTEXT")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Id
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "HIT_TIME")
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

        ApmAppHits that = (ApmAppHits) o;

        if (tenantId != that.tenantId) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (hitTime != null ? !hitTime.equals(that.hitTime) : that.hitTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (hitTime != null ? hitTime.hashCode() : 0);
        return result;
    }
}
