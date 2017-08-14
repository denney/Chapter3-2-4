package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "FIDO_DEVICE_STORE", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(FidoDeviceStorePK.class)
public class FidoDeviceStore {
    private int tenantId;
    private String domainName;
    private String userName;
    private Timestamp timeRegistered;
    private String keyHandle;
    private String deviceData;

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "DOMAIN_NAME")
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "TIME_REGISTERED")
    public Timestamp getTimeRegistered() {
        return timeRegistered;
    }

    public void setTimeRegistered(Timestamp timeRegistered) {
        this.timeRegistered = timeRegistered;
    }

    @Id
    @Column(name = "KEY_HANDLE")
    public String getKeyHandle() {
        return keyHandle;
    }

    public void setKeyHandle(String keyHandle) {
        this.keyHandle = keyHandle;
    }

    @Basic
    @Column(name = "DEVICE_DATA")
    public String getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(String deviceData) {
        this.deviceData = deviceData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FidoDeviceStore that = (FidoDeviceStore) o;

        if (tenantId != that.tenantId) return false;
        if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (timeRegistered != null ? !timeRegistered.equals(that.timeRegistered) : that.timeRegistered != null)
            return false;
        if (keyHandle != null ? !keyHandle.equals(that.keyHandle) : that.keyHandle != null) return false;
        if (deviceData != null ? !deviceData.equals(that.deviceData) : that.deviceData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tenantId;
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (timeRegistered != null ? timeRegistered.hashCode() : 0);
        result = 31 * result + (keyHandle != null ? keyHandle.hashCode() : 0);
        result = 31 * result + (deviceData != null ? deviceData.hashCode() : 0);
        return result;
    }
}
