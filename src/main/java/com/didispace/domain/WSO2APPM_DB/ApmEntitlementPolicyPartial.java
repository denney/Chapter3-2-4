package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_ENTITLEMENT_POLICY_PARTIAL", schema = "PUBLIC", catalog = "WSO2APPM_DB")
public class ApmEntitlementPolicyPartial {
    private int entitlementPolicyPartialId;
    private String name;
    private String content;
    private Boolean shared;
    private String author;
    private String description;
    private Integer tenantId;

    @Id
    @Column(name = "ENTITLEMENT_POLICY_PARTIAL_ID")
    public int getEntitlementPolicyPartialId() {
        return entitlementPolicyPartialId;
    }

    public void setEntitlementPolicyPartialId(int entitlementPolicyPartialId) {
        this.entitlementPolicyPartialId = entitlementPolicyPartialId;
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
    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "SHARED")
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @Basic
    @Column(name = "AUTHOR")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmEntitlementPolicyPartial that = (ApmEntitlementPolicyPartial) o;

        if (entitlementPolicyPartialId != that.entitlementPolicyPartialId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (shared != null ? !shared.equals(that.shared) : that.shared != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entitlementPolicyPartialId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (shared != null ? shared.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
