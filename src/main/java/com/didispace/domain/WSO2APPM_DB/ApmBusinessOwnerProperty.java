package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_BUSINESS_OWNER_PROPERTY", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmBusinessOwnerProperty {
    private int ownerPropId;
    private String name;
    private String value;
    private boolean showInStore;

    @Id
    @Column(name = "OWNER_PROP_ID")
    public int getOwnerPropId() {
        return ownerPropId;
    }

    public void setOwnerPropId(int ownerPropId) {
        this.ownerPropId = ownerPropId;
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
    @Column(name = "VALUE")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "SHOW_IN_STORE")
    public boolean isShowInStore() {
        return showInStore;
    }

    public void setShowInStore(boolean showInStore) {
        this.showInStore = showInStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmBusinessOwnerProperty that = (ApmBusinessOwnerProperty) o;

        if (ownerPropId != that.ownerPropId) return false;
        if (showInStore != that.showInStore) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ownerPropId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (showInStore ? 1 : 0);
        return result;
    }
}
