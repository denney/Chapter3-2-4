package com.didispace.domain.ES_STORAGE;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
public class Resource {
    private String uuid;
    private String tenantid;
    private String filename;
    private Integer contentlength;
    private String contenttype;
    private byte[] content;

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "TENANTID")
    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    @Basic
    @Column(name = "FILENAME")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "CONTENTLENGTH")
    public Integer getContentlength() {
        return contentlength;
    }

    public void setContentlength(Integer contentlength) {
        this.contentlength = contentlength;
    }

    @Basic
    @Column(name = "CONTENTTYPE")
    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    @Basic
    @Column(name = "CONTENT")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resource resource = (Resource) o;

        if (uuid != null ? !uuid.equals(resource.uuid) : resource.uuid != null) return false;
        if (tenantid != null ? !tenantid.equals(resource.tenantid) : resource.tenantid != null) return false;
        if (filename != null ? !filename.equals(resource.filename) : resource.filename != null) return false;
        if (contentlength != null ? !contentlength.equals(resource.contentlength) : resource.contentlength != null)
            return false;
        if (contenttype != null ? !contenttype.equals(resource.contenttype) : resource.contenttype != null)
            return false;
        if (!Arrays.equals(content, resource.content)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (tenantid != null ? tenantid.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (contentlength != null ? contentlength.hashCode() : 0);
        result = 31 * result + (contenttype != null ? contenttype.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }
}
