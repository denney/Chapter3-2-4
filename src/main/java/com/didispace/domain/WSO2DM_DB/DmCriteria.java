package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_CRITERIA", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmCriteria {
    private int id;
    private int tenantId;
    private String name;
    private Collection<DmPolicyCriteria> dmPolicyCriteriaById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmCriteria that = (DmCriteria) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dmCriteriaByCriteriaId")
    public Collection<DmPolicyCriteria> getDmPolicyCriteriaById() {
        return dmPolicyCriteriaById;
    }

    public void setDmPolicyCriteriaById(Collection<DmPolicyCriteria> dmPolicyCriteriaById) {
        this.dmPolicyCriteriaById = dmPolicyCriteriaById;
    }
}
