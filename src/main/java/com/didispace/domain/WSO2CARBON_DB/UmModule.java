package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_MODULE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class UmModule {
    private int umId;
    private String umModuleName;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_MODULE_NAME")
    public String getUmModuleName() {
        return umModuleName;
    }

    public void setUmModuleName(String umModuleName) {
        this.umModuleName = umModuleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmModule umModule = (UmModule) o;

        if (umId != umModule.umId) return false;
        if (umModuleName != null ? !umModuleName.equals(umModule.umModuleName) : umModule.umModuleName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umModuleName != null ? umModuleName.hashCode() : 0);
        return result;
    }
}
