package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_RECOVERY_DATA", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnRecoveryDataPK.class)
public class IdnRecoveryData {
    private String userName;
    private String userDomain;
    private int tenantId;
    private String code;
    private String scenario;
    private String step;
    private Timestamp timeCreated;
    private String remainingSets;

    @Id
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @Column(name = "USER_DOMAIN")
    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    @Id
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @Column(name = "SCENARIO")
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    @Id
    @Column(name = "STEP")
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Basic
    @Column(name = "TIME_CREATED")
    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Basic
    @Column(name = "REMAINING_SETS")
    public String getRemainingSets() {
        return remainingSets;
    }

    public void setRemainingSets(String remainingSets) {
        this.remainingSets = remainingSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnRecoveryData that = (IdnRecoveryData) o;

        if (tenantId != that.tenantId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userDomain != null ? !userDomain.equals(that.userDomain) : that.userDomain != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (scenario != null ? !scenario.equals(that.scenario) : that.scenario != null) return false;
        if (step != null ? !step.equals(that.step) : that.step != null) return false;
        if (timeCreated != null ? !timeCreated.equals(that.timeCreated) : that.timeCreated != null) return false;
        if (remainingSets != null ? !remainingSets.equals(that.remainingSets) : that.remainingSets != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (userDomain != null ? userDomain.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (scenario != null ? scenario.hashCode() : 0);
        result = 31 * result + (step != null ? step.hashCode() : 0);
        result = 31 * result + (timeCreated != null ? timeCreated.hashCode() : 0);
        result = 31 * result + (remainingSets != null ? remainingSets.hashCode() : 0);
        return result;
    }
}
