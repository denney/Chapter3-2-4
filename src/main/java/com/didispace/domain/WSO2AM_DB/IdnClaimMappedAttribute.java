package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_CLAIM_MAPPED_ATTRIBUTE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnClaimMappedAttribute {
    private int id;
    private Integer localClaimId;
    private String userStoreDomainName;
    private String attributeName;
    private int tenantId;
    private IdnClaim idnClaimByLocalClaimId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOCAL_CLAIM_ID")
    public Integer getLocalClaimId() {
        return localClaimId;
    }

    public void setLocalClaimId(Integer localClaimId) {
        this.localClaimId = localClaimId;
    }

    @Basic
    @Column(name = "USER_STORE_DOMAIN_NAME")
    public String getUserStoreDomainName() {
        return userStoreDomainName;
    }

    public void setUserStoreDomainName(String userStoreDomainName) {
        this.userStoreDomainName = userStoreDomainName;
    }

    @Basic
    @Column(name = "ATTRIBUTE_NAME")
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
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

        IdnClaimMappedAttribute that = (IdnClaimMappedAttribute) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (localClaimId != null ? !localClaimId.equals(that.localClaimId) : that.localClaimId != null) return false;
        if (userStoreDomainName != null ? !userStoreDomainName.equals(that.userStoreDomainName) : that.userStoreDomainName != null)
            return false;
        if (attributeName != null ? !attributeName.equals(that.attributeName) : that.attributeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (localClaimId != null ? localClaimId.hashCode() : 0);
        result = 31 * result + (userStoreDomainName != null ? userStoreDomainName.hashCode() : 0);
        result = 31 * result + (attributeName != null ? attributeName.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "LOCAL_CLAIM_ID", referencedColumnName = "ID")
    public IdnClaim getIdnClaimByLocalClaimId() {
        return idnClaimByLocalClaimId;
    }

    public void setIdnClaimByLocalClaimId(IdnClaim idnClaimByLocalClaimId) {
        this.idnClaimByLocalClaimId = idnClaimByLocalClaimId;
    }
}
