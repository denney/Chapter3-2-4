package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_SHARED_USER_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
public class UmSharedUserRole {
    private int umRoleId;
    private int umUserId;

    @Basic
    @Column(name = "UM_ROLE_ID")
    public int getUmRoleId() {
        return umRoleId;
    }

    public void setUmRoleId(int umRoleId) {
        this.umRoleId = umRoleId;
    }

    @Basic
    @Column(name = "UM_USER_ID")
    public int getUmUserId() {
        return umUserId;
    }

    public void setUmUserId(int umUserId) {
        this.umUserId = umUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmSharedUserRole that = (UmSharedUserRole) o;

        if (umRoleId != that.umRoleId) return false;
        if (umUserId != that.umUserId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umRoleId;
        result = 31 * result + umUserId;
        return result;
    }
}
