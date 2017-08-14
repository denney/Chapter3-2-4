package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_WORKFLOW_ASSOCIATION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class WfWorkflowAssociation {
    private int id;
    private String assocName;
    private String eventId;
    private String assocCondition;
    private String workflowId;
    private String isEnabled;
    private Integer tenantId;
    private WfWorkflow wfWorkflowByWorkflowId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ASSOC_NAME")
    public String getAssocName() {
        return assocName;
    }

    public void setAssocName(String assocName) {
        this.assocName = assocName;
    }

    @Basic
    @Column(name = "EVENT_ID")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "ASSOC_CONDITION")
    public String getAssocCondition() {
        return assocCondition;
    }

    public void setAssocCondition(String assocCondition) {
        this.assocCondition = assocCondition;
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
    @Column(name = "IS_ENABLED")
    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
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

        WfWorkflowAssociation that = (WfWorkflowAssociation) o;

        if (id != that.id) return false;
        if (assocName != null ? !assocName.equals(that.assocName) : that.assocName != null) return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;
        if (assocCondition != null ? !assocCondition.equals(that.assocCondition) : that.assocCondition != null)
            return false;
        if (workflowId != null ? !workflowId.equals(that.workflowId) : that.workflowId != null) return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (assocName != null ? assocName.hashCode() : 0);
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        result = 31 * result + (assocCondition != null ? assocCondition.hashCode() : 0);
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
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
}
