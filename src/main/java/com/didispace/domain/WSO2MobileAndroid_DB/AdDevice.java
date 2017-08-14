package com.didispace.domain.WSO2MobileAndroid_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AD_DEVICE", schema = "PUBLIC", catalog = "WSO2MOBILEANDROID_DB")
public class AdDevice {
    private String deviceId;
    private String gcmToken;
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
    private String osBuildDate;

    @Id
    @Column(name = "DEVICE_ID")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "GCM_TOKEN")
    public String getGcmToken() {
        return gcmToken;
    }

    public void setGcmToken(String gcmToken) {
        this.gcmToken = gcmToken;
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

    @Basic
    @Column(name = "OS_BUILD_DATE")
    public String getOsBuildDate() {
        return osBuildDate;
    }

    public void setOsBuildDate(String osBuildDate) {
        this.osBuildDate = osBuildDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdDevice adDevice = (AdDevice) o;

        if (deviceId != null ? !deviceId.equals(adDevice.deviceId) : adDevice.deviceId != null) return false;
        if (gcmToken != null ? !gcmToken.equals(adDevice.gcmToken) : adDevice.gcmToken != null) return false;
        if (deviceInfo != null ? !deviceInfo.equals(adDevice.deviceInfo) : adDevice.deviceInfo != null) return false;
        if (imei != null ? !imei.equals(adDevice.imei) : adDevice.imei != null) return false;
        if (imsi != null ? !imsi.equals(adDevice.imsi) : adDevice.imsi != null) return false;
        if (osVersion != null ? !osVersion.equals(adDevice.osVersion) : adDevice.osVersion != null) return false;
        if (deviceModel != null ? !deviceModel.equals(adDevice.deviceModel) : adDevice.deviceModel != null)
            return false;
        if (vendor != null ? !vendor.equals(adDevice.vendor) : adDevice.vendor != null) return false;
        if (latitude != null ? !latitude.equals(adDevice.latitude) : adDevice.latitude != null) return false;
        if (longitude != null ? !longitude.equals(adDevice.longitude) : adDevice.longitude != null) return false;
        if (serial != null ? !serial.equals(adDevice.serial) : adDevice.serial != null) return false;
        if (macAddress != null ? !macAddress.equals(adDevice.macAddress) : adDevice.macAddress != null) return false;
        if (deviceName != null ? !deviceName.equals(adDevice.deviceName) : adDevice.deviceName != null) return false;
        if (osBuildDate != null ? !osBuildDate.equals(adDevice.osBuildDate) : adDevice.osBuildDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceId != null ? deviceId.hashCode() : 0;
        result = 31 * result + (gcmToken != null ? gcmToken.hashCode() : 0);
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
        result = 31 * result + (osBuildDate != null ? osBuildDate.hashCode() : 0);
        return result;
    }
}
