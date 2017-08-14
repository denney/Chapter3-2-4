package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY_CRITERIA_PROPERTIES", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicyCriteriaProperties {
    private int id;
    private String propKey;
    private String propValue;
    private byte[] content;
    private DmPolicyCriteria dmPolicyCriteriaByPolicyCriterionId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PROP_KEY")
    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    @Basic
    @Column(name = "PROP_VALUE")
    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
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

        DmPolicyCriteriaProperties that = (DmPolicyCriteriaProperties) o;

        if (id != that.id) return false;
        if (propKey != null ? !propKey.equals(that.propKey) : that.propKey != null) return false;
        if (propValue != null ? !propValue.equals(that.propValue) : that.propValue != null) return false;
        if (!Arrays.equals(content, that.content)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (propKey != null ? propKey.hashCode() : 0);
        result = 31 * result + (propValue != null ? propValue.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_CRITERION_ID", referencedColumnName = "ID", nullable = false)
    public DmPolicyCriteria getDmPolicyCriteriaByPolicyCriterionId() {
        return dmPolicyCriteriaByPolicyCriterionId;
    }

    public void setDmPolicyCriteriaByPolicyCriterionId(DmPolicyCriteria dmPolicyCriteriaByPolicyCriterionId) {
        this.dmPolicyCriteriaByPolicyCriterionId = dmPolicyCriteriaByPolicyCriterionId;
    }
}
