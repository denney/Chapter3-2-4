package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_ROLE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpRole {
    private int id;
    private Integer idpId;
    private Integer tenantId;
    private String role;
    private Idp idpByIdpId;
    private Collection<IdpRoleMapping> idpRoleMappingsById;

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
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpRole idpRole = (IdpRole) o;

        if (id != idpRole.id) return false;
        if (idpId != null ? !idpId.equals(idpRole.idpId) : idpRole.idpId != null) return false;
        if (tenantId != null ? !tenantId.equals(idpRole.tenantId) : idpRole.tenantId != null) return false;
        if (role != null ? !role.equals(idpRole.role) : idpRole.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idpId != null ? idpId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
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

    @OneToMany(mappedBy = "idpRoleByIdpRoleId")
    public Collection<IdpRoleMapping> getIdpRoleMappingsById() {
        return idpRoleMappingsById;
    }

    public void setIdpRoleMappingsById(Collection<IdpRoleMapping> idpRoleMappingsById) {
        this.idpRoleMappingsById = idpRoleMappingsById;
    }
}
