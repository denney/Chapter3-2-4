package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_RESOURCE_PROPERTY", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class RegResourceProperty {
    private int regPropertyId;
    private Integer regVersion;
    private Integer regPathId;
    private String regResourceName;

    @Basic
    @Column(name = "REG_PROPERTY_ID")
    public int getRegPropertyId() {
        return regPropertyId;
    }

    public void setRegPropertyId(int regPropertyId) {
        this.regPropertyId = regPropertyId;
    }

    @Basic
    @Column(name = "REG_VERSION")
    public Integer getRegVersion() {
        return regVersion;
    }

    public void setRegVersion(Integer regVersion) {
        this.regVersion = regVersion;
    }

    @Basic
    @Column(name = "REG_PATH_ID")
    public Integer getRegPathId() {
        return regPathId;
    }

    public void setRegPathId(Integer regPathId) {
        this.regPathId = regPathId;
    }

    @Basic
    @Column(name = "REG_RESOURCE_NAME")
    public String getRegResourceName() {
        return regResourceName;
    }

    public void setRegResourceName(String regResourceName) {
        this.regResourceName = regResourceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegResourceProperty that = (RegResourceProperty) o;

        if (regPropertyId != that.regPropertyId) return false;
        if (regVersion != null ? !regVersion.equals(that.regVersion) : that.regVersion != null) return false;
        if (regPathId != null ? !regPathId.equals(that.regPathId) : that.regPathId != null) return false;
        if (regResourceName != null ? !regResourceName.equals(that.regResourceName) : that.regResourceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regPropertyId;
        result = 31 * result + (regVersion != null ? regVersion.hashCode() : 0);
        result = 31 * result + (regPathId != null ? regPathId.hashCode() : 0);
        result = 31 * result + (regResourceName != null ? regResourceName.hashCode() : 0);
        return result;
    }
}
