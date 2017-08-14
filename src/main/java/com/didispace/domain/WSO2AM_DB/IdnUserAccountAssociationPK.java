package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class IdnUserAccountAssociationPK implements Serializable {
    private int tenantId;
    private String domainName;
    private String userName;

    @Column(name = "TENANT_ID")
    @Id
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name = "DOMAIN_NAME")
    @Id
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Column(name = "USER_NAME")
    @Id
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

        IdnUserAccountAssociationPK that = (IdnUserAccountAssociationPK) o;

        if (tenantId != that.tenantId) return false;
        if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tenantId;
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
