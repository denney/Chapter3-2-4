package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class WfWorkflowConfigParamPK implements Serializable {
    private String workflowId;
    private String paramName;
    private String paramQname;
    private String paramHolder;

    @Column(name = "WORKFLOW_ID")
    @Id
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Column(name = "PARAM_NAME")
    @Id
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Column(name = "PARAM_QNAME")
    @Id
    public String getParamQname() {
        return paramQname;
    }

    public void setParamQname(String paramQname) {
        this.paramQname = paramQname;
    }

    @Column(name = "PARAM_HOLDER")
    @Id
    public String getParamHolder() {
        return paramHolder;
    }

    public void setParamHolder(String paramHolder) {
        this.paramHolder = paramHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfWorkflowConfigParamPK that = (WfWorkflowConfigParamPK) o;

        if (workflowId != null ? !workflowId.equals(that.workflowId) : that.workflowId != null) return false;
        if (paramName != null ? !paramName.equals(that.paramName) : that.paramName != null) return false;
        if (paramQname != null ? !paramQname.equals(that.paramQname) : that.paramQname != null) return false;
        if (paramHolder != null ? !paramHolder.equals(that.paramHolder) : that.paramHolder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workflowId != null ? workflowId.hashCode() : 0;
        result = 31 * result + (paramName != null ? paramName.hashCode() : 0);
        result = 31 * result + (paramQname != null ? paramQname.hashCode() : 0);
        result = 31 * result + (paramHolder != null ? paramHolder.hashCode() : 0);
        return result;
    }
}
