package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_ROLE_POLICY", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmRolePolicy {
    private int id;
    private String roleName;
    private DmPolicy dmPolicyByPolicyId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmRolePolicy that = (DmRolePolicy) o;

        if (id != that.id) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID", nullable = false)
    public DmPolicy getDmPolicyByPolicyId() {
        return dmPolicyByPolicyId;
    }

    public void setDmPolicyByPolicyId(DmPolicy dmPolicyByPolicyId) {
        this.dmPolicyByPolicyId = dmPolicyByPolicyId;
    }
}
