package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_EXTERNAL_STORES", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmExternalStores {
    private int apistoreId;
    private Integer apiId;
    private String storeId;
    private String storeDisplayName;
    private String storeEndpoint;
    private String storeType;
    private AmApi amApiByApiId;

    @Id
    @Column(name = "APISTORE_ID")
    public int getApistoreId() {
        return apistoreId;
    }

    public void setApistoreId(int apistoreId) {
        this.apistoreId = apistoreId;
    }

    @Basic
    @Column(name = "API_ID")
    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    @Basic
    @Column(name = "STORE_ID")
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "STORE_DISPLAY_NAME")
    public String getStoreDisplayName() {
        return storeDisplayName;
    }

    public void setStoreDisplayName(String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }

    @Basic
    @Column(name = "STORE_ENDPOINT")
    public String getStoreEndpoint() {
        return storeEndpoint;
    }

    public void setStoreEndpoint(String storeEndpoint) {
        this.storeEndpoint = storeEndpoint;
    }

    @Basic
    @Column(name = "STORE_TYPE")
    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmExternalStores that = (AmExternalStores) o;

        if (apistoreId != that.apistoreId) return false;
        if (apiId != null ? !apiId.equals(that.apiId) : that.apiId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (storeDisplayName != null ? !storeDisplayName.equals(that.storeDisplayName) : that.storeDisplayName != null)
            return false;
        if (storeEndpoint != null ? !storeEndpoint.equals(that.storeEndpoint) : that.storeEndpoint != null)
            return false;
        if (storeType != null ? !storeType.equals(that.storeType) : that.storeType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apistoreId;
        result = 31 * result + (apiId != null ? apiId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (storeDisplayName != null ? storeDisplayName.hashCode() : 0);
        result = 31 * result + (storeEndpoint != null ? storeEndpoint.hashCode() : 0);
        result = 31 * result + (storeType != null ? storeType.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "API_ID", referencedColumnName = "API_ID")
    public AmApi getAmApiByApiId() {
        return amApiByApiId;
    }

    public void setAmApiByApiId(AmApi amApiByApiId) {
        this.amApiByApiId = amApiByApiId;
    }
}
