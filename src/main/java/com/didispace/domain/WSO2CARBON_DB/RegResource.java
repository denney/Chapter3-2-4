package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_RESOURCE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegResourcePK.class)
public class RegResource {
    private int regPathId;
    private String regName;
    private int regVersion;
    private String regMediaType;
    private String regCreator;
    private Timestamp regCreatedTime;
    private String regLastUpdator;
    private Timestamp regLastUpdatedTime;
    private String regDescription;
    private Integer regContentId;
    private int regTenantId;
    private String regUuid;

    @Basic
    @Column(name = "REG_PATH_ID")
    public int getRegPathId() {
        return regPathId;
    }

    public void setRegPathId(int regPathId) {
        this.regPathId = regPathId;
    }

    @Basic
    @Column(name = "REG_NAME")
    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    @Id
    @Column(name = "REG_VERSION")
    public int getRegVersion() {
        return regVersion;
    }

    public void setRegVersion(int regVersion) {
        this.regVersion = regVersion;
    }

    @Basic
    @Column(name = "REG_MEDIA_TYPE")
    public String getRegMediaType() {
        return regMediaType;
    }

    public void setRegMediaType(String regMediaType) {
        this.regMediaType = regMediaType;
    }

    @Basic
    @Column(name = "REG_CREATOR")
    public String getRegCreator() {
        return regCreator;
    }

    public void setRegCreator(String regCreator) {
        this.regCreator = regCreator;
    }

    @Basic
    @Column(name = "REG_CREATED_TIME")
    public Timestamp getRegCreatedTime() {
        return regCreatedTime;
    }

    public void setRegCreatedTime(Timestamp regCreatedTime) {
        this.regCreatedTime = regCreatedTime;
    }

    @Basic
    @Column(name = "REG_LAST_UPDATOR")
    public String getRegLastUpdator() {
        return regLastUpdator;
    }

    public void setRegLastUpdator(String regLastUpdator) {
        this.regLastUpdator = regLastUpdator;
    }

    @Basic
    @Column(name = "REG_LAST_UPDATED_TIME")
    public Timestamp getRegLastUpdatedTime() {
        return regLastUpdatedTime;
    }

    public void setRegLastUpdatedTime(Timestamp regLastUpdatedTime) {
        this.regLastUpdatedTime = regLastUpdatedTime;
    }

    @Basic
    @Column(name = "REG_DESCRIPTION")
    public String getRegDescription() {
        return regDescription;
    }

    public void setRegDescription(String regDescription) {
        this.regDescription = regDescription;
    }

    @Basic
    @Column(name = "REG_CONTENT_ID")
    public Integer getRegContentId() {
        return regContentId;
    }

    public void setRegContentId(Integer regContentId) {
        this.regContentId = regContentId;
    }

    @Id
    @Column(name = "REG_TENANT_ID")
    public int getRegTenantId() {
        return regTenantId;
    }

    public void setRegTenantId(int regTenantId) {
        this.regTenantId = regTenantId;
    }

    @Basic
    @Column(name = "REG_UUID")
    public String getRegUuid() {
        return regUuid;
    }

    public void setRegUuid(String regUuid) {
        this.regUuid = regUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegResource that = (RegResource) o;

        if (regPathId != that.regPathId) return false;
        if (regVersion != that.regVersion) return false;
        if (regTenantId != that.regTenantId) return false;
        if (regName != null ? !regName.equals(that.regName) : that.regName != null) return false;
        if (regMediaType != null ? !regMediaType.equals(that.regMediaType) : that.regMediaType != null) return false;
        if (regCreator != null ? !regCreator.equals(that.regCreator) : that.regCreator != null) return false;
        if (regCreatedTime != null ? !regCreatedTime.equals(that.regCreatedTime) : that.regCreatedTime != null)
            return false;
        if (regLastUpdator != null ? !regLastUpdator.equals(that.regLastUpdator) : that.regLastUpdator != null)
            return false;
        if (regLastUpdatedTime != null ? !regLastUpdatedTime.equals(that.regLastUpdatedTime) : that.regLastUpdatedTime != null)
            return false;
        if (regDescription != null ? !regDescription.equals(that.regDescription) : that.regDescription != null)
            return false;
        if (regContentId != null ? !regContentId.equals(that.regContentId) : that.regContentId != null) return false;
        if (regUuid != null ? !regUuid.equals(that.regUuid) : that.regUuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regPathId;
        result = 31 * result + (regName != null ? regName.hashCode() : 0);
        result = 31 * result + regVersion;
        result = 31 * result + (regMediaType != null ? regMediaType.hashCode() : 0);
        result = 31 * result + (regCreator != null ? regCreator.hashCode() : 0);
        result = 31 * result + (regCreatedTime != null ? regCreatedTime.hashCode() : 0);
        result = 31 * result + (regLastUpdator != null ? regLastUpdator.hashCode() : 0);
        result = 31 * result + (regLastUpdatedTime != null ? regLastUpdatedTime.hashCode() : 0);
        result = 31 * result + (regDescription != null ? regDescription.hashCode() : 0);
        result = 31 * result + (regContentId != null ? regContentId.hashCode() : 0);
        result = 31 * result + regTenantId;
        result = 31 * result + (regUuid != null ? regUuid.hashCode() : 0);
        return result;
    }
}
