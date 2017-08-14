package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_ROLE_GROUP_MAP", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmRoleGroupMap {
    private int id;
    private String role;
    private Integer tenantId;
    private DmGroup dmGroupByGroupId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

        DmRoleGroupMap that = (DmRoleGroupMap) o;

        if (id != that.id) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "ID")
    public DmGroup getDmGroupByGroupId() {
        return dmGroupByGroupId;
    }

    public void setDmGroupByGroupId(DmGroup dmGroupByGroupId) {
        this.dmGroupByGroupId = dmGroupByGroupId;
    }
}
