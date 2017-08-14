package com.didispace.domain.WSO2MobileWindows_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "WIN_DEVICE", schema = "PUBLIC", catalog = "WSO2MOBILEWINDOWS_DB")
public class WinDevice {
    private String deviceId;
    private String channelUri;
    private String deviceInfo;
    private String imei;
    private String imsi;
    private String osVersion;
    private String deviceModel;
    private String vendor;
    private String latitude;
    private String longitude;
    private String serial;
    private String macAddress;
    private String deviceName;

    @Id
    @Column(name = "DEVICE_ID")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "CHANNEL_URI")
    public String getChannelUri() {
        return channelUri;
    }

    public void setChannelUri(String channelUri) {
        this.channelUri = channelUri;
    }

    @Basic
    @Column(name = "DEVICE_INFO")
    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @Basic
    @Column(name = "IMEI")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @Column(name = "IMSI")
    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
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
    @Column(name = "LATITUDE")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "LONGITUDE")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "SERIAL")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Basic
    @Column(name = "MAC_ADDRESS")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Basic
    @Column(name = "DEVICE_NAME")
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WinDevice winDevice = (WinDevice) o;

        if (deviceId != null ? !deviceId.equals(winDevice.deviceId) : winDevice.deviceId != null) return false;
        if (channelUri != null ? !channelUri.equals(winDevice.channelUri) : winDevice.channelUri != null) return false;
        if (deviceInfo != null ? !deviceInfo.equals(winDevice.deviceInfo) : winDevice.deviceInfo != null) return false;
        if (imei != null ? !imei.equals(winDevice.imei) : winDevice.imei != null) return false;
        if (imsi != null ? !imsi.equals(winDevice.imsi) : winDevice.imsi != null) return false;
        if (osVersion != null ? !osVersion.equals(winDevice.osVersion) : winDevice.osVersion != null) return false;
        if (deviceModel != null ? !deviceModel.equals(winDevice.deviceModel) : winDevice.deviceModel != null)
            return false;
        if (vendor != null ? !vendor.equals(winDevice.vendor) : winDevice.vendor != null) return false;
        if (latitude != null ? !latitude.equals(winDevice.latitude) : winDevice.latitude != null) return false;
        if (longitude != null ? !longitude.equals(winDevice.longitude) : winDevice.longitude != null) return false;
        if (serial != null ? !serial.equals(winDevice.serial) : winDevice.serial != null) return false;
        if (macAddress != null ? !macAddress.equals(winDevice.macAddress) : winDevice.macAddress != null) return false;
        if (deviceName != null ? !deviceName.equals(winDevice.deviceName) : winDevice.deviceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceId != null ? deviceId.hashCode() : 0;
        result = 31 * result + (channelUri != null ? channelUri.hashCode() : 0);
        result = 31 * result + (deviceInfo != null ? deviceInfo.hashCode() : 0);
        result = 31 * result + (imei != null ? imei.hashCode() : 0);
        result = 31 * result + (imsi != null ? imsi.hashCode() : 0);
        result = 31 * result + (osVersion != null ? osVersion.hashCode() : 0);
        result = 31 * result + (deviceModel != null ? deviceModel.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (macAddress != null ? macAddress.hashCode() : 0);
        result = 31 * result + (deviceName != null ? deviceName.hashCode() : 0);
        return result;
    }
}
