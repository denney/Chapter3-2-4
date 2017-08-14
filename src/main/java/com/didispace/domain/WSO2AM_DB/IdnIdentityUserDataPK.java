package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class IdnIdentityUserDataPK implements Serializable {
    private int tenantId;
    private String userName;
    private String dataKey;

    @Column(name = "TENANT_ID")
    @Id
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name = "USER_NAME")
    @Id
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "DATA_KEY")
    @Id
    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnIdentityUserDataPK that = (IdnIdentityUserDataPK) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (dataKey != null ? !dataKey.equals(that.dataKey) : that.dataKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tenantId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (dataKey != null ? dataKey.hashCode() : 0);
        return result;
    }
}
