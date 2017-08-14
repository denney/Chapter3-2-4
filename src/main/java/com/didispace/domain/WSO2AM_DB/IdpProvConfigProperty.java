package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_PROV_CONFIG_PROPERTY", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpProvConfigProperty {
    private int id;
    private Integer tenantId;
    private Integer provisioningConfigId;
    private String propertyKey;
    private String propertyValue;
    private byte[] propertyBlobValue;
    private String propertyType;
    private String isSecret;
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
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
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
    @Column(name = "PROPERTY_KEY")
    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    @Basic
    @Column(name = "PROPERTY_VALUE")
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Basic
    @Column(name = "PROPERTY_BLOB_VALUE")
    public byte[] getPropertyBlobValue() {
        return propertyBlobValue;
    }

    public void setPropertyBlobValue(byte[] propertyBlobValue) {
        this.propertyBlobValue = propertyBlobValue;
    }

    @Basic
    @Column(name = "PROPERTY_TYPE")
    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Basic
    @Column(name = "IS_SECRET")
    public String getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(String isSecret) {
        this.isSecret = isSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpProvConfigProperty that = (IdpProvConfigProperty) o;

        if (id != that.id) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (provisioningConfigId != null ? !provisioningConfigId.equals(that.provisioningConfigId) : that.provisioningConfigId != null)
            return false;
        if (propertyKey != null ? !propertyKey.equals(that.propertyKey) : that.propertyKey != null) return false;
        if (propertyValue != null ? !propertyValue.equals(that.propertyValue) : that.propertyValue != null)
            return false;
        if (!Arrays.equals(propertyBlobValue, that.propertyBlobValue)) return false;
        if (propertyType != null ? !propertyType.equals(that.propertyType) : that.propertyType != null) return false;
        if (isSecret != null ? !isSecret.equals(that.isSecret) : that.isSecret != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (provisioningConfigId != null ? provisioningConfigId.hashCode() : 0);
        result = 31 * result + (propertyKey != null ? propertyKey.hashCode() : 0);
        result = 31 * result + (propertyValue != null ? propertyValue.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(propertyBlobValue);
        result = 31 * result + (propertyType != null ? propertyType.hashCode() : 0);
        result = 31 * result + (isSecret != null ? isSecret.hashCode() : 0);
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
