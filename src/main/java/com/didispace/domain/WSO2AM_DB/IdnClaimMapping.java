package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_CLAIM_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnClaimMapping {
    private int id;
    private int extClaimId;
    private int mappedLocalClaimId;
    private int tenantId;
    private IdnClaim idnClaimByExtClaimId;
    private IdnClaim idnClaimByMappedLocalClaimId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EXT_CLAIM_ID")
    public int getExtClaimId() {
        return extClaimId;
    }

    public void setExtClaimId(int extClaimId) {
        this.extClaimId = extClaimId;
    }

    @Basic
    @Column(name = "MAPPED_LOCAL_CLAIM_ID")
    public int getMappedLocalClaimId() {
        return mappedLocalClaimId;
    }

    public void setMappedLocalClaimId(int mappedLocalClaimId) {
        this.mappedLocalClaimId = mappedLocalClaimId;
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

        IdnClaimMapping that = (IdnClaimMapping) o;

        if (id != that.id) return false;
        if (extClaimId != that.extClaimId) return false;
        if (mappedLocalClaimId != that.mappedLocalClaimId) return false;
        if (tenantId != that.tenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + extClaimId;
        result = 31 * result + mappedLocalClaimId;
        result = 31 * result + tenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "EXT_CLAIM_ID", referencedColumnName = "ID", nullable = false)
    public IdnClaim getIdnClaimByExtClaimId() {
        return idnClaimByExtClaimId;
    }

    public void setIdnClaimByExtClaimId(IdnClaim idnClaimByExtClaimId) {
        this.idnClaimByExtClaimId = idnClaimByExtClaimId;
    }

    @ManyToOne
    @JoinColumn(name = "MAPPED_LOCAL_CLAIM_ID", referencedColumnName = "ID", nullable = false)
    public IdnClaim getIdnClaimByMappedLocalClaimId() {
        return idnClaimByMappedLocalClaimId;
    }

    public void setIdnClaimByMappedLocalClaimId(IdnClaim idnClaimByMappedLocalClaimId) {
        this.idnClaimByMappedLocalClaimId = idnClaimByMappedLocalClaimId;
    }
}
