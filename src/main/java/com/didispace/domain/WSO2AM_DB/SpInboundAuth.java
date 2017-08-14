package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_INBOUND_AUTH", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpInboundAuth {
    private int id;
    private int tenantId;
    private String inboundAuthKey;
    private String inboundAuthType;
    private String inboundConfigType;
    private String propName;
    private String propValue;
    private int appId;
    private SpApp spAppByAppId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "INBOUND_AUTH_KEY")
    public String getInboundAuthKey() {
        return inboundAuthKey;
    }

    public void setInboundAuthKey(String inboundAuthKey) {
        this.inboundAuthKey = inboundAuthKey;
    }

    @Basic
    @Column(name = "INBOUND_AUTH_TYPE")
    public String getInboundAuthType() {
        return inboundAuthType;
    }

    public void setInboundAuthType(String inboundAuthType) {
        this.inboundAuthType = inboundAuthType;
    }

    @Basic
    @Column(name = "INBOUND_CONFIG_TYPE")
    public String getInboundConfigType() {
        return inboundConfigType;
    }

    public void setInboundConfigType(String inboundConfigType) {
        this.inboundConfigType = inboundConfigType;
    }

    @Basic
    @Column(name = "PROP_NAME")
    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    @Basic
    @Column(name = "PROP_VALUE")
    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    @Basic
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpInboundAuth that = (SpInboundAuth) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (appId != that.appId) return false;
        if (inboundAuthKey != null ? !inboundAuthKey.equals(that.inboundAuthKey) : that.inboundAuthKey != null)
            return false;
        if (inboundAuthType != null ? !inboundAuthType.equals(that.inboundAuthType) : that.inboundAuthType != null)
            return false;
        if (inboundConfigType != null ? !inboundConfigType.equals(that.inboundConfigType) : that.inboundConfigType != null)
            return false;
        if (propName != null ? !propName.equals(that.propName) : that.propName != null) return false;
        if (propValue != null ? !propValue.equals(that.propValue) : that.propValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (inboundAuthKey != null ? inboundAuthKey.hashCode() : 0);
        result = 31 * result + (inboundAuthType != null ? inboundAuthType.hashCode() : 0);
        result = 31 * result + (inboundConfigType != null ? inboundConfigType.hashCode() : 0);
        result = 31 * result + (propName != null ? propName.hashCode() : 0);
        result = 31 * result + (propValue != null ? propValue.hashCode() : 0);
        result = 31 * result + appId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "ID", nullable = false)
    public SpApp getSpAppByAppId() {
        return spAppByAppId;
    }

    public void setSpAppByAppId(SpApp spAppByAppId) {
        this.spAppByAppId = spAppByAppId;
    }
}
