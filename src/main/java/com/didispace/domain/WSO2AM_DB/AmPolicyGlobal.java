package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_POLICY_GLOBAL", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmPolicyGlobal {
    private int policyId;
    private String name;
    private String keyTemplate;
    private int tenantId;
    private String description;
    private byte[] siddhiQuery;
    private byte isDeployed;
    private String uuid;

    @Id
    @Column(name = "POLICY_ID")
    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "KEY_TEMPLATE")
    public String getKeyTemplate() {
        return keyTemplate;
    }

    public void setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
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
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "SIDDHI_QUERY")
    public byte[] getSiddhiQuery() {
        return siddhiQuery;
    }

    public void setSiddhiQuery(byte[] siddhiQuery) {
        this.siddhiQuery = siddhiQuery;
    }

    @Basic
    @Column(name = "IS_DEPLOYED")
    public byte getIsDeployed() {
        return isDeployed;
    }

    public void setIsDeployed(byte isDeployed) {
        this.isDeployed = isDeployed;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmPolicyGlobal that = (AmPolicyGlobal) o;

        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (isDeployed != that.isDeployed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (keyTemplate != null ? !keyTemplate.equals(that.keyTemplate) : that.keyTemplate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!Arrays.equals(siddhiQuery, that.siddhiQuery)) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keyTemplate != null ? keyTemplate.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(siddhiQuery);
        result = 31 * result + (int) isDeployed;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
