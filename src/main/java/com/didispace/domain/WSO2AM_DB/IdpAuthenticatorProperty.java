package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_AUTHENTICATOR_PROPERTY", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpAuthenticatorProperty {
    private int id;
    private Integer tenantId;
    private Integer authenticatorId;
    private String propertyKey;
    private String propertyValue;
    private String isSecret;
    private IdpAuthenticator idpAuthenticatorByAuthenticatorId;

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
    @Column(name = "AUTHENTICATOR_ID")
    public Integer getAuthenticatorId() {
        return authenticatorId;
    }

    public void setAuthenticatorId(Integer authenticatorId) {
        this.authenticatorId = authenticatorId;
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

        IdpAuthenticatorProperty that = (IdpAuthenticatorProperty) o;

        if (id != that.id) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (authenticatorId != null ? !authenticatorId.equals(that.authenticatorId) : that.authenticatorId != null)
            return false;
        if (propertyKey != null ? !propertyKey.equals(that.propertyKey) : that.propertyKey != null) return false;
        if (propertyValue != null ? !propertyValue.equals(that.propertyValue) : that.propertyValue != null)
            return false;
        if (isSecret != null ? !isSecret.equals(that.isSecret) : that.isSecret != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (authenticatorId != null ? authenticatorId.hashCode() : 0);
        result = 31 * result + (propertyKey != null ? propertyKey.hashCode() : 0);
        result = 31 * result + (propertyValue != null ? propertyValue.hashCode() : 0);
        result = 31 * result + (isSecret != null ? isSecret.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "AUTHENTICATOR_ID", referencedColumnName = "ID")
    public IdpAuthenticator getIdpAuthenticatorByAuthenticatorId() {
        return idpAuthenticatorByAuthenticatorId;
    }

    public void setIdpAuthenticatorByAuthenticatorId(IdpAuthenticator idpAuthenticatorByAuthenticatorId) {
        this.idpAuthenticatorByAuthenticatorId = idpAuthenticatorByAuthenticatorId;
    }
}
