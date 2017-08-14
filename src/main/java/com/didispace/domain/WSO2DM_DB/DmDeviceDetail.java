package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_DETAIL", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceDetail {
    private int id;
    private int deviceId;
    private String deviceModel;
    private String vendor;
    private String osVersion;
    private String osBuildDate;
    private Integer batteryLevel;
    private BigDecimal internalTotalMemory;
    private BigDecimal internalAvailableMemory;
    private BigDecimal externalTotalMemory;
    private BigDecimal externalAvailableMemory;
    private String connectionType;
    private String ssid;
    private Integer cpuUsage;
    private BigDecimal totalRamMemory;
    private BigDecimal availableRamMemory;
    private Integer pluggedIn;
    private long updateTimestamp;
    private DmDevice dmDeviceByDeviceId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DEVICE_ID")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "DEVICE_MODEL")
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    @Basic
    @Column(name = "VENDOR")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Basic
    @Column(name = "OS_VERSION")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Basic
    @Column(name = "OS_BUILD_DATE")
    public String getOsBuildDate() {
        return osBuildDate;
    }

    public void setOsBuildDate(String osBuildDate) {
        this.osBuildDate = osBuildDate;
    }

    @Basic
    @Column(name = "BATTERY_LEVEL")
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Basic
    @Column(name = "INTERNAL_TOTAL_MEMORY")
    public BigDecimal getInternalTotalMemory() {
        return internalTotalMemory;
    }

    public void setInternalTotalMemory(BigDecimal internalTotalMemory) {
        this.internalTotalMemory = internalTotalMemory;
    }

    @Basic
    @Column(name = "INTERNAL_AVAILABLE_MEMORY")
    public BigDecimal getInternalAvailableMemory() {
        return internalAvailableMemory;
    }

    public void setInternalAvailableMemory(BigDecimal internalAvailableMemory) {
        this.internalAvailableMemory = internalAvailableMemory;
    }

    @Basic
    @Column(name = "EXTERNAL_TOTAL_MEMORY")
    public BigDecimal getExternalTotalMemory() {
        return externalTotalMemory;
    }

    public void setExternalTotalMemory(BigDecimal externalTotalMemory) {
        this.externalTotalMemory = externalTotalMemory;
    }

    @Basic
    @Column(name = "EXTERNAL_AVAILABLE_MEMORY")
    public BigDecimal getExternalAvailableMemory() {
        return externalAvailableMemory;
    }

    public void setExternalAvailableMemory(BigDecimal externalAvailableMemory) {
        this.externalAvailableMemory = externalAvailableMemory;
    }

    @Basic
    @Column(name = "CONNECTION_TYPE")
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Basic
    @Column(name = "SSID")
    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    @Basic
    @Column(name = "CPU_USAGE")
    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    @Basic
    @Column(name = "TOTAL_RAM_MEMORY")
    public BigDecimal getTotalRamMemory() {
        return totalRamMemory;
    }

    public void setTotalRamMemory(BigDecimal totalRamMemory) {
        this.totalRamMemory = totalRamMemory;
    }

    @Basic
    @Column(name = "AVAILABLE_RAM_MEMORY")
    public BigDecimal getAvailableRamMemory() {
        return availableRamMemory;
    }

    public void setAvailableRamMemory(BigDecimal availableRamMemory) {
        this.availableRamMemory = availableRamMemory;
    }

    @Basic
    @Column(name = "PLUGGED_IN")
    public Integer getPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(Integer pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    @Basic
    @Column(name = "UPDATE_TIMESTAMP")
    public long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDeviceDetail that = (DmDeviceDetail) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (deviceModel != null ? !deviceModel.equals(that.deviceModel) : that.deviceModel != null) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (osVersion != null ? !osVersion.equals(that.osVersion) : that.osVersion != null) return false;
        if (osBuildDate != null ? !osBuildDate.equals(that.osBuildDate) : that.osBuildDate != null) return false;
        if (batteryLevel != null ? !batteryLevel.equals(that.batteryLevel) : that.batteryLevel != null) return false;
        if (internalTotalMemory != null ? !internalTotalMemory.equals(that.internalTotalMemory) : that.internalTotalMemory != null)
            return false;
        if (internalAvailableMemory != null ? !internalAvailableMemory.equals(that.internalAvailableMemory) : that.internalAvailableMemory != null)
            return false;
        if (externalTotalMemory != null ? !externalTotalMemory.equals(that.externalTotalMemory) : that.externalTotalMemory != null)
            return false;
        if (externalAvailableMemory != null ? !externalAvailableMemory.equals(that.externalAvailableMemory) : that.externalAvailableMemory != null)
            return false;
        if (connectionType != null ? !connectionType.equals(that.connectionType) : that.connectionType != null)
            return false;
        if (ssid != null ? !ssid.equals(that.ssid) : that.ssid != null) return false;
        if (cpuUsage != null ? !cpuUsage.equals(that.cpuUsage) : that.cpuUsage != null) return false;
        if (totalRamMemory != null ? !totalRamMemory.equals(that.totalRamMemory) : that.totalRamMemory != null)
            return false;
        if (availableRamMemory != null ? !availableRamMemory.equals(that.availableRamMemory) : that.availableRamMemory != null)
            return false;
        if (pluggedIn != null ? !pluggedIn.equals(that.pluggedIn) : that.pluggedIn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + (deviceModel != null ? deviceModel.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (osVersion != null ? osVersion.hashCode() : 0);
        result = 31 * result + (osBuildDate != null ? osBuildDate.hashCode() : 0);
        result = 31 * result + (batteryLevel != null ? batteryLevel.hashCode() : 0);
        result = 31 * result + (internalTotalMemory != null ? internalTotalMemory.hashCode() : 0);
        result = 31 * result + (internalAvailableMemory != null ? internalAvailableMemory.hashCode() : 0);
        result = 31 * result + (externalTotalMemory != null ? externalTotalMemory.hashCode() : 0);
        result = 31 * result + (externalAvailableMemory != null ? externalAvailableMemory.hashCode() : 0);
        result = 31 * result + (connectionType != null ? connectionType.hashCode() : 0);
        result = 31 * result + (ssid != null ? ssid.hashCode() : 0);
        result = 31 * result + (cpuUsage != null ? cpuUsage.hashCode() : 0);
        result = 31 * result + (totalRamMemory != null ? totalRamMemory.hashCode() : 0);
        result = 31 * result + (availableRamMemory != null ? availableRamMemory.hashCode() : 0);
        result = 31 * result + (pluggedIn != null ? pluggedIn.hashCode() : 0);
        result = 31 * result + (int) (updateTimestamp ^ (updateTimestamp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID", nullable = false)
    public DmDevice getDmDeviceByDeviceId() {
        return dmDeviceByDeviceId;
    }

    public void setDmDeviceByDeviceId(DmDevice dmDeviceByDeviceId) {
        this.dmDeviceByDeviceId = dmDeviceByDeviceId;
    }
}
