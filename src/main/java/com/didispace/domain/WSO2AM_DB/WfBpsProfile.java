package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_BPS_PROFILE", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(WfBpsProfilePK.class)
public class WfBpsProfile {
    private String profileName;
    private String hostUrlManager;
    private String hostUrlWorker;
    private String username;
    private String password;
    private String callbackHost;
    private int tenantId;

    @Id
    @Column(name = "PROFILE_NAME")
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Basic
    @Column(name = "HOST_URL_MANAGER")
    public String getHostUrlManager() {
        return hostUrlManager;
    }

    public void setHostUrlManager(String hostUrlManager) {
        this.hostUrlManager = hostUrlManager;
    }

    @Basic
    @Column(name = "HOST_URL_WORKER")
    public String getHostUrlWorker() {
        return hostUrlWorker;
    }

    public void setHostUrlWorker(String hostUrlWorker) {
        this.hostUrlWorker = hostUrlWorker;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "CALLBACK_HOST")
    public String getCallbackHost() {
        return callbackHost;
    }

    public void setCallbackHost(String callbackHost) {
        this.callbackHost = callbackHost;
    }

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfBpsProfile that = (WfBpsProfile) o;

        if (tenantId != that.tenantId) return false;
        if (profileName != null ? !profileName.equals(that.profileName) : that.profileName != null) return false;
        if (hostUrlManager != null ? !hostUrlManager.equals(that.hostUrlManager) : that.hostUrlManager != null)
            return false;
        if (hostUrlWorker != null ? !hostUrlWorker.equals(that.hostUrlWorker) : that.hostUrlWorker != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (callbackHost != null ? !callbackHost.equals(that.callbackHost) : that.callbackHost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = profileName != null ? profileName.hashCode() : 0;
        result = 31 * result + (hostUrlManager != null ? hostUrlManager.hashCode() : 0);
        result = 31 * result + (hostUrlWorker != null ? hostUrlWorker.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (callbackHost != null ? callbackHost.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }
}
