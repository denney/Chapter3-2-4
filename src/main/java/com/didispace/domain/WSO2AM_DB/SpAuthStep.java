package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_AUTH_STEP", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpAuthStep {
    private int id;
    private int tenantId;
    private Integer stepOrder;
    private int appId;
    private String isSubjectStep;
    private String isAttributeStep;
    private SpApp spAppByAppId;
    private Collection<SpFederatedIdp> spFederatedIdpsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "STEP_ORDER")
    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }

    @Basic
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "IS_SUBJECT_STEP")
    public String getIsSubjectStep() {
        return isSubjectStep;
    }

    public void setIsSubjectStep(String isSubjectStep) {
        this.isSubjectStep = isSubjectStep;
    }

    @Basic
    @Column(name = "IS_ATTRIBUTE_STEP")
    public String getIsAttributeStep() {
        return isAttributeStep;
    }

    public void setIsAttributeStep(String isAttributeStep) {
        this.isAttributeStep = isAttributeStep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpAuthStep that = (SpAuthStep) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (appId != that.appId) return false;
        if (stepOrder != null ? !stepOrder.equals(that.stepOrder) : that.stepOrder != null) return false;
        if (isSubjectStep != null ? !isSubjectStep.equals(that.isSubjectStep) : that.isSubjectStep != null)
            return false;
        if (isAttributeStep != null ? !isAttributeStep.equals(that.isAttributeStep) : that.isAttributeStep != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (stepOrder != null ? stepOrder.hashCode() : 0);
        result = 31 * result + appId;
        result = 31 * result + (isSubjectStep != null ? isSubjectStep.hashCode() : 0);
        result = 31 * result + (isAttributeStep != null ? isAttributeStep.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "ID", nullable = false)
    public SpApp getSpAppByAppId() {
        return spAppByAppId;
    }

    public void setSpAppByAppId(SpApp spAppByAppId) {
        this.spAppByAppId = spAppByAppId;
    }

    @OneToMany(mappedBy = "spAuthStepById")
    public Collection<SpFederatedIdp> getSpFederatedIdpsById() {
        return spFederatedIdpsById;
    }

    public void setSpFederatedIdpsById(Collection<SpFederatedIdp> spFederatedIdpsById) {
        this.spFederatedIdpsById = spFederatedIdpsById;
    }
}
