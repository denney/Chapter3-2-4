package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OPENID_USER_RPS", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnOpenidUserRpsPK.class)
public class IdnOpenidUserRps {
    private String userName;
    private int tenantId;
    private String rpUrl;
    private String trustedAlways;
    private Date lastVisit;
    private Integer visitCount;
    private String defaultProfileName;

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "RP_URL")
    public String getRpUrl() {
        return rpUrl;
    }

    public void setRpUrl(String rpUrl) {
        this.rpUrl = rpUrl;
    }

    @Basic
    @Column(name = "TRUSTED_ALWAYS")
    public String getTrustedAlways() {
        return trustedAlways;
    }

    public void setTrustedAlways(String trustedAlways) {
        this.trustedAlways = trustedAlways;
    }

    @Basic
    @Column(name = "LAST_VISIT")
    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Basic
    @Column(name = "VISIT_COUNT")
    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    @Basic
    @Column(name = "DEFAULT_PROFILE_NAME")
    public String getDefaultProfileName() {
        return defaultProfileName;
    }

    public void setDefaultProfileName(String defaultProfileName) {
        this.defaultProfileName = defaultProfileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOpenidUserRps that = (IdnOpenidUserRps) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (rpUrl != null ? !rpUrl.equals(that.rpUrl) : that.rpUrl != null) return false;
        if (trustedAlways != null ? !trustedAlways.equals(that.trustedAlways) : that.trustedAlways != null)
            return false;
        if (lastVisit != null ? !lastVisit.equals(that.lastVisit) : that.lastVisit != null) return false;
        if (visitCount != null ? !visitCount.equals(that.visitCount) : that.visitCount != null) return false;
        if (defaultProfileName != null ? !defaultProfileName.equals(that.defaultProfileName) : that.defaultProfileName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + tenantId;
        result = 31 * result + (rpUrl != null ? rpUrl.hashCode() : 0);
        result = 31 * result + (trustedAlways != null ? trustedAlways.hashCode() : 0);
        result = 31 * result + (lastVisit != null ? lastVisit.hashCode() : 0);
        result = 31 * result + (visitCount != null ? visitCount.hashCode() : 0);
        result = 31 * result + (defaultProfileName != null ? defaultProfileName.hashCode() : 0);
        return result;
    }
}
