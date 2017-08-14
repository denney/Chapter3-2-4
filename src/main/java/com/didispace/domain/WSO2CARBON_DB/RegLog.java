package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_LOG", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegLogPK.class)
public class RegLog {
    private int regLogId;
    private String regPath;
    private String regUserId;
    private Timestamp regLoggedTime;
    private int regAction;
    private String regActionData;
    private int regTenantId;

    @Id
    @Column(name = "REG_LOG_ID")
    public int getRegLogId() {
        return regLogId;
    }

    public void setRegLogId(int regLogId) {
        this.regLogId = regLogId;
    }

    @Basic
    @Column(name = "REG_PATH")
    public String getRegPath() {
        return regPath;
    }

    public void setRegPath(String regPath) {
        this.regPath = regPath;
    }

    @Basic
    @Column(name = "REG_USER_ID")
    public String getRegUserId() {
        return regUserId;
    }

    public void setRegUserId(String regUserId) {
        this.regUserId = regUserId;
    }

    @Basic
    @Column(name = "REG_LOGGED_TIME")
    public Timestamp getRegLoggedTime() {
        return regLoggedTime;
    }

    public void setRegLoggedTime(Timestamp regLoggedTime) {
        this.regLoggedTime = regLoggedTime;
    }

    @Basic
    @Column(name = "REG_ACTION")
    public int getRegAction() {
        return regAction;
    }

    public void setRegAction(int regAction) {
        this.regAction = regAction;
    }

    @Basic
    @Column(name = "REG_ACTION_DATA")
    public String getRegActionData() {
        return regActionData;
    }

    public void setRegActionData(String regActionData) {
        this.regActionData = regActionData;
    }

    @Id
    @Column(name = "REG_TENANT_ID")
    public int getRegTenantId() {
        return regTenantId;
    }

    public void setRegTenantId(int regTenantId) {
        this.regTenantId = regTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegLog regLog = (RegLog) o;

        if (regLogId != regLog.regLogId) return false;
        if (regAction != regLog.regAction) return false;
        if (regTenantId != regLog.regTenantId) return false;
        if (regPath != null ? !regPath.equals(regLog.regPath) : regLog.regPath != null) return false;
        if (regUserId != null ? !regUserId.equals(regLog.regUserId) : regLog.regUserId != null) return false;
        if (regLoggedTime != null ? !regLoggedTime.equals(regLog.regLoggedTime) : regLog.regLoggedTime != null)
            return false;
        if (regActionData != null ? !regActionData.equals(regLog.regActionData) : regLog.regActionData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regLogId;
        result = 31 * result + (regPath != null ? regPath.hashCode() : 0);
        result = 31 * result + (regUserId != null ? regUserId.hashCode() : 0);
        result = 31 * result + (regLoggedTime != null ? regLoggedTime.hashCode() : 0);
        result = 31 * result + regAction;
        result = 31 * result + (regActionData != null ? regActionData.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
