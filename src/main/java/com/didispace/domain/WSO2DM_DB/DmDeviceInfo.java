package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_INFO", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceInfo {
    private int id;
    private Integer deviceId;
    private String keyField;
    private String valueField;
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
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "KEY_FIELD")
    public String getKeyField() {
        return keyField;
    }

    public void setKeyField(String keyField) {
        this.keyField = keyField;
    }

    @Basic
    @Column(name = "VALUE_FIELD")
    public String getValueField() {
        return valueField;
    }

    public void setValueField(String valueField) {
        this.valueField = valueField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDeviceInfo that = (DmDeviceInfo) o;

        if (id != that.id) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (keyField != null ? !keyField.equals(that.keyField) : that.keyField != null) return false;
        if (valueField != null ? !valueField.equals(that.valueField) : that.valueField != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (keyField != null ? keyField.hashCode() : 0);
        result = 31 * result + (valueField != null ? valueField.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID")
    public DmDevice getDmDeviceByDeviceId() {
        return dmDeviceByDeviceId;
    }

    public void setDmDeviceByDeviceId(DmDevice dmDeviceByDeviceId) {
        this.dmDeviceByDeviceId = dmDeviceByDeviceId;
    }
}
