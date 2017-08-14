package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_BUSINESS_OWNER", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmBusinessOwner {
    private int ownerId;
    private String ownerName;
    private String ownerEmail;
    private String ownerDesc;
    private String ownerSite;
    private Integer tenantId;

    @Id
    @Column(name = "OWNER_ID")
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "OWNER_NAME")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Basic
    @Column(name = "OWNER_EMAIL")
    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    @Basic
    @Column(name = "OWNER_DESC")
    public String getOwnerDesc() {
        return ownerDesc;
    }

    public void setOwnerDesc(String ownerDesc) {
        this.ownerDesc = ownerDesc;
    }

    @Basic
    @Column(name = "OWNER_SITE")
    public String getOwnerSite() {
        return ownerSite;
    }

    public void setOwnerSite(String ownerSite) {
        this.ownerSite = ownerSite;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmBusinessOwner that = (ApmBusinessOwner) o;

        if (ownerId != that.ownerId) return false;
        if (ownerName != null ? !ownerName.equals(that.ownerName) : that.ownerName != null) return false;
        if (ownerEmail != null ? !ownerEmail.equals(that.ownerEmail) : that.ownerEmail != null) return false;
        if (ownerDesc != null ? !ownerDesc.equals(that.ownerDesc) : that.ownerDesc != null) return false;
        if (ownerSite != null ? !ownerSite.equals(that.ownerSite) : that.ownerSite != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ownerId;
        result = 31 * result + (ownerName != null ? ownerName.hashCode() : 0);
        result = 31 * result + (ownerEmail != null ? ownerEmail.hashCode() : 0);
        result = 31 * result + (ownerDesc != null ? ownerDesc.hashCode() : 0);
        result = 31 * result + (ownerSite != null ? ownerSite.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
