package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_TENANT", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class UmTenant {
    private int umId;
    private String umDomainName;
    private String umEmail;
    private Boolean umActive;
    private Timestamp umCreatedDate;
    private byte[] umUserConfig;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_DOMAIN_NAME")
    public String getUmDomainName() {
        return umDomainName;
    }

    public void setUmDomainName(String umDomainName) {
        this.umDomainName = umDomainName;
    }

    @Basic
    @Column(name = "UM_EMAIL")
    public String getUmEmail() {
        return umEmail;
    }

    public void setUmEmail(String umEmail) {
        this.umEmail = umEmail;
    }

    @Basic
    @Column(name = "UM_ACTIVE")
    public Boolean getUmActive() {
        return umActive;
    }

    public void setUmActive(Boolean umActive) {
        this.umActive = umActive;
    }

    @Basic
    @Column(name = "UM_CREATED_DATE")
    public Timestamp getUmCreatedDate() {
        return umCreatedDate;
    }

    public void setUmCreatedDate(Timestamp umCreatedDate) {
        this.umCreatedDate = umCreatedDate;
    }

    @Basic
    @Column(name = "UM_USER_CONFIG")
    public byte[] getUmUserConfig() {
        return umUserConfig;
    }

    public void setUmUserConfig(byte[] umUserConfig) {
        this.umUserConfig = umUserConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmTenant umTenant = (UmTenant) o;

        if (umId != umTenant.umId) return false;
        if (umDomainName != null ? !umDomainName.equals(umTenant.umDomainName) : umTenant.umDomainName != null)
            return false;
        if (umEmail != null ? !umEmail.equals(umTenant.umEmail) : umTenant.umEmail != null) return false;
        if (umActive != null ? !umActive.equals(umTenant.umActive) : umTenant.umActive != null) return false;
        if (umCreatedDate != null ? !umCreatedDate.equals(umTenant.umCreatedDate) : umTenant.umCreatedDate != null)
            return false;
        if (!Arrays.equals(umUserConfig, umTenant.umUserConfig)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umDomainName != null ? umDomainName.hashCode() : 0);
        result = 31 * result + (umEmail != null ? umEmail.hashCode() : 0);
        result = 31 * result + (umActive != null ? umActive.hashCode() : 0);
        result = 31 * result + (umCreatedDate != null ? umCreatedDate.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(umUserConfig);
        return result;
    }
}
