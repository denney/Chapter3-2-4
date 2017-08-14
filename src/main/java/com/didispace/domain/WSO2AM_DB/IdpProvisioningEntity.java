package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_PROVISIONING_ENTITY", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpProvisioningEntity {
    private int id;
    private Integer provisioningConfigId;
    private String entityType;
    private String entityLocalUserstore;
    private String entityName;
    private String entityValue;
    private Integer tenantId;
    private String entityLocalId;
    private IdpProvisioningConfig idpProvisioningConfigByProvisioningConfigId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PROVISIONING_CONFIG_ID")
    public Integer getProvisioningConfigId() {
        return provisioningConfigId;
    }

    public void setProvisioningConfigId(Integer provisioningConfigId) {
        this.provisioningConfigId = provisioningConfigId;
    }

    @Basic
    @Column(name = "ENTITY_TYPE")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "ENTITY_LOCAL_USERSTORE")
    public String getEntityLocalUserstore() {
        return entityLocalUserstore;
    }

    public void setEntityLocalUserstore(String entityLocalUserstore) {
        this.entityLocalUserstore = entityLocalUserstore;
    }

    @Basic
    @Column(name = "ENTITY_NAME")
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Basic
    @Column(name = "ENTITY_VALUE")
    public String getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
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
    @Column(name = "ENTITY_LOCAL_ID")
    public String getEntityLocalId() {
        return entityLocalId;
    }

    public void setEntityLocalId(String entityLocalId) {
        this.entityLocalId = entityLocalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpProvisioningEntity that = (IdpProvisioningEntity) o;

        if (id != that.id) return false;
        if (provisioningConfigId != null ? !provisioningConfigId.equals(that.provisioningConfigId) : that.provisioningConfigId != null)
            return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
        if (entityLocalUserstore != null ? !entityLocalUserstore.equals(that.entityLocalUserstore) : that.entityLocalUserstore != null)
            return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;
        if (entityValue != null ? !entityValue.equals(that.entityValue) : that.entityValue != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (entityLocalId != null ? !entityLocalId.equals(that.entityLocalId) : that.entityLocalId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provisioningConfigId != null ? provisioningConfigId.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (entityLocalUserstore != null ? entityLocalUserstore.hashCode() : 0);
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (entityValue != null ? entityValue.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (entityLocalId != null ? entityLocalId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PROVISIONING_CONFIG_ID", referencedColumnName = "ID")
    public IdpProvisioningConfig getIdpProvisioningConfigByProvisioningConfigId() {
        return idpProvisioningConfigByProvisioningConfigId;
    }

    public void setIdpProvisioningConfigByProvisioningConfigId(IdpProvisioningConfig idpProvisioningConfigByProvisioningConfigId) {
        this.idpProvisioningConfigByProvisioningConfigId = idpProvisioningConfigByProvisioningConfigId;
    }
}
