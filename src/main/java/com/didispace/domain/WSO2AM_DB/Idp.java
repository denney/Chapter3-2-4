package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
public class Idp {
    private int id;
    private Integer tenantId;
    private String name;
    private String isEnabled;
    private String isPrimary;
    private String homeRealmId;
    private byte[] image;
    private byte[] certificate;
    private String alias;
    private String inboundProvEnabled;
    private String inboundProvUserStoreId;
    private String userClaimUri;
    private String roleClaimUri;
    private String description;
    private String defaultAuthenticatorName;
    private String defaultProConnectorName;
    private String provisioningRole;
    private String isFederationHub;
    private String isLocalClaimDialect;
    private String displayName;
    private Collection<IdnAssociatedId> idnAssociatedIdsById;
    private Collection<IdpAuthenticator> idpAuthenticatorsById;
    private Collection<IdpClaim> idpClaimsById;
    private Collection<IdpLocalClaim> idpLocalClaimsById;
    private Collection<IdpMetadata> idpMetadataById;
    private Collection<IdpProvisioningConfig> idpProvisioningConfigsById;
    private Collection<IdpRole> idpRolesById;

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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "IS_PRIMARY")
    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    @Basic
    @Column(name = "HOME_REALM_ID")
    public String getHomeRealmId() {
        return homeRealmId;
    }

    public void setHomeRealmId(String homeRealmId) {
        this.homeRealmId = homeRealmId;
    }

    @Basic
    @Column(name = "IMAGE")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "CERTIFICATE")
    public byte[] getCertificate() {
        return certificate;
    }

    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    @Basic
    @Column(name = "ALIAS")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "INBOUND_PROV_ENABLED")
    public String getInboundProvEnabled() {
        return inboundProvEnabled;
    }

    public void setInboundProvEnabled(String inboundProvEnabled) {
        this.inboundProvEnabled = inboundProvEnabled;
    }

    @Basic
    @Column(name = "INBOUND_PROV_USER_STORE_ID")
    public String getInboundProvUserStoreId() {
        return inboundProvUserStoreId;
    }

    public void setInboundProvUserStoreId(String inboundProvUserStoreId) {
        this.inboundProvUserStoreId = inboundProvUserStoreId;
    }

    @Basic
    @Column(name = "USER_CLAIM_URI")
    public String getUserClaimUri() {
        return userClaimUri;
    }

    public void setUserClaimUri(String userClaimUri) {
        this.userClaimUri = userClaimUri;
    }

    @Basic
    @Column(name = "ROLE_CLAIM_URI")
    public String getRoleClaimUri() {
        return roleClaimUri;
    }

    public void setRoleClaimUri(String roleClaimUri) {
        this.roleClaimUri = roleClaimUri;
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
    @Column(name = "DEFAULT_AUTHENTICATOR_NAME")
    public String getDefaultAuthenticatorName() {
        return defaultAuthenticatorName;
    }

    public void setDefaultAuthenticatorName(String defaultAuthenticatorName) {
        this.defaultAuthenticatorName = defaultAuthenticatorName;
    }

    @Basic
    @Column(name = "DEFAULT_PRO_CONNECTOR_NAME")
    public String getDefaultProConnectorName() {
        return defaultProConnectorName;
    }

    public void setDefaultProConnectorName(String defaultProConnectorName) {
        this.defaultProConnectorName = defaultProConnectorName;
    }

    @Basic
    @Column(name = "PROVISIONING_ROLE")
    public String getProvisioningRole() {
        return provisioningRole;
    }

    public void setProvisioningRole(String provisioningRole) {
        this.provisioningRole = provisioningRole;
    }

    @Basic
    @Column(name = "IS_FEDERATION_HUB")
    public String getIsFederationHub() {
        return isFederationHub;
    }

    public void setIsFederationHub(String isFederationHub) {
        this.isFederationHub = isFederationHub;
    }

    @Basic
    @Column(name = "IS_LOCAL_CLAIM_DIALECT")
    public String getIsLocalClaimDialect() {
        return isLocalClaimDialect;
    }

    public void setIsLocalClaimDialect(String isLocalClaimDialect) {
        this.isLocalClaimDialect = isLocalClaimDialect;
    }

    @Basic
    @Column(name = "DISPLAY_NAME")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idp idp = (Idp) o;

        if (id != idp.id) return false;
        if (tenantId != null ? !tenantId.equals(idp.tenantId) : idp.tenantId != null) return false;
        if (name != null ? !name.equals(idp.name) : idp.name != null) return false;
        if (isEnabled != null ? !isEnabled.equals(idp.isEnabled) : idp.isEnabled != null) return false;
        if (isPrimary != null ? !isPrimary.equals(idp.isPrimary) : idp.isPrimary != null) return false;
        if (homeRealmId != null ? !homeRealmId.equals(idp.homeRealmId) : idp.homeRealmId != null) return false;
        if (!Arrays.equals(image, idp.image)) return false;
        if (!Arrays.equals(certificate, idp.certificate)) return false;
        if (alias != null ? !alias.equals(idp.alias) : idp.alias != null) return false;
        if (inboundProvEnabled != null ? !inboundProvEnabled.equals(idp.inboundProvEnabled) : idp.inboundProvEnabled != null)
            return false;
        if (inboundProvUserStoreId != null ? !inboundProvUserStoreId.equals(idp.inboundProvUserStoreId) : idp.inboundProvUserStoreId != null)
            return false;
        if (userClaimUri != null ? !userClaimUri.equals(idp.userClaimUri) : idp.userClaimUri != null) return false;
        if (roleClaimUri != null ? !roleClaimUri.equals(idp.roleClaimUri) : idp.roleClaimUri != null) return false;
        if (description != null ? !description.equals(idp.description) : idp.description != null) return false;
        if (defaultAuthenticatorName != null ? !defaultAuthenticatorName.equals(idp.defaultAuthenticatorName) : idp.defaultAuthenticatorName != null)
            return false;
        if (defaultProConnectorName != null ? !defaultProConnectorName.equals(idp.defaultProConnectorName) : idp.defaultProConnectorName != null)
            return false;
        if (provisioningRole != null ? !provisioningRole.equals(idp.provisioningRole) : idp.provisioningRole != null)
            return false;
        if (isFederationHub != null ? !isFederationHub.equals(idp.isFederationHub) : idp.isFederationHub != null)
            return false;
        if (isLocalClaimDialect != null ? !isLocalClaimDialect.equals(idp.isLocalClaimDialect) : idp.isLocalClaimDialect != null)
            return false;
        if (displayName != null ? !displayName.equals(idp.displayName) : idp.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (isPrimary != null ? isPrimary.hashCode() : 0);
        result = 31 * result + (homeRealmId != null ? homeRealmId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + Arrays.hashCode(certificate);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (inboundProvEnabled != null ? inboundProvEnabled.hashCode() : 0);
        result = 31 * result + (inboundProvUserStoreId != null ? inboundProvUserStoreId.hashCode() : 0);
        result = 31 * result + (userClaimUri != null ? userClaimUri.hashCode() : 0);
        result = 31 * result + (roleClaimUri != null ? roleClaimUri.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (defaultAuthenticatorName != null ? defaultAuthenticatorName.hashCode() : 0);
        result = 31 * result + (defaultProConnectorName != null ? defaultProConnectorName.hashCode() : 0);
        result = 31 * result + (provisioningRole != null ? provisioningRole.hashCode() : 0);
        result = 31 * result + (isFederationHub != null ? isFederationHub.hashCode() : 0);
        result = 31 * result + (isLocalClaimDialect != null ? isLocalClaimDialect.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdnAssociatedId> getIdnAssociatedIdsById() {
        return idnAssociatedIdsById;
    }

    public void setIdnAssociatedIdsById(Collection<IdnAssociatedId> idnAssociatedIdsById) {
        this.idnAssociatedIdsById = idnAssociatedIdsById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpAuthenticator> getIdpAuthenticatorsById() {
        return idpAuthenticatorsById;
    }

    public void setIdpAuthenticatorsById(Collection<IdpAuthenticator> idpAuthenticatorsById) {
        this.idpAuthenticatorsById = idpAuthenticatorsById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpClaim> getIdpClaimsById() {
        return idpClaimsById;
    }

    public void setIdpClaimsById(Collection<IdpClaim> idpClaimsById) {
        this.idpClaimsById = idpClaimsById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpLocalClaim> getIdpLocalClaimsById() {
        return idpLocalClaimsById;
    }

    public void setIdpLocalClaimsById(Collection<IdpLocalClaim> idpLocalClaimsById) {
        this.idpLocalClaimsById = idpLocalClaimsById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpMetadata> getIdpMetadataById() {
        return idpMetadataById;
    }

    public void setIdpMetadataById(Collection<IdpMetadata> idpMetadataById) {
        this.idpMetadataById = idpMetadataById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpProvisioningConfig> getIdpProvisioningConfigsById() {
        return idpProvisioningConfigsById;
    }

    public void setIdpProvisioningConfigsById(Collection<IdpProvisioningConfig> idpProvisioningConfigsById) {
        this.idpProvisioningConfigsById = idpProvisioningConfigsById;
    }

    @OneToMany(mappedBy = "idpByIdpId")
    public Collection<IdpRole> getIdpRolesById() {
        return idpRolesById;
    }

    public void setIdpRolesById(Collection<IdpRole> idpRolesById) {
        this.idpRolesById = idpRolesById;
    }
}
