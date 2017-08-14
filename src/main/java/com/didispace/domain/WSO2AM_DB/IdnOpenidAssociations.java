package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OPENID_ASSOCIATIONS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOpenidAssociations {
    private String handle;
    private String assocType;
    private Timestamp expireIn;
    private String macKey;
    private String assocStore;
    private Integer tenantId;

    @Id
    @Column(name = "HANDLE")
    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Basic
    @Column(name = "ASSOC_TYPE")
    public String getAssocType() {
        return assocType;
    }

    public void setAssocType(String assocType) {
        this.assocType = assocType;
    }

    @Basic
    @Column(name = "EXPIRE_IN")
    public Timestamp getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Timestamp expireIn) {
        this.expireIn = expireIn;
    }

    @Basic
    @Column(name = "MAC_KEY")
    public String getMacKey() {
        return macKey;
    }

    public void setMacKey(String macKey) {
        this.macKey = macKey;
    }

    @Basic
    @Column(name = "ASSOC_STORE")
    public String getAssocStore() {
        return assocStore;
    }

    public void setAssocStore(String assocStore) {
        this.assocStore = assocStore;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOpenidAssociations that = (IdnOpenidAssociations) o;

        if (handle != null ? !handle.equals(that.handle) : that.handle != null) return false;
        if (assocType != null ? !assocType.equals(that.assocType) : that.assocType != null) return false;
        if (expireIn != null ? !expireIn.equals(that.expireIn) : that.expireIn != null) return false;
        if (macKey != null ? !macKey.equals(that.macKey) : that.macKey != null) return false;
        if (assocStore != null ? !assocStore.equals(that.assocStore) : that.assocStore != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = handle != null ? handle.hashCode() : 0;
        result = 31 * result + (assocType != null ? assocType.hashCode() : 0);
        result = 31 * result + (expireIn != null ? expireIn.hashCode() : 0);
        result = 31 * result + (macKey != null ? macKey.hashCode() : 0);
        result = 31 * result + (assocStore != null ? assocStore.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
