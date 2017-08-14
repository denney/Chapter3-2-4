package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_ACCOUNT_MAPPING", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class UmAccountMapping {
    private int umId;
    private String umUserName;
    private String umUserStoreDomain;
    private int umAccLinkId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_USER_NAME")
    public String getUmUserName() {
        return umUserName;
    }

    public void setUmUserName(String umUserName) {
        this.umUserName = umUserName;
    }

    @Basic
    @Column(name = "UM_USER_STORE_DOMAIN")
    public String getUmUserStoreDomain() {
        return umUserStoreDomain;
    }

    public void setUmUserStoreDomain(String umUserStoreDomain) {
        this.umUserStoreDomain = umUserStoreDomain;
    }

    @Basic
    @Column(name = "UM_ACC_LINK_ID")
    public int getUmAccLinkId() {
        return umAccLinkId;
    }

    public void setUmAccLinkId(int umAccLinkId) {
        this.umAccLinkId = umAccLinkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmAccountMapping that = (UmAccountMapping) o;

        if (umId != that.umId) return false;
        if (umAccLinkId != that.umAccLinkId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;
        if (umUserStoreDomain != null ? !umUserStoreDomain.equals(that.umUserStoreDomain) : that.umUserStoreDomain != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + (umUserStoreDomain != null ? umUserStoreDomain.hashCode() : 0);
        result = 31 * result + umAccLinkId;
        return result;
    }
}
