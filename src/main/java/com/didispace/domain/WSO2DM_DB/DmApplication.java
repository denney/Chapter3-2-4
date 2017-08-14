package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_APPLICATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmApplication {
    private int id;
    private String name;
    private String appIdentifier;
    private String platform;
    private String category;
    private String version;
    private String type;
    private String locationUrl;
    private String imageUrl;
    private byte[] appProperties;
    private Integer memoryUsage;
    private boolean isActive;
    private int tenantId;
    private Collection<DmDeviceApplicationMapping> dmDeviceApplicationMappingsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "APP_IDENTIFIER")
    public String getAppIdentifier() {
        return appIdentifier;
    }

    public void setAppIdentifier(String appIdentifier) {
        this.appIdentifier = appIdentifier;
    }

    @Basic
    @Column(name = "PLATFORM")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Basic
    @Column(name = "CATEGORY")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "VERSION")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "LOCATION_URL")
    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    @Basic
    @Column(name = "IMAGE_URL")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "APP_PROPERTIES")
    public byte[] getAppProperties() {
        return appProperties;
    }

    public void setAppProperties(byte[] appProperties) {
        this.appProperties = appProperties;
    }

    @Basic
    @Column(name = "MEMORY_USAGE")
    public Integer getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Integer memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    @Basic
    @Column(name = "IS_ACTIVE")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmApplication that = (DmApplication) o;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (tenantId != that.tenantId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (appIdentifier != null ? !appIdentifier.equals(that.appIdentifier) : that.appIdentifier != null)
            return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (locationUrl != null ? !locationUrl.equals(that.locationUrl) : that.locationUrl != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
        if (!Arrays.equals(appProperties, that.appProperties)) return false;
        if (memoryUsage != null ? !memoryUsage.equals(that.memoryUsage) : that.memoryUsage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (appIdentifier != null ? appIdentifier.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (locationUrl != null ? locationUrl.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(appProperties);
        result = 31 * result + (memoryUsage != null ? memoryUsage.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @OneToMany(mappedBy = "dmApplicationByApplicationId")
    public Collection<DmDeviceApplicationMapping> getDmDeviceApplicationMappingsById() {
        return dmDeviceApplicationMappingsById;
    }

    public void setDmDeviceApplicationMappingsById(Collection<DmDeviceApplicationMapping> dmDeviceApplicationMappingsById) {
        this.dmDeviceApplicationMappingsById = dmDeviceApplicationMappingsById;
    }
}
