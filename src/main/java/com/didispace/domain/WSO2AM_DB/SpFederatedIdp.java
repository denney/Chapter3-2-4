package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_FEDERATED_IDP", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(SpFederatedIdpPK.class)
public class SpFederatedIdp {
    private int id;
    private int tenantId;
    private int authenticatorId;
    private SpAuthStep spAuthStepById;

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
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "AUTHENTICATOR_ID")
    public int getAuthenticatorId() {
        return authenticatorId;
    }

    public void setAuthenticatorId(int authenticatorId) {
        this.authenticatorId = authenticatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpFederatedIdp that = (SpFederatedIdp) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (authenticatorId != that.authenticatorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + authenticatorId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    public SpAuthStep getSpAuthStepById() {
        return spAuthStepById;
    }

    public void setSpAuthStepById(SpAuthStep spAuthStepById) {
        this.spAuthStepById = spAuthStepById;
    }
}
