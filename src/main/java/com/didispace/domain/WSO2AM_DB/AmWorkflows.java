package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_WORKFLOWS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmWorkflows {
    private int wfId;
    private String wfReference;
    private String wfType;
    private String wfStatus;
    private Timestamp wfCreatedTime;
    private Timestamp wfUpdatedTime;
    private String wfStatusDesc;
    private Integer tenantId;
    private String tenantDomain;
    private String wfExternalReference;

    @Id
    @Column(name = "WF_ID")
    public int getWfId() {
        return wfId;
    }

    public void setWfId(int wfId) {
        this.wfId = wfId;
    }

    @Basic
    @Column(name = "WF_REFERENCE")
    public String getWfReference() {
        return wfReference;
    }

    public void setWfReference(String wfReference) {
        this.wfReference = wfReference;
    }

    @Basic
    @Column(name = "WF_TYPE")
    public String getWfType() {
        return wfType;
    }

    public void setWfType(String wfType) {
        this.wfType = wfType;
    }

    @Basic
    @Column(name = "WF_STATUS")
    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

    @Basic
    @Column(name = "WF_CREATED_TIME")
    public Timestamp getWfCreatedTime() {
        return wfCreatedTime;
    }

    public void setWfCreatedTime(Timestamp wfCreatedTime) {
        this.wfCreatedTime = wfCreatedTime;
    }

    @Basic
    @Column(name = "WF_UPDATED_TIME")
    public Timestamp getWfUpdatedTime() {
        return wfUpdatedTime;
    }

    public void setWfUpdatedTime(Timestamp wfUpdatedTime) {
        this.wfUpdatedTime = wfUpdatedTime;
    }

    @Basic
    @Column(name = "WF_STATUS_DESC")
    public String getWfStatusDesc() {
        return wfStatusDesc;
    }

    public void setWfStatusDesc(String wfStatusDesc) {
        this.wfStatusDesc = wfStatusDesc;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
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
    @Column(name = "WF_EXTERNAL_REFERENCE")
    public String getWfExternalReference() {
        return wfExternalReference;
    }

    public void setWfExternalReference(String wfExternalReference) {
        this.wfExternalReference = wfExternalReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmWorkflows that = (AmWorkflows) o;

        if (wfId != that.wfId) return false;
        if (wfReference != null ? !wfReference.equals(that.wfReference) : that.wfReference != null) return false;
        if (wfType != null ? !wfType.equals(that.wfType) : that.wfType != null) return false;
        if (wfStatus != null ? !wfStatus.equals(that.wfStatus) : that.wfStatus != null) return false;
        if (wfCreatedTime != null ? !wfCreatedTime.equals(that.wfCreatedTime) : that.wfCreatedTime != null)
            return false;
        if (wfUpdatedTime != null ? !wfUpdatedTime.equals(that.wfUpdatedTime) : that.wfUpdatedTime != null)
            return false;
        if (wfStatusDesc != null ? !wfStatusDesc.equals(that.wfStatusDesc) : that.wfStatusDesc != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;
        if (wfExternalReference != null ? !wfExternalReference.equals(that.wfExternalReference) : that.wfExternalReference != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfId;
        result = 31 * result + (wfReference != null ? wfReference.hashCode() : 0);
        result = 31 * result + (wfType != null ? wfType.hashCode() : 0);
        result = 31 * result + (wfStatus != null ? wfStatus.hashCode() : 0);
        result = 31 * result + (wfCreatedTime != null ? wfCreatedTime.hashCode() : 0);
        result = 31 * result + (wfUpdatedTime != null ? wfUpdatedTime.hashCode() : 0);
        result = 31 * result + (wfStatusDesc != null ? wfStatusDesc.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        result = 31 * result + (wfExternalReference != null ? wfExternalReference.hashCode() : 0);
        return result;
    }
}
