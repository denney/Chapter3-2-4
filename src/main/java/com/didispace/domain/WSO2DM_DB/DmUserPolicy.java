package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_USER_POLICY", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmUserPolicy {
    private int id;
    private String username;
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
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmUserPolicy that = (DmUserPolicy) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
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
