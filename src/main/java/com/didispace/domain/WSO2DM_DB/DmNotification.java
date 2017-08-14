package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_NOTIFICATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmNotification {
    private int notificationId;
    private int deviceId;
    private int operationId;
    private int tenantId;
    private String status;
    private String description;
    private DmDevice dmDeviceByDeviceId;
    private DmOperation dmOperationByOperationId;

    @Id
    @Column(name = "NOTIFICATION_ID")
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
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
    @Column(name = "OPERATION_ID")
    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
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
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmNotification that = (DmNotification) o;

        if (notificationId != that.notificationId) return false;
        if (deviceId != that.deviceId) return false;
        if (operationId != that.operationId) return false;
        if (tenantId != that.tenantId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notificationId;
        result = 31 * result + deviceId;
        result = 31 * result + operationId;
        result = 31 * result + tenantId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
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

    @ManyToOne
    @JoinColumn(name = "OPERATION_ID", referencedColumnName = "ID", nullable = false)
    public DmOperation getDmOperationByOperationId() {
        return dmOperationByOperationId;
    }

    public void setDmOperationByOperationId(DmOperation dmOperationByOperationId) {
        this.dmOperationByOperationId = dmOperationByOperationId;
    }
}
