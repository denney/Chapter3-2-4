package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_PROVISIONING_CONFIG", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpProvisioningConfig {
    private int id;
    private Integer tenantId;
    private Integer idpId;
    private String provisioningConnectorType;
    private String isEnabled;
    private String isBlocking;
    private String isRulesEnabled;
    private Idp idpByIdpId;
    private Collection<IdpProvisioningEntity> idpProvisioningEntitiesById;
    private Collection<IdpProvConfigProperty> idpProvConfigPropertiesById;

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
    @Column(name = "IDP_ID")
    public Integer getIdpId() {
        return idpId;
    }

    public void setIdpId(Integer idpId) {
        this.idpId = idpId;
    }

    @Basic
    @Column(name = "PROVISIONING_CONNECTOR_TYPE")
    public String getProvisioningConnectorType() {
        return provisioningConnectorType;
    }

    public void setProvisioningConnectorType(String provisioningConnectorType) {
        this.provisioningConnectorType = provisioningConnectorType;
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
    @Column(name = "IS_BLOCKING")
    public String getIsBlocking() {
        return isBlocking;
    }

    public void setIsBlocking(String isBlocking) {
        this.isBlocking = isBlocking;
    }

    @Basic
    @Column(name = "IS_RULES_ENABLED")
    public String getIsRulesEnabled() {
        return isRulesEnabled;
    }

    public void setIsRulesEnabled(String isRulesEnabled) {
        this.isRulesEnabled = isRulesEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpProvisioningConfig that = (IdpProvisioningConfig) o;

        if (id != that.id) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (idpId != null ? !idpId.equals(that.idpId) : that.idpId != null) return false;
        if (provisioningConnectorType != null ? !provisioningConnectorType.equals(that.provisioningConnectorType) : that.provisioningConnectorType != null)
            return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;
        if (isBlocking != null ? !isBlocking.equals(that.isBlocking) : that.isBlocking != null) return false;
        if (isRulesEnabled != null ? !isRulesEnabled.equals(that.isRulesEnabled) : that.isRulesEnabled != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (idpId != null ? idpId.hashCode() : 0);
        result = 31 * result + (provisioningConnectorType != null ? provisioningConnectorType.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (isBlocking != null ? isBlocking.hashCode() : 0);
        result = 31 * result + (isRulesEnabled != null ? isRulesEnabled.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDP_ID", referencedColumnName = "ID")
    public Idp getIdpByIdpId() {
        return idpByIdpId;
    }

    public void setIdpByIdpId(Idp idpByIdpId) {
        this.idpByIdpId = idpByIdpId;
    }

    @OneToMany(mappedBy = "idpProvisioningConfigByProvisioningConfigId")
    public Collection<IdpProvisioningEntity> getIdpProvisioningEntitiesById() {
        return idpProvisioningEntitiesById;
    }

    public void setIdpProvisioningEntitiesById(Collection<IdpProvisioningEntity> idpProvisioningEntitiesById) {
        this.idpProvisioningEntitiesById = idpProvisioningEntitiesById;
    }

    @OneToMany(mappedBy = "idpProvisioningConfigByProvisioningConfigId")
    public Collection<IdpProvConfigProperty> getIdpProvConfigPropertiesById() {
        return idpProvConfigPropertiesById;
    }

    public void setIdpProvConfigPropertiesById(Collection<IdpProvConfigProperty> idpProvConfigPropertiesById) {
        this.idpProvConfigPropertiesById = idpProvConfigPropertiesById;
    }
}
