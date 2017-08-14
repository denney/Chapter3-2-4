package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_SCIM_GROUP", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnScimGroup {
    private int id;
    private int tenantId;
    private String roleName;
    private String attrName;
    private String attrValue;

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
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ATTR_NAME")
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Basic
    @Column(name = "ATTR_VALUE")
    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnScimGroup that = (IdnScimGroup) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (attrName != null ? !attrName.equals(that.attrName) : that.attrName != null) return false;
        if (attrValue != null ? !attrValue.equals(that.attrValue) : that.attrValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (attrName != null ? attrName.hashCode() : 0);
        result = 31 * result + (attrValue != null ? attrValue.hashCode() : 0);
        return result;
    }
}
