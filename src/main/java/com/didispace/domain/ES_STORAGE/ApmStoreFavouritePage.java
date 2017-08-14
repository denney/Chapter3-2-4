package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_STORE_FAVOURITE_PAGE", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmStoreFavouritePage {
    private int id;
    private String userId;
    private int tenantIdOfUser;
    private int tenantIdOfStore;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "TENANT_ID_OF_USER")
    public int getTenantIdOfUser() {
        return tenantIdOfUser;
    }

    public void setTenantIdOfUser(int tenantIdOfUser) {
        this.tenantIdOfUser = tenantIdOfUser;
    }

    @Basic
    @Column(name = "TENANT_ID_OF_STORE")
    public int getTenantIdOfStore() {
        return tenantIdOfStore;
    }

    public void setTenantIdOfStore(int tenantIdOfStore) {
        this.tenantIdOfStore = tenantIdOfStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmStoreFavouritePage that = (ApmStoreFavouritePage) o;

        if (id != that.id) return false;
        if (tenantIdOfUser != that.tenantIdOfUser) return false;
        if (tenantIdOfStore != that.tenantIdOfStore) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + tenantIdOfUser;
        result = 31 * result + tenantIdOfStore;
        return result;
    }
}
