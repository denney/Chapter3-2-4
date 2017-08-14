package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_JWT_CLAIM_CONDITION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmJwtClaimCondition {
    private int jwtClaimId;
    private int conditionGroupId;
    private String claimUri;
    private String claimAttrib;
    private Boolean isClaimMapping;
    private AmConditionGroup amConditionGroupByConditionGroupId;

    @Id
    @Column(name = "JWT_CLAIM_ID")
    public int getJwtClaimId() {
        return jwtClaimId;
    }

    public void setJwtClaimId(int jwtClaimId) {
        this.jwtClaimId = jwtClaimId;
    }

    @Basic
    @Column(name = "CONDITION_GROUP_ID")
    public int getConditionGroupId() {
        return conditionGroupId;
    }

    public void setConditionGroupId(int conditionGroupId) {
        this.conditionGroupId = conditionGroupId;
    }

    @Basic
    @Column(name = "CLAIM_URI")
    public String getClaimUri() {
        return claimUri;
    }

    public void setClaimUri(String claimUri) {
        this.claimUri = claimUri;
    }

    @Basic
    @Column(name = "CLAIM_ATTRIB")
    public String getClaimAttrib() {
        return claimAttrib;
    }

    public void setClaimAttrib(String claimAttrib) {
        this.claimAttrib = claimAttrib;
    }

    @Basic
    @Column(name = "IS_CLAIM_MAPPING")
    public Boolean getClaimMapping() {
        return isClaimMapping;
    }

    public void setClaimMapping(Boolean claimMapping) {
        isClaimMapping = claimMapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmJwtClaimCondition that = (AmJwtClaimCondition) o;

        if (jwtClaimId != that.jwtClaimId) return false;
        if (conditionGroupId != that.conditionGroupId) return false;
        if (claimUri != null ? !claimUri.equals(that.claimUri) : that.claimUri != null) return false;
        if (claimAttrib != null ? !claimAttrib.equals(that.claimAttrib) : that.claimAttrib != null) return false;
        if (isClaimMapping != null ? !isClaimMapping.equals(that.isClaimMapping) : that.isClaimMapping != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jwtClaimId;
        result = 31 * result + conditionGroupId;
        result = 31 * result + (claimUri != null ? claimUri.hashCode() : 0);
        result = 31 * result + (claimAttrib != null ? claimAttrib.hashCode() : 0);
        result = 31 * result + (isClaimMapping != null ? isClaimMapping.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CONDITION_GROUP_ID", referencedColumnName = "CONDITION_GROUP_ID", nullable = false)
    public AmConditionGroup getAmConditionGroupByConditionGroupId() {
        return amConditionGroupByConditionGroupId;
    }

    public void setAmConditionGroupByConditionGroupId(AmConditionGroup amConditionGroupByConditionGroupId) {
        this.amConditionGroupByConditionGroupId = amConditionGroupByConditionGroupId;
    }
}
