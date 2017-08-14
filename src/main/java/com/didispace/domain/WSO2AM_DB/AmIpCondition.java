package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_IP_CONDITION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmIpCondition {
    private int amIpConditionId;
    private String startingIp;
    private String endingIp;
    private String specificIp;
    private Boolean withinIpRange;
    private Integer conditionGroupId;
    private AmConditionGroup amConditionGroupByConditionGroupId;

    @Id
    @Column(name = "AM_IP_CONDITION_ID")
    public int getAmIpConditionId() {
        return amIpConditionId;
    }

    public void setAmIpConditionId(int amIpConditionId) {
        this.amIpConditionId = amIpConditionId;
    }

    @Basic
    @Column(name = "STARTING_IP")
    public String getStartingIp() {
        return startingIp;
    }

    public void setStartingIp(String startingIp) {
        this.startingIp = startingIp;
    }

    @Basic
    @Column(name = "ENDING_IP")
    public String getEndingIp() {
        return endingIp;
    }

    public void setEndingIp(String endingIp) {
        this.endingIp = endingIp;
    }

    @Basic
    @Column(name = "SPECIFIC_IP")
    public String getSpecificIp() {
        return specificIp;
    }

    public void setSpecificIp(String specificIp) {
        this.specificIp = specificIp;
    }

    @Basic
    @Column(name = "WITHIN_IP_RANGE")
    public Boolean getWithinIpRange() {
        return withinIpRange;
    }

    public void setWithinIpRange(Boolean withinIpRange) {
        this.withinIpRange = withinIpRange;
    }

    @Basic
    @Column(name = "CONDITION_GROUP_ID")
    public Integer getConditionGroupId() {
        return conditionGroupId;
    }

    public void setConditionGroupId(Integer conditionGroupId) {
        this.conditionGroupId = conditionGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmIpCondition that = (AmIpCondition) o;

        if (amIpConditionId != that.amIpConditionId) return false;
        if (startingIp != null ? !startingIp.equals(that.startingIp) : that.startingIp != null) return false;
        if (endingIp != null ? !endingIp.equals(that.endingIp) : that.endingIp != null) return false;
        if (specificIp != null ? !specificIp.equals(that.specificIp) : that.specificIp != null) return false;
        if (withinIpRange != null ? !withinIpRange.equals(that.withinIpRange) : that.withinIpRange != null)
            return false;
        if (conditionGroupId != null ? !conditionGroupId.equals(that.conditionGroupId) : that.conditionGroupId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amIpConditionId;
        result = 31 * result + (startingIp != null ? startingIp.hashCode() : 0);
        result = 31 * result + (endingIp != null ? endingIp.hashCode() : 0);
        result = 31 * result + (specificIp != null ? specificIp.hashCode() : 0);
        result = 31 * result + (withinIpRange != null ? withinIpRange.hashCode() : 0);
        result = 31 * result + (conditionGroupId != null ? conditionGroupId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CONDITION_GROUP_ID", referencedColumnName = "CONDITION_GROUP_ID")
    public AmConditionGroup getAmConditionGroupByConditionGroupId() {
        return amConditionGroupByConditionGroupId;
    }

    public void setAmConditionGroupByConditionGroupId(AmConditionGroup amConditionGroupByConditionGroupId) {
        this.amConditionGroupByConditionGroupId = amConditionGroupByConditionGroupId;
    }
}
