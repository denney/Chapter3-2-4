package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_CLAIM", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnClaim {
    private int id;
    private Integer dialectId;
    private String claimUri;
    private int tenantId;
    private IdnClaimDialect idnClaimDialectByDialectId;
    private Collection<IdnClaimMappedAttribute> idnClaimMappedAttributesById;
    private Collection<IdnClaimMapping> idnClaimMappingsById;
    private Collection<IdnClaimMapping> idnClaimMappingsById_0;
    private Collection<IdnClaimProperty> idnClaimPropertiesById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DIALECT_ID")
    public Integer getDialectId() {
        return dialectId;
    }

    public void setDialectId(Integer dialectId) {
        this.dialectId = dialectId;
    }

    @Basic
    @Column(name = "CLAIM_URI")
    public String getClaimUri() {
        return claimUri;
    }

    public void setClaimUri(String claimUri) {
        this.claimUri = claimUri;
    }

    @Basic
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

        IdnClaim idnClaim = (IdnClaim) o;

        if (id != idnClaim.id) return false;
        if (tenantId != idnClaim.tenantId) return false;
        if (dialectId != null ? !dialectId.equals(idnClaim.dialectId) : idnClaim.dialectId != null) return false;
        if (claimUri != null ? !claimUri.equals(idnClaim.claimUri) : idnClaim.claimUri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dialectId != null ? dialectId.hashCode() : 0);
        result = 31 * result + (claimUri != null ? claimUri.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DIALECT_ID", referencedColumnName = "ID")
    public IdnClaimDialect getIdnClaimDialectByDialectId() {
        return idnClaimDialectByDialectId;
    }

    public void setIdnClaimDialectByDialectId(IdnClaimDialect idnClaimDialectByDialectId) {
        this.idnClaimDialectByDialectId = idnClaimDialectByDialectId;
    }

    @OneToMany(mappedBy = "idnClaimByLocalClaimId")
    public Collection<IdnClaimMappedAttribute> getIdnClaimMappedAttributesById() {
        return idnClaimMappedAttributesById;
    }

    public void setIdnClaimMappedAttributesById(Collection<IdnClaimMappedAttribute> idnClaimMappedAttributesById) {
        this.idnClaimMappedAttributesById = idnClaimMappedAttributesById;
    }

    @OneToMany(mappedBy = "idnClaimByExtClaimId")
    public Collection<IdnClaimMapping> getIdnClaimMappingsById() {
        return idnClaimMappingsById;
    }

    public void setIdnClaimMappingsById(Collection<IdnClaimMapping> idnClaimMappingsById) {
        this.idnClaimMappingsById = idnClaimMappingsById;
    }

    @OneToMany(mappedBy = "idnClaimByMappedLocalClaimId")
    public Collection<IdnClaimMapping> getIdnClaimMappingsById_0() {
        return idnClaimMappingsById_0;
    }

    public void setIdnClaimMappingsById_0(Collection<IdnClaimMapping> idnClaimMappingsById_0) {
        this.idnClaimMappingsById_0 = idnClaimMappingsById_0;
    }

    @OneToMany(mappedBy = "idnClaimByLocalClaimId")
    public Collection<IdnClaimProperty> getIdnClaimPropertiesById() {
        return idnClaimPropertiesById;
    }

    public void setIdnClaimPropertiesById(Collection<IdnClaimProperty> idnClaimPropertiesById) {
        this.idnClaimPropertiesById = idnClaimPropertiesById;
    }
}
