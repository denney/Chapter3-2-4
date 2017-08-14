package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_CLAIM_DIALECT", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnClaimDialect {
    private int id;
    private String dialectUri;
    private int tenantId;
    private Collection<IdnClaim> idnClaimsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DIALECT_URI")
    public String getDialectUri() {
        return dialectUri;
    }

    public void setDialectUri(String dialectUri) {
        this.dialectUri = dialectUri;
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

        IdnClaimDialect that = (IdnClaimDialect) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (dialectUri != null ? !dialectUri.equals(that.dialectUri) : that.dialectUri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dialectUri != null ? dialectUri.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @OneToMany(mappedBy = "idnClaimDialectByDialectId")
    public Collection<IdnClaim> getIdnClaimsById() {
        return idnClaimsById;
    }

    public void setIdnClaimsById(Collection<IdnClaim> idnClaimsById) {
        this.idnClaimsById = idnClaimsById;
    }
}
