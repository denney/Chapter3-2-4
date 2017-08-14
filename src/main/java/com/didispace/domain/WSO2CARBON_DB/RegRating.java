package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_RATING", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegRatingPK.class)
public class RegRating {
    private int regId;
    private int regRating;
    private String regUserId;
    private Timestamp regRatedTime;
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
    @Column(name = "REG_RATING")
    public int getRegRating() {
        return regRating;
    }

    public void setRegRating(int regRating) {
        this.regRating = regRating;
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
    @Column(name = "REG_RATED_TIME")
    public Timestamp getRegRatedTime() {
        return regRatedTime;
    }

    public void setRegRatedTime(Timestamp regRatedTime) {
        this.regRatedTime = regRatedTime;
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

        RegRating regRating1 = (RegRating) o;

        if (regId != regRating1.regId) return false;
        if (regRating != regRating1.regRating) return false;
        if (regTenantId != regRating1.regTenantId) return false;
        if (regUserId != null ? !regUserId.equals(regRating1.regUserId) : regRating1.regUserId != null) return false;
        if (regRatedTime != null ? !regRatedTime.equals(regRating1.regRatedTime) : regRating1.regRatedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + regRating;
        result = 31 * result + (regUserId != null ? regUserId.hashCode() : 0);
        result = 31 * result + (regRatedTime != null ? regRatedTime.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }
}
