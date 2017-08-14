package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_ONE_TIME_DOWNLOAD_LINK", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmOneTimeDownloadLink {
    private int id;
    private String binaryFile;
    private String uuid;
    private boolean isDownloaded;
    private String username;
    private Integer tenantId;
    private String tenantDomain;
    private Timestamp createdTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BINARY_FILE")
    public String getBinaryFile() {
        return binaryFile;
    }

    public void setBinaryFile(String binaryFile) {
        this.binaryFile = binaryFile;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "IS_DOWNLOADED")
    public boolean isDownloaded() {
        return isDownloaded;
    }

    public void setDownloaded(boolean downloaded) {
        isDownloaded = downloaded;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "TENANT_DOMAIN")
    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    @Basic
    @Column(name = "CREATED_TIME")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmOneTimeDownloadLink that = (ApmOneTimeDownloadLink) o;

        if (id != that.id) return false;
        if (isDownloaded != that.isDownloaded) return false;
        if (binaryFile != null ? !binaryFile.equals(that.binaryFile) : that.binaryFile != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (tenantDomain != null ? !tenantDomain.equals(that.tenantDomain) : that.tenantDomain != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (binaryFile != null ? binaryFile.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (isDownloaded ? 1 : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (tenantDomain != null ? tenantDomain.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        return result;
    }
}
