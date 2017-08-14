package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_CONTENT", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegContentPK.class)
public class RegContent {
    private int regContentId;
    private byte[] regContentData;
    private int regTenantId;

    @Id
    @Column(name = "REG_CONTENT_ID")
    public int getRegContentId() {
        return regContentId;
    }

    public void setRegContentId(int regContentId) {
        this.regContentId = regContentId;
    }

    @Basic
    @Column(name = "REG_CONTENT_DATA")
    public byte[] getRegContentData() {
        return regContentData;
    }

    public void setRegContentData(byte[] regContentData) {
        this.regContentData = regContentData;
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

        RegContent that = (RegContent) o;

        if (regContentId != that.regContentId) return false;
        if (regTenantId != that.regTenantId) return false;
        if (!Arrays.equals(regContentData, that.regContentData)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regContentId;
        result = 31 * result + Arrays.hashCode(regContentData);
        result = 31 * result + regTenantId;
        return result;
    }
}
