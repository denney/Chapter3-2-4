package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class IdnOpenidUserRpsPK implements Serializable {
    private String userName;
    private int tenantId;
    private String rpUrl;

    @Column(name = "USER_NAME")
    @Id
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "TENANT_ID")
    @Id
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name = "RP_URL")
    @Id
    public String getRpUrl() {
        return rpUrl;
    }

    public void setRpUrl(String rpUrl) {
        this.rpUrl = rpUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOpenidUserRpsPK that = (IdnOpenidUserRpsPK) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (rpUrl != null ? !rpUrl.equals(that.rpUrl) : that.rpUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + tenantId;
        result = 31 * result + (rpUrl != null ? rpUrl.hashCode() : 0);
        return result;
    }
}
