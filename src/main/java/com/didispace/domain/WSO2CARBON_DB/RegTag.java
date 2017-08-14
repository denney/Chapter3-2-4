package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_TAG", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegTagPK.class)
public class RegTag {
    private int regId;
    private String regTagName;
    private String regUserId;
    private Timestamp regTaggedTime;
    private int regTenantId;
    private RegResourceTag regResourceTagByRegTenantId;

    @Id
    @Column(name = "REG_ID")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "REG_TAG_NAME")
    public String getRegTagName() {
        return regTagName;
    }

    public void setRegTagName(String regTagName) {
        this.regTagName = regTagName;
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
    @Column(name = "REG_TAGGED_TIME")
    public Timestamp getRegTaggedTime() {
        return regTaggedTime;
    }

    public void setRegTaggedTime(Timestamp regTaggedTime) {
        this.regTaggedTime = regTaggedTime;
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

        RegTag regTag = (RegTag) o;

        if (regId != regTag.regId) return false;
        if (regTenantId != regTag.regTenantId) return false;
        if (regTagName != null ? !regTagName.equals(regTag.regTagName) : regTag.regTagName != null) return false;
        if (regUserId != null ? !regUserId.equals(regTag.regUserId) : regTag.regUserId != null) return false;
        if (regTaggedTime != null ? !regTaggedTime.equals(regTag.regTaggedTime) : regTag.regTaggedTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + (regTagName != null ? regTagName.hashCode() : 0);
        result = 31 * result + (regUserId != null ? regUserId.hashCode() : 0);
        result = 31 * result + (regTaggedTime != null ? regTaggedTime.hashCode() : 0);
        result = 31 * result + regTenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "REG_TENANT_ID", referencedColumnName = "REG_TENANT_ID", nullable = false)
    public RegResourceTag getRegResourceTagByRegTenantId() {
        return regResourceTagByRegTenantId;
    }

    public void setRegResourceTagByRegTenantId(RegResourceTag regResourceTagByRegTenantId) {
        this.regResourceTagByRegTenantId = regResourceTagByRegTenantId;
    }
}
