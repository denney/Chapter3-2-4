package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_ASSOCIATED_ID", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnAssociatedId {
    private int id;
    private String idpUserId;
    private Integer tenantId;
    private int idpId;
    private String domainName;
    private String userName;
    private Idp idpByIdpId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDP_USER_ID")
    public String getIdpUserId() {
        return idpUserId;
    }

    public void setIdpUserId(String idpUserId) {
        this.idpUserId = idpUserId;
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
    @Column(name = "IDP_ID")
    public int getIdpId() {
        return idpId;
    }

    public void setIdpId(int idpId) {
        this.idpId = idpId;
    }

    @Basic
    @Column(name = "DOMAIN_NAME")
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Basic
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

        IdnAssociatedId that = (IdnAssociatedId) o;

        if (id != that.id) return false;
        if (idpId != that.idpId) return false;
        if (idpUserId != null ? !idpUserId.equals(that.idpUserId) : that.idpUserId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idpUserId != null ? idpUserId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + idpId;
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDP_ID", referencedColumnName = "ID", nullable = false)
    public Idp getIdpByIdpId() {
        return idpByIdpId;
    }

    public void setIdpByIdpId(Idp idpByIdpId) {
        this.idpByIdpId = idpByIdpId;
    }
}
