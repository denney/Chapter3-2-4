package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_GROUP", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmGroup {
    private int id;
    private String groupName;
    private String description;
    private String owner;
    private Integer tenantId;
    private Collection<DmDeviceGroupMap> dmDeviceGroupMapsById;
    private Collection<DmDeviceGroupPolicy> dmDeviceGroupPoliciesById;
    private Collection<DmRoleGroupMap> dmRoleGroupMapsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GROUP_NAME")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "OWNER")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

        DmGroup dmGroup = (DmGroup) o;

        if (id != dmGroup.id) return false;
        if (groupName != null ? !groupName.equals(dmGroup.groupName) : dmGroup.groupName != null) return false;
        if (description != null ? !description.equals(dmGroup.description) : dmGroup.description != null) return false;
        if (owner != null ? !owner.equals(dmGroup.owner) : dmGroup.owner != null) return false;
        if (tenantId != null ? !tenantId.equals(dmGroup.tenantId) : dmGroup.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dmGroupByGroupId")
    public Collection<DmDeviceGroupMap> getDmDeviceGroupMapsById() {
        return dmDeviceGroupMapsById;
    }

    public void setDmDeviceGroupMapsById(Collection<DmDeviceGroupMap> dmDeviceGroupMapsById) {
        this.dmDeviceGroupMapsById = dmDeviceGroupMapsById;
    }

    @OneToMany(mappedBy = "dmGroupByDeviceGroupId")
    public Collection<DmDeviceGroupPolicy> getDmDeviceGroupPoliciesById() {
        return dmDeviceGroupPoliciesById;
    }

    public void setDmDeviceGroupPoliciesById(Collection<DmDeviceGroupPolicy> dmDeviceGroupPoliciesById) {
        this.dmDeviceGroupPoliciesById = dmDeviceGroupPoliciesById;
    }

    @OneToMany(mappedBy = "dmGroupByGroupId")
    public Collection<DmRoleGroupMap> getDmRoleGroupMapsById() {
        return dmRoleGroupMapsById;
    }

    public void setDmRoleGroupMapsById(Collection<DmRoleGroupMap> dmRoleGroupMapsById) {
        this.dmRoleGroupMapsById = dmRoleGroupMapsById;
    }
}
