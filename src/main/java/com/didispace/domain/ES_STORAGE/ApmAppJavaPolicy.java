package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_JAVA_POLICY", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppJavaPolicy {
    private int javaPolicyId;
    private String displayName;
    private String fullQualifiName;
    private String description;
    private int displayOrderSeqNo;
    private Boolean isMandatory;
    private String policyProperties;
    private Boolean isGlobal;

    @Id
    @Column(name = "JAVA_POLICY_ID")
    public int getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(int javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
    }

    @Basic
    @Column(name = "DISPLAY_NAME")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "FULL_QUALIFI_NAME")
    public String getFullQualifiName() {
        return fullQualifiName;
    }

    public void setFullQualifiName(String fullQualifiName) {
        this.fullQualifiName = fullQualifiName;
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
    @Column(name = "DISPLAY_ORDER_SEQ_NO")
    public int getDisplayOrderSeqNo() {
        return displayOrderSeqNo;
    }

    public void setDisplayOrderSeqNo(int displayOrderSeqNo) {
        this.displayOrderSeqNo = displayOrderSeqNo;
    }

    @Basic
    @Column(name = "IS_MANDATORY")
    public Boolean getMandatory() {
        return isMandatory;
    }

    public void setMandatory(Boolean mandatory) {
        isMandatory = mandatory;
    }

    @Basic
    @Column(name = "POLICY_PROPERTIES")
    public String getPolicyProperties() {
        return policyProperties;
    }

    public void setPolicyProperties(String policyProperties) {
        this.policyProperties = policyProperties;
    }

    @Basic
    @Column(name = "IS_GLOBAL")
    public Boolean getGlobal() {
        return isGlobal;
    }

    public void setGlobal(Boolean global) {
        isGlobal = global;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppJavaPolicy that = (ApmAppJavaPolicy) o;

        if (javaPolicyId != that.javaPolicyId) return false;
        if (displayOrderSeqNo != that.displayOrderSeqNo) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (fullQualifiName != null ? !fullQualifiName.equals(that.fullQualifiName) : that.fullQualifiName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isMandatory != null ? !isMandatory.equals(that.isMandatory) : that.isMandatory != null) return false;
        if (policyProperties != null ? !policyProperties.equals(that.policyProperties) : that.policyProperties != null)
            return false;
        if (isGlobal != null ? !isGlobal.equals(that.isGlobal) : that.isGlobal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = javaPolicyId;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (fullQualifiName != null ? fullQualifiName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + displayOrderSeqNo;
        result = 31 * result + (isMandatory != null ? isMandatory.hashCode() : 0);
        result = 31 * result + (policyProperties != null ? policyProperties.hashCode() : 0);
        result = 31 * result + (isGlobal != null ? isGlobal.hashCode() : 0);
        return result;
    }
}
