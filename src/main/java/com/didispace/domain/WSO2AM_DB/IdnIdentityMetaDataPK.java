package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class IdnIdentityMetaDataPK implements Serializable {
    private String userName;
    private int tenantId;
    private String metadataType;
    private String metadata;

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

    @Column(name = "METADATA_TYPE")
    @Id
    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    @Column(name = "METADATA")
    @Id
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnIdentityMetaDataPK that = (IdnIdentityMetaDataPK) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (metadataType != null ? !metadataType.equals(that.metadataType) : that.metadataType != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + tenantId;
        result = 31 * result + (metadataType != null ? metadataType.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        return result;
    }
}
