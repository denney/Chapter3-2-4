package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_PROFILE", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmProfile {
    private int id;
    private String profileName;
    private String deviceType;
    private Timestamp createdTime;
    private Timestamp updatedTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PROFILE_NAME")
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Basic
    @Column(name = "DEVICE_TYPE")
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Basic
    @Column(name = "CREATED_TIME")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "UPDATED_TIME")
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmProfile dmProfile = (DmProfile) o;

        if (id != dmProfile.id) return false;
        if (profileName != null ? !profileName.equals(dmProfile.profileName) : dmProfile.profileName != null)
            return false;
        if (deviceType != null ? !deviceType.equals(dmProfile.deviceType) : dmProfile.deviceType != null) return false;
        if (createdTime != null ? !createdTime.equals(dmProfile.createdTime) : dmProfile.createdTime != null)
            return false;
        if (updatedTime != null ? !updatedTime.equals(dmProfile.updatedTime) : dmProfile.updatedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (profileName != null ? profileName.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        return result;
    }
}
