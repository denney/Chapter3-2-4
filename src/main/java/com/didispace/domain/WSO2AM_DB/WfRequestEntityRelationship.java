package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WF_REQUEST_ENTITY_RELATIONSHIP", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(WfRequestEntityRelationshipPK.class)
public class WfRequestEntityRelationship {
    private String requestId;
    private String entityName;
    private String entityType;
    private int tenantId;
    private WfRequest wfRequestByRequestId;

    @Id
    @Column(name = "REQUEST_ID")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Id
    @Column(name = "ENTITY_NAME")
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Id
    @Column(name = "ENTITY_TYPE")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
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

        WfRequestEntityRelationship that = (WfRequestEntityRelationship) o;

        if (tenantId != that.tenantId) return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requestId != null ? requestId.hashCode() : 0;
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "REQUEST_ID", referencedColumnName = "UUID", nullable = false)
    public WfRequest getWfRequestByRequestId() {
        return wfRequestByRequestId;
    }

    public void setWfRequestByRequestId(WfRequest wfRequestByRequestId) {
        this.wfRequestByRequestId = wfRequestByRequestId;
    }
}
