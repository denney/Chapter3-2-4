package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_WORKFLOW", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class WfWorkflow {
    private String id;
    private String wfName;
    private String description;
    private String templateId;
    private String implId;
    private Integer tenantId;
    private Collection<WfWorkflowAssociation> wfWorkflowAssociationsById;
    private Collection<WfWorkflowConfigParam> wfWorkflowConfigParamsById;
    private Collection<WfWorkflowRequestRelation> wfWorkflowRequestRelationsById;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WF_NAME")
    public String getWfName() {
        return wfName;
    }

    public void setWfName(String wfName) {
        this.wfName = wfName;
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
    @Column(name = "TEMPLATE_ID")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "IMPL_ID")
    public String getImplId() {
        return implId;
    }

    public void setImplId(String implId) {
        this.implId = implId;
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

        WfWorkflow that = (WfWorkflow) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wfName != null ? !wfName.equals(that.wfName) : that.wfName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (implId != null ? !implId.equals(that.implId) : that.implId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (wfName != null ? wfName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (implId != null ? implId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "wfWorkflowByWorkflowId")
    public Collection<WfWorkflowAssociation> getWfWorkflowAssociationsById() {
        return wfWorkflowAssociationsById;
    }

    public void setWfWorkflowAssociationsById(Collection<WfWorkflowAssociation> wfWorkflowAssociationsById) {
        this.wfWorkflowAssociationsById = wfWorkflowAssociationsById;
    }

    @OneToMany(mappedBy = "wfWorkflowByWorkflowId")
    public Collection<WfWorkflowConfigParam> getWfWorkflowConfigParamsById() {
        return wfWorkflowConfigParamsById;
    }

    public void setWfWorkflowConfigParamsById(Collection<WfWorkflowConfigParam> wfWorkflowConfigParamsById) {
        this.wfWorkflowConfigParamsById = wfWorkflowConfigParamsById;
    }

    @OneToMany(mappedBy = "wfWorkflowByWorkflowId")
    public Collection<WfWorkflowRequestRelation> getWfWorkflowRequestRelationsById() {
        return wfWorkflowRequestRelationsById;
    }

    public void setWfWorkflowRequestRelationsById(Collection<WfWorkflowRequestRelation> wfWorkflowRequestRelationsById) {
        this.wfWorkflowRequestRelationsById = wfWorkflowRequestRelationsById;
    }
}
