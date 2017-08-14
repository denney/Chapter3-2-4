package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_CLAIM", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpClaim {
    private int id;
    private Integer idpId;
    private Integer tenantId;
    private String claim;
    private Idp idpByIdpId;
    private Collection<IdpClaimMapping> idpClaimMappingsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "CLAIM")
    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpClaim idpClaim = (IdpClaim) o;

        if (id != idpClaim.id) return false;
        if (idpId != null ? !idpId.equals(idpClaim.idpId) : idpClaim.idpId != null) return false;
        if (tenantId != null ? !tenantId.equals(idpClaim.tenantId) : idpClaim.tenantId != null) return false;
        if (claim != null ? !claim.equals(idpClaim.claim) : idpClaim.claim != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idpId != null ? idpId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (claim != null ? claim.hashCode() : 0);
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

    @OneToMany(mappedBy = "idpClaimByIdpClaimId")
    public Collection<IdpClaimMapping> getIdpClaimMappingsById() {
        return idpClaimMappingsById;
    }

    public void setIdpClaimMappingsById(Collection<IdpClaimMapping> idpClaimMappingsById) {
        this.idpClaimMappingsById = idpClaimMappingsById;
    }
}
