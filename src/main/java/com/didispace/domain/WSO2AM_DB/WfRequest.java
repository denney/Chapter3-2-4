package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_REQUEST", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class WfRequest {
    private String uuid;
    private String createdBy;
    private Integer tenantId;
    private String operationType;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String status;
    private byte[] request;
    private Collection<WfRequestEntityRelationship> wfRequestEntityRelationshipsByUuid;
    private Collection<WfWorkflowRequestRelation> wfWorkflowRequestRelationsByUuid;

    @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "CREATED_BY")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    @Column(name = "OPERATION_TYPE")
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Basic
    @Column(name = "CREATED_AT")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "UPDATED_AT")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "REQUEST")
    public byte[] getRequest() {
        return request;
    }

    public void setRequest(byte[] request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfRequest wfRequest = (WfRequest) o;

        if (uuid != null ? !uuid.equals(wfRequest.uuid) : wfRequest.uuid != null) return false;
        if (createdBy != null ? !createdBy.equals(wfRequest.createdBy) : wfRequest.createdBy != null) return false;
        if (tenantId != null ? !tenantId.equals(wfRequest.tenantId) : wfRequest.tenantId != null) return false;
        if (operationType != null ? !operationType.equals(wfRequest.operationType) : wfRequest.operationType != null)
            return false;
        if (createdAt != null ? !createdAt.equals(wfRequest.createdAt) : wfRequest.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(wfRequest.updatedAt) : wfRequest.updatedAt != null) return false;
        if (status != null ? !status.equals(wfRequest.status) : wfRequest.status != null) return false;
        if (!Arrays.equals(request, wfRequest.request)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (operationType != null ? operationType.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(request);
        return result;
    }

    @OneToMany(mappedBy = "wfRequestByRequestId")
    public Collection<WfRequestEntityRelationship> getWfRequestEntityRelationshipsByUuid() {
        return wfRequestEntityRelationshipsByUuid;
    }

    public void setWfRequestEntityRelationshipsByUuid(Collection<WfRequestEntityRelationship> wfRequestEntityRelationshipsByUuid) {
        this.wfRequestEntityRelationshipsByUuid = wfRequestEntityRelationshipsByUuid;
    }

    @OneToMany(mappedBy = "wfRequestByRequestId")
    public Collection<WfWorkflowRequestRelation> getWfWorkflowRequestRelationsByUuid() {
        return wfWorkflowRequestRelationsByUuid;
    }

    public void setWfWorkflowRequestRelationsByUuid(Collection<WfWorkflowRequestRelation> wfWorkflowRequestRelationsByUuid) {
        this.wfWorkflowRequestRelationsByUuid = wfWorkflowRequestRelationsByUuid;
    }
}
