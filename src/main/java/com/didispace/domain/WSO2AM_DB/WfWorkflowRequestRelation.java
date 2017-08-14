package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_WORKFLOW_REQUEST_RELATION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class WfWorkflowRequestRelation {
    private String relationshipId;
    private String workflowId;
    private String requestId;
    private Timestamp updatedAt;
    private String status;
    private Integer tenantId;
    private WfWorkflow wfWorkflowByWorkflowId;
    private WfRequest wfRequestByRequestId;

    @Id
    @Column(name = "RELATIONSHIP_ID")
    public String getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
    }

    @Basic
    @Column(name = "WORKFLOW_ID")
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Basic
    @Column(name = "REQUEST_ID")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

        WfWorkflowRequestRelation that = (WfWorkflowRequestRelation) o;

        if (relationshipId != null ? !relationshipId.equals(that.relationshipId) : that.relationshipId != null)
            return false;
        if (workflowId != null ? !workflowId.equals(that.workflowId) : that.workflowId != null) return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relationshipId != null ? relationshipId.hashCode() : 0;
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "ID")
    public WfWorkflow getWfWorkflowByWorkflowId() {
        return wfWorkflowByWorkflowId;
    }

    public void setWfWorkflowByWorkflowId(WfWorkflow wfWorkflowByWorkflowId) {
        this.wfWorkflowByWorkflowId = wfWorkflowByWorkflowId;
    }

    @ManyToOne
    @JoinColumn(name = "REQUEST_ID", referencedColumnName = "UUID")
    public WfRequest getWfRequestByRequestId() {
        return wfRequestByRequestId;
    }

    public void setWfRequestByRequestId(WfRequest wfRequestByRequestId) {
        this.wfRequestByRequestId = wfRequestByRequestId;
    }
}
