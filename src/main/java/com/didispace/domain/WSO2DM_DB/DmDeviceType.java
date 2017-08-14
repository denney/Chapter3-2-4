package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_TYPE", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceType {
    private int id;
    private String name;
    private Integer providerTenantId;
    private boolean sharedWithAllTenants;
    private Collection<DmDevice> dmDevicesById;
    private DmProfile dmProfileByProviderTenantId;

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
    @Column(name = "PROVIDER_TENANT_ID")
    public Integer getProviderTenantId() {
        return providerTenantId;
    }

    public void setProviderTenantId(Integer providerTenantId) {
        this.providerTenantId = providerTenantId;
    }

    @Basic
    @Column(name = "SHARED_WITH_ALL_TENANTS")
    public boolean isSharedWithAllTenants() {
        return sharedWithAllTenants;
    }

    public void setSharedWithAllTenants(boolean sharedWithAllTenants) {
        this.sharedWithAllTenants = sharedWithAllTenants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDeviceType that = (DmDeviceType) o;

        if (id != that.id) return false;
        if (sharedWithAllTenants != that.sharedWithAllTenants) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (providerTenantId != null ? !providerTenantId.equals(that.providerTenantId) : that.providerTenantId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (providerTenantId != null ? providerTenantId.hashCode() : 0);
        result = 31 * result + (sharedWithAllTenants ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "dmDeviceTypeByDeviceTypeId")
    public Collection<DmDevice> getDmDevicesById() {
        return dmDevicesById;
    }

    public void setDmDevicesById(Collection<DmDevice> dmDevicesById) {
        this.dmDevicesById = dmDevicesById;
    }

    @ManyToOne
    @JoinColumn(name = "PROVIDER_TENANT_ID", referencedColumnName = "TENANT_ID")
    public DmProfile getDmProfileByProviderTenantId() {
        return dmProfileByProviderTenantId;
    }

    public void setDmProfileByProviderTenantId(DmProfile dmProfileByProviderTenantId) {
        this.dmProfileByProviderTenantId = dmProfileByProviderTenantId;
    }
}
