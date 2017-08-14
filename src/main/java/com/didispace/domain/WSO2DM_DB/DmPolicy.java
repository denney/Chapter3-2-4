package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicy {
    private int id;
    private String name;
    private String description;
    private int tenantId;
    private int profileId;
    private String ownershipType;
    private String compliance;
    private int priority;
    private int active;
    private Integer updated;
    private Collection<DmDeviceGroupPolicy> dmDeviceGroupPoliciesById;
    private Collection<DmDevicePolicy> dmDevicePoliciesById;
    private Collection<DmDeviceTypePolicy> dmDeviceTypePoliciesById;
    private DmProfile dmProfileByProfileId;
    private Collection<DmPolicyCriteria> dmPolicyCriteriaById;
    private Collection<DmRolePolicy> dmRolePoliciesById;
    private Collection<DmUserPolicy> dmUserPoliciesById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "PROFILE_ID")
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Basic
    @Column(name = "OWNERSHIP_TYPE")
    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    @Basic
    @Column(name = "COMPLIANCE")
    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    @Basic
    @Column(name = "PRIORITY")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "ACTIVE")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Basic
    @Column(name = "UPDATED")
    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPolicy dmPolicy = (DmPolicy) o;

        if (id != dmPolicy.id) return false;
        if (tenantId != dmPolicy.tenantId) return false;
        if (profileId != dmPolicy.profileId) return false;
        if (priority != dmPolicy.priority) return false;
        if (active != dmPolicy.active) return false;
        if (name != null ? !name.equals(dmPolicy.name) : dmPolicy.name != null) return false;
        if (description != null ? !description.equals(dmPolicy.description) : dmPolicy.description != null)
            return false;
        if (ownershipType != null ? !ownershipType.equals(dmPolicy.ownershipType) : dmPolicy.ownershipType != null)
            return false;
        if (compliance != null ? !compliance.equals(dmPolicy.compliance) : dmPolicy.compliance != null) return false;
        if (updated != null ? !updated.equals(dmPolicy.updated) : dmPolicy.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + profileId;
        result = 31 * result + (ownershipType != null ? ownershipType.hashCode() : 0);
        result = 31 * result + (compliance != null ? compliance.hashCode() : 0);
        result = 31 * result + priority;
        result = 31 * result + active;
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmDeviceGroupPolicy> getDmDeviceGroupPoliciesById() {
        return dmDeviceGroupPoliciesById;
    }

    public void setDmDeviceGroupPoliciesById(Collection<DmDeviceGroupPolicy> dmDeviceGroupPoliciesById) {
        this.dmDeviceGroupPoliciesById = dmDeviceGroupPoliciesById;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmDevicePolicy> getDmDevicePoliciesById() {
        return dmDevicePoliciesById;
    }

    public void setDmDevicePoliciesById(Collection<DmDevicePolicy> dmDevicePoliciesById) {
        this.dmDevicePoliciesById = dmDevicePoliciesById;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmDeviceTypePolicy> getDmDeviceTypePoliciesById() {
        return dmDeviceTypePoliciesById;
    }

    public void setDmDeviceTypePoliciesById(Collection<DmDeviceTypePolicy> dmDeviceTypePoliciesById) {
        this.dmDeviceTypePoliciesById = dmDeviceTypePoliciesById;
    }

    @ManyToOne
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    public DmProfile getDmProfileByProfileId() {
        return dmProfileByProfileId;
    }

    public void setDmProfileByProfileId(DmProfile dmProfileByProfileId) {
        this.dmProfileByProfileId = dmProfileByProfileId;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmPolicyCriteria> getDmPolicyCriteriaById() {
        return dmPolicyCriteriaById;
    }

    public void setDmPolicyCriteriaById(Collection<DmPolicyCriteria> dmPolicyCriteriaById) {
        this.dmPolicyCriteriaById = dmPolicyCriteriaById;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmRolePolicy> getDmRolePoliciesById() {
        return dmRolePoliciesById;
    }

    public void setDmRolePoliciesById(Collection<DmRolePolicy> dmRolePoliciesById) {
        this.dmRolePoliciesById = dmRolePoliciesById;
    }

    @OneToMany(mappedBy = "dmPolicyByPolicyId")
    public Collection<DmUserPolicy> getDmUserPoliciesById() {
        return dmUserPoliciesById;
    }

    public void setDmUserPoliciesById(Collection<DmUserPolicy> dmUserPoliciesById) {
        this.dmUserPoliciesById = dmUserPoliciesById;
    }
}
