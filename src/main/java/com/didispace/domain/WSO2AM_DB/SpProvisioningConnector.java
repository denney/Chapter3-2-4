package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_PROVISIONING_CONNECTOR", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpProvisioningConnector {
    private int id;
    private int tenantId;
    private String idpName;
    private String connectorName;
    private int appId;
    private String isJitEnabled;
    private String blocking;
    private String ruleEnabled;
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
    @Column(name = "IDP_NAME")
    public String getIdpName() {
        return idpName;
    }

    public void setIdpName(String idpName) {
        this.idpName = idpName;
    }

    @Basic
    @Column(name = "CONNECTOR_NAME")
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    @Basic
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "IS_JIT_ENABLED")
    public String getIsJitEnabled() {
        return isJitEnabled;
    }

    public void setIsJitEnabled(String isJitEnabled) {
        this.isJitEnabled = isJitEnabled;
    }

    @Basic
    @Column(name = "BLOCKING")
    public String getBlocking() {
        return blocking;
    }

    public void setBlocking(String blocking) {
        this.blocking = blocking;
    }

    @Basic
    @Column(name = "RULE_ENABLED")
    public String getRuleEnabled() {
        return ruleEnabled;
    }

    public void setRuleEnabled(String ruleEnabled) {
        this.ruleEnabled = ruleEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpProvisioningConnector that = (SpProvisioningConnector) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (appId != that.appId) return false;
        if (idpName != null ? !idpName.equals(that.idpName) : that.idpName != null) return false;
        if (connectorName != null ? !connectorName.equals(that.connectorName) : that.connectorName != null)
            return false;
        if (isJitEnabled != null ? !isJitEnabled.equals(that.isJitEnabled) : that.isJitEnabled != null) return false;
        if (blocking != null ? !blocking.equals(that.blocking) : that.blocking != null) return false;
        if (ruleEnabled != null ? !ruleEnabled.equals(that.ruleEnabled) : that.ruleEnabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (idpName != null ? idpName.hashCode() : 0);
        result = 31 * result + (connectorName != null ? connectorName.hashCode() : 0);
        result = 31 * result + appId;
        result = 31 * result + (isJitEnabled != null ? isJitEnabled.hashCode() : 0);
        result = 31 * result + (blocking != null ? blocking.hashCode() : 0);
        result = 31 * result + (ruleEnabled != null ? ruleEnabled.hashCode() : 0);
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
