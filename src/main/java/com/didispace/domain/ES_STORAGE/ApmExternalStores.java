package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_EXTERNAL_STORES", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmExternalStores {
    private int appStoreId;
    private String storeId;

    @Id
    @Column(name = "APP_STORE_ID")
    public int getAppStoreId() {
        return appStoreId;
    }

    public void setAppStoreId(int appStoreId) {
        this.appStoreId = appStoreId;
    }

    @Basic
    @Column(name = "STORE_ID")
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmExternalStores that = (ApmExternalStores) o;

        if (appStoreId != that.appStoreId) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appStoreId;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
