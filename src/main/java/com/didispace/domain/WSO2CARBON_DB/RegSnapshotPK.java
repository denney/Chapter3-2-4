package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class RegSnapshotPK implements Serializable {
    private int regSnapshotId;
    private int regTenantId;

    @Column(name = "REG_SNAPSHOT_ID")
    @Id
    public int getRegSnapshotId() {
        return regSnapshotId;
    }

    public void setRegSnapshotId(int regSnapshotId) {
        this.regSnapshotId = regSnapshotId;
    }

    @Column(name = "REG_TENANT_ID")
    @Id
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

        RegSnapshotPK that = (RegSnapshotPK) o;

        if (regSnapshotId != that.regSnapshotId) return false;
        if (regTenantId != that.regTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regSnapshotId;
        result = 31 * result + regTenantId;
        return result;
    }
}
