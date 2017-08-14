package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_USER_ACCOUNT_ASSOCIATION", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnUserAccountAssociationPK.class)
public class IdnUserAccountAssociation {
    private String associationKey;
    private int tenantId;
    private String domainName;
    private String userName;

    @Basic
    @Column(name = "ASSOCIATION_KEY")
    public String getAssociationKey() {
        return associationKey;
    }

    public void setAssociationKey(String associationKey) {
        this.associationKey = associationKey;
    }

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "DOMAIN_NAME")
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnUserAccountAssociation that = (IdnUserAccountAssociation) o;

        if (tenantId != that.tenantId) return false;
        if (associationKey != null ? !associationKey.equals(that.associationKey) : that.associationKey != null)
            return false;
        if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = associationKey != null ? associationKey.hashCode() : 0;
        result = 31 * result + tenantId;
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
