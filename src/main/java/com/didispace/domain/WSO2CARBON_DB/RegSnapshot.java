package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "REG_SNAPSHOT", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(RegSnapshotPK.class)
public class RegSnapshot {
    private int regSnapshotId;
    private int regPathId;
    private String regResourceName;
    private byte[] regResourceVids;
    private int regTenantId;

    @Id
    @Column(name = "REG_SNAPSHOT_ID")
    public int getRegSnapshotId() {
        return regSnapshotId;
    }

    public void setRegSnapshotId(int regSnapshotId) {
        this.regSnapshotId = regSnapshotId;
    }

    @Basic
    @Column(name = "REG_PATH_ID")
    public int getRegPathId() {
        return regPathId;
    }

    public void setRegPathId(int regPathId) {
        this.regPathId = regPathId;
    }

    @Basic
    @Column(name = "REG_RESOURCE_NAME")
    public String getRegResourceName() {
        return regResourceName;
    }

    public void setRegResourceName(String regResourceName) {
        this.regResourceName = regResourceName;
    }

    @Basic
    @Column(name = "REG_RESOURCE_VIDS")
    public byte[] getRegResourceVids() {
        return regResourceVids;
    }

    public void setRegResourceVids(byte[] regResourceVids) {
        this.regResourceVids = regResourceVids;
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

        RegSnapshot that = (RegSnapshot) o;

        if (regSnapshotId != that.regSnapshotId) return false;
        if (regPathId != that.regPathId) return false;
        if (regTenantId != that.regTenantId) return false;
        if (regResourceName != null ? !regResourceName.equals(that.regResourceName) : that.regResourceName != null)
            return false;
        if (!Arrays.equals(regResourceVids, that.regResourceVids)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regSnapshotId;
        result = 31 * result + regPathId;
        result = 31 * result + (regResourceName != null ? regResourceName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(regResourceVids);
        result = 31 * result + regTenantId;
        return result;
    }
}
