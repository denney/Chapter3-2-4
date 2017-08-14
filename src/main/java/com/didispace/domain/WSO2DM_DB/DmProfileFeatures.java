package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_PROFILE_FEATURES", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmProfileFeatures {
    private int id;
    private String featureCode;
    private String deviceType;
    private int tenantId;
    private byte[] content;
    private DmProfile dmProfileByProfileId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FEATURE_CODE")
    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
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
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "CONTENT")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmProfileFeatures that = (DmProfileFeatures) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (featureCode != null ? !featureCode.equals(that.featureCode) : that.featureCode != null) return false;
        if (deviceType != null ? !deviceType.equals(that.deviceType) : that.deviceType != null) return false;
        if (!Arrays.equals(content, that.content)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (featureCode != null ? featureCode.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    public DmProfile getDmProfileByProfileId() {
        return dmProfileByProfileId;
    }

    public void setDmProfileByProfileId(DmProfile dmProfileByProfileId) {
        this.dmProfileByProfileId = dmProfileByProfileId;
    }
}
