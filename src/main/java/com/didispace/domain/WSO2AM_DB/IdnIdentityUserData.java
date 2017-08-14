package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_IDENTITY_USER_DATA", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnIdentityUserDataPK.class)
public class IdnIdentityUserData {
    private int tenantId;
    private String userName;
    private String dataKey;
    private String dataValue;

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @Column(name = "DATA_KEY")
    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    @Basic
    @Column(name = "DATA_VALUE")
    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnIdentityUserData that = (IdnIdentityUserData) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (dataKey != null ? !dataKey.equals(that.dataKey) : that.dataKey != null) return false;
        if (dataValue != null ? !dataValue.equals(that.dataValue) : that.dataValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tenantId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (dataKey != null ? dataKey.hashCode() : 0);
        result = 31 * result + (dataValue != null ? dataValue.hashCode() : 0);
        return result;
    }
}
