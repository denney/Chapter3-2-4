package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_QUERY_PARAMETER_CONDITION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmQueryParameterCondition {
    private int queryParameterId;
    private int conditionGroupId;
    private String parameterName;
    private String parameterValue;
    private Boolean isParamMapping;
    private AmConditionGroup amConditionGroupByConditionGroupId;

    @Id
    @Column(name = "QUERY_PARAMETER_ID")
    public int getQueryParameterId() {
        return queryParameterId;
    }

    public void setQueryParameterId(int queryParameterId) {
        this.queryParameterId = queryParameterId;
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
    @Column(name = "PARAMETER_NAME")
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    @Basic
    @Column(name = "PARAMETER_VALUE")
    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Basic
    @Column(name = "IS_PARAM_MAPPING")
    public Boolean getParamMapping() {
        return isParamMapping;
    }

    public void setParamMapping(Boolean paramMapping) {
        isParamMapping = paramMapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmQueryParameterCondition that = (AmQueryParameterCondition) o;

        if (queryParameterId != that.queryParameterId) return false;
        if (conditionGroupId != that.conditionGroupId) return false;
        if (parameterName != null ? !parameterName.equals(that.parameterName) : that.parameterName != null)
            return false;
        if (parameterValue != null ? !parameterValue.equals(that.parameterValue) : that.parameterValue != null)
            return false;
        if (isParamMapping != null ? !isParamMapping.equals(that.isParamMapping) : that.isParamMapping != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = queryParameterId;
        result = 31 * result + conditionGroupId;
        result = 31 * result + (parameterName != null ? parameterName.hashCode() : 0);
        result = 31 * result + (parameterValue != null ? parameterValue.hashCode() : 0);
        result = 31 * result + (isParamMapping != null ? isParamMapping.hashCode() : 0);
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
