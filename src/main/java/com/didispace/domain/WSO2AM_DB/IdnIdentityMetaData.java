package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_IDENTITY_META_DATA", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnIdentityMetaDataPK.class)
public class IdnIdentityMetaData {
    private String userName;
    private int tenantId;
    private String metadataType;
    private String metadata;
    private String valid;

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Id
    @Column(name = "METADATA_TYPE")
    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    @Id
    @Column(name = "METADATA")
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Basic
    @Column(name = "VALID")
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnIdentityMetaData that = (IdnIdentityMetaData) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (metadataType != null ? !metadataType.equals(that.metadataType) : that.metadataType != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + tenantId;
        result = 31 * result + (metadataType != null ? metadataType.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
