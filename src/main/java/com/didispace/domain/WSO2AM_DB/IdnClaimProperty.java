package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_CLAIM_PROPERTY", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnClaimProperty {
    private int id;
    private Integer localClaimId;
    private String propertyName;
    private String propertyValue;
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
    @Column(name = "PROPERTY_NAME")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
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

        IdnClaimProperty that = (IdnClaimProperty) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (localClaimId != null ? !localClaimId.equals(that.localClaimId) : that.localClaimId != null) return false;
        if (propertyName != null ? !propertyName.equals(that.propertyName) : that.propertyName != null) return false;
        if (propertyValue != null ? !propertyValue.equals(that.propertyValue) : that.propertyValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (localClaimId != null ? localClaimId.hashCode() : 0);
        result = 31 * result + (propertyName != null ? propertyName.hashCode() : 0);
        result = 31 * result + (propertyValue != null ? propertyValue.hashCode() : 0);
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
