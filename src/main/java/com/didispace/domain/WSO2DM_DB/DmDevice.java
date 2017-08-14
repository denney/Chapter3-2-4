package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDevice {
    private int id;
    private String description;
    private String name;
    private Integer deviceTypeId;
    private String deviceIdentification;
    private Timestamp lastUpdatedTimestamp;
    private Integer tenantId;
    private DmDeviceType dmDeviceTypeByDeviceTypeId;
    private Collection<DmDeviceApplicationMapping> dmDeviceApplicationMappingsById;
    private Collection<DmDeviceDetail> dmDeviceDetailsById;
    private Collection<DmDeviceGroupMap> dmDeviceGroupMapsById;
    private Collection<DmDeviceInfo> dmDeviceInfosById;
    private Collection<DmDeviceLocation> dmDeviceLocationsById;
    private Collection<DmDevicePolicy> dmDevicePoliciesById;
    private Collection<DmDevicePolicyApplied> dmDevicePolicyAppliedsById;
    private Collection<DmEnrolment> dmEnrolmentsById;
    private Collection<DmNotification> dmNotificationsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DEVICE_TYPE_ID")
    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    @Basic
    @Column(name = "DEVICE_IDENTIFICATION")
    public String getDeviceIdentification() {
        return deviceIdentification;
    }

    public void setDeviceIdentification(String deviceIdentification) {
        this.deviceIdentification = deviceIdentification;
    }

    @Basic
    @Column(name = "LAST_UPDATED_TIMESTAMP")
    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
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

        DmDevice dmDevice = (DmDevice) o;

        if (id != dmDevice.id) return false;
        if (description != null ? !description.equals(dmDevice.description) : dmDevice.description != null)
            return false;
        if (name != null ? !name.equals(dmDevice.name) : dmDevice.name != null) return false;
        if (deviceTypeId != null ? !deviceTypeId.equals(dmDevice.deviceTypeId) : dmDevice.deviceTypeId != null)
            return false;
        if (deviceIdentification != null ? !deviceIdentification.equals(dmDevice.deviceIdentification) : dmDevice.deviceIdentification != null)
            return false;
        if (lastUpdatedTimestamp != null ? !lastUpdatedTimestamp.equals(dmDevice.lastUpdatedTimestamp) : dmDevice.lastUpdatedTimestamp != null)
            return false;
        if (tenantId != null ? !tenantId.equals(dmDevice.tenantId) : dmDevice.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (deviceTypeId != null ? deviceTypeId.hashCode() : 0);
        result = 31 * result + (deviceIdentification != null ? deviceIdentification.hashCode() : 0);
        result = 31 * result + (lastUpdatedTimestamp != null ? lastUpdatedTimestamp.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_TYPE_ID", referencedColumnName = "ID")
    public DmDeviceType getDmDeviceTypeByDeviceTypeId() {
        return dmDeviceTypeByDeviceTypeId;
    }

    public void setDmDeviceTypeByDeviceTypeId(DmDeviceType dmDeviceTypeByDeviceTypeId) {
        this.dmDeviceTypeByDeviceTypeId = dmDeviceTypeByDeviceTypeId;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDeviceApplicationMapping> getDmDeviceApplicationMappingsById() {
        return dmDeviceApplicationMappingsById;
    }

    public void setDmDeviceApplicationMappingsById(Collection<DmDeviceApplicationMapping> dmDeviceApplicationMappingsById) {
        this.dmDeviceApplicationMappingsById = dmDeviceApplicationMappingsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDeviceDetail> getDmDeviceDetailsById() {
        return dmDeviceDetailsById;
    }

    public void setDmDeviceDetailsById(Collection<DmDeviceDetail> dmDeviceDetailsById) {
        this.dmDeviceDetailsById = dmDeviceDetailsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDeviceGroupMap> getDmDeviceGroupMapsById() {
        return dmDeviceGroupMapsById;
    }

    public void setDmDeviceGroupMapsById(Collection<DmDeviceGroupMap> dmDeviceGroupMapsById) {
        this.dmDeviceGroupMapsById = dmDeviceGroupMapsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDeviceInfo> getDmDeviceInfosById() {
        return dmDeviceInfosById;
    }

    public void setDmDeviceInfosById(Collection<DmDeviceInfo> dmDeviceInfosById) {
        this.dmDeviceInfosById = dmDeviceInfosById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDeviceLocation> getDmDeviceLocationsById() {
        return dmDeviceLocationsById;
    }

    public void setDmDeviceLocationsById(Collection<DmDeviceLocation> dmDeviceLocationsById) {
        this.dmDeviceLocationsById = dmDeviceLocationsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDevicePolicy> getDmDevicePoliciesById() {
        return dmDevicePoliciesById;
    }

    public void setDmDevicePoliciesById(Collection<DmDevicePolicy> dmDevicePoliciesById) {
        this.dmDevicePoliciesById = dmDevicePoliciesById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmDevicePolicyApplied> getDmDevicePolicyAppliedsById() {
        return dmDevicePolicyAppliedsById;
    }

    public void setDmDevicePolicyAppliedsById(Collection<DmDevicePolicyApplied> dmDevicePolicyAppliedsById) {
        this.dmDevicePolicyAppliedsById = dmDevicePolicyAppliedsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmEnrolment> getDmEnrolmentsById() {
        return dmEnrolmentsById;
    }

    public void setDmEnrolmentsById(Collection<DmEnrolment> dmEnrolmentsById) {
        this.dmEnrolmentsById = dmEnrolmentsById;
    }

    @OneToMany(mappedBy = "dmDeviceByDeviceId")
    public Collection<DmNotification> getDmNotificationsById() {
        return dmNotificationsById;
    }

    public void setDmNotificationsById(Collection<DmNotification> dmNotificationsById) {
        this.dmNotificationsById = dmNotificationsById;
    }
}
