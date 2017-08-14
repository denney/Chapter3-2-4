package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_WORKFLOW_CONFIG_PARAM", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(WfWorkflowConfigParamPK.class)
public class WfWorkflowConfigParam {
    private String workflowId;
    private String paramName;
    private String paramValue;
    private String paramQname;
    private String paramHolder;
    private Integer tenantId;
    private WfWorkflow wfWorkflowByWorkflowId;

    @Id
    @Column(name = "WORKFLOW_ID")
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Id
    @Column(name = "PARAM_NAME")
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Basic
    @Column(name = "PARAM_VALUE")
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Id
    @Column(name = "PARAM_QNAME")
    public String getParamQname() {
        return paramQname;
    }

    public void setParamQname(String paramQname) {
        this.paramQname = paramQname;
    }

    @Id
    @Column(name = "PARAM_HOLDER")
    public String getParamHolder() {
        return paramHolder;
    }

    public void setParamHolder(String paramHolder) {
        this.paramHolder = paramHolder;
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

        WfWorkflowConfigParam that = (WfWorkflowConfigParam) o;

        if (workflowId != null ? !workflowId.equals(that.workflowId) : that.workflowId != null) return false;
        if (paramName != null ? !paramName.equals(that.paramName) : that.paramName != null) return false;
        if (paramValue != null ? !paramValue.equals(that.paramValue) : that.paramValue != null) return false;
        if (paramQname != null ? !paramQname.equals(that.paramQname) : that.paramQname != null) return false;
        if (paramHolder != null ? !paramHolder.equals(that.paramHolder) : that.paramHolder != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowId != null ? workflowId.hashCode() : 0;
        result = 31 * result + (paramName != null ? paramName.hashCode() : 0);
        result = 31 * result + (paramValue != null ? paramValue.hashCode() : 0);
        result = 31 * result + (paramQname != null ? paramQname.hashCode() : 0);
        result = 31 * result + (paramHolder != null ? paramHolder.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "ID", nullable = false)
    public WfWorkflow getWfWorkflowByWorkflowId() {
        return wfWorkflowByWorkflowId;
    }

    public void setWfWorkflowByWorkflowId(WfWorkflow wfWorkflowByWorkflowId) {
        this.wfWorkflowByWorkflowId = wfWorkflowByWorkflowId;
    }
}
