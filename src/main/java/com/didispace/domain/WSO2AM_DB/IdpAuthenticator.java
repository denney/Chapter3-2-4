package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_AUTHENTICATOR", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpAuthenticator {
    private int id;
    private Integer tenantId;
    private Integer idpId;
    private String name;
    private String isEnabled;
    private String displayName;
    private Idp idpByIdpId;
    private Collection<IdpAuthenticatorProperty> idpAuthenticatorPropertiesById;

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

        IdpAuthenticator that = (IdpAuthenticator) o;

        if (id != that.id) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (idpId != null ? !idpId.equals(that.idpId) : that.idpId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (idpId != null ? idpId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
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

    @OneToMany(mappedBy = "idpAuthenticatorByAuthenticatorId")
    public Collection<IdpAuthenticatorProperty> getIdpAuthenticatorPropertiesById() {
        return idpAuthenticatorPropertiesById;
    }

    public void setIdpAuthenticatorPropertiesById(Collection<IdpAuthenticatorProperty> idpAuthenticatorPropertiesById) {
        this.idpAuthenticatorPropertiesById = idpAuthenticatorPropertiesById;
    }
}
