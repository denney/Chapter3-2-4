package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APPLICATION", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmApplication {
    private int applicationId;
    private String name;
    private String applicationTier;
    private String callbackUrl;
    private String description;
    private String applicationStatus;

    @Id
    @Column(name = "APPLICATION_ID")
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "APPLICATION_TIER")
    public String getApplicationTier() {
        return applicationTier;
    }

    public void setApplicationTier(String applicationTier) {
        this.applicationTier = applicationTier;
    }

    @Basic
    @Column(name = "CALLBACK_URL")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "APPLICATION_STATUS")
    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApplication that = (ApmApplication) o;

        if (applicationId != that.applicationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (applicationTier != null ? !applicationTier.equals(that.applicationTier) : that.applicationTier != null)
            return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (applicationStatus != null ? !applicationStatus.equals(that.applicationStatus) : that.applicationStatus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (applicationTier != null ? applicationTier.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (applicationStatus != null ? applicationStatus.hashCode() : 0);
        return result;
    }
}
