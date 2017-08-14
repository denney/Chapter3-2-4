package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_HEADER_FIELD_CONDITION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmHeaderFieldCondition {
    private int headerFieldId;
    private int conditionGroupId;
    private String headerFieldName;
    private String headerFieldValue;
    private Boolean isHeaderFieldMapping;
    private AmConditionGroup amConditionGroupByConditionGroupId;

    @Id
    @Column(name = "HEADER_FIELD_ID")
    public int getHeaderFieldId() {
        return headerFieldId;
    }

    public void setHeaderFieldId(int headerFieldId) {
        this.headerFieldId = headerFieldId;
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
    @Column(name = "HEADER_FIELD_NAME")
    public String getHeaderFieldName() {
        return headerFieldName;
    }

    public void setHeaderFieldName(String headerFieldName) {
        this.headerFieldName = headerFieldName;
    }

    @Basic
    @Column(name = "HEADER_FIELD_VALUE")
    public String getHeaderFieldValue() {
        return headerFieldValue;
    }

    public void setHeaderFieldValue(String headerFieldValue) {
        this.headerFieldValue = headerFieldValue;
    }

    @Basic
    @Column(name = "IS_HEADER_FIELD_MAPPING")
    public Boolean getHeaderFieldMapping() {
        return isHeaderFieldMapping;
    }

    public void setHeaderFieldMapping(Boolean headerFieldMapping) {
        isHeaderFieldMapping = headerFieldMapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmHeaderFieldCondition that = (AmHeaderFieldCondition) o;

        if (headerFieldId != that.headerFieldId) return false;
        if (conditionGroupId != that.conditionGroupId) return false;
        if (headerFieldName != null ? !headerFieldName.equals(that.headerFieldName) : that.headerFieldName != null)
            return false;
        if (headerFieldValue != null ? !headerFieldValue.equals(that.headerFieldValue) : that.headerFieldValue != null)
            return false;
        if (isHeaderFieldMapping != null ? !isHeaderFieldMapping.equals(that.isHeaderFieldMapping) : that.isHeaderFieldMapping != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = headerFieldId;
        result = 31 * result + conditionGroupId;
        result = 31 * result + (headerFieldName != null ? headerFieldName.hashCode() : 0);
        result = 31 * result + (headerFieldValue != null ? headerFieldValue.hashCode() : 0);
        result = 31 * result + (isHeaderFieldMapping != null ? isHeaderFieldMapping.hashCode() : 0);
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
