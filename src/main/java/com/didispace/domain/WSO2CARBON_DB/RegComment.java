package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_COMMENT", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegCommentPK.class)
public class RegComment {
    private int regId;
    private String regCommentText;
    private String regUserId;
    private Timestamp regCommentedTime;
    private int regTenantId;

    @Id
    @Column(name = "REG_ID")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "REG_COMMENT_TEXT")
    public String getRegCommentText() {
        return regCommentText;
    }

    public void setRegCommentText(String regCommentText) {
        this.regCommentText = regCommentText;
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
    @Column(name = "REG_COMMENTED_TIME")
    public Timestamp getRegCommentedTime() {
        return regCommentedTime;
    }

    public void setRegCommentedTime(Timestamp regCommentedTime) {
        this.regCommentedTime = regCommentedTime;
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

        RegComment that = (RegComment) o;

        if (regId != that.regId) return false;
        if (regTenantId != that.regTenantId) return false;
        if (regCommentText != null ? !regCommentText.equals(that.regCommentText) : that.regCommentText != null)
            return false;
        if (regUserId != null ? !regUserId.equals(that.regUserId) : that.regUserId != null) return false;
        if (regCommentedTime != null ? !regCommentedTime.equals(that.regCommentedTime) : that.regCommentedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + (regCommentText != null ? regCommentText.hashCode() : 0);
        result = 31 * result + (regUserId != null ? regUserId.hashCode() : 0);
        result = 31 * result + (regCommentedTime != null ? regCommentedTime.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
