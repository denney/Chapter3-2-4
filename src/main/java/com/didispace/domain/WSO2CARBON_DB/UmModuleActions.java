package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_MODULE_ACTIONS", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmModuleActionsPK.class)
public class UmModuleActions {
    private String umAction;
    private int umModuleId;
    private UmModule umModuleByUmModuleId;

    @Id
    @Column(name = "UM_ACTION")
    public String getUmAction() {
        return umAction;
    }

    public void setUmAction(String umAction) {
        this.umAction = umAction;
    }

    @Id
    @Column(name = "UM_MODULE_ID")
    public int getUmModuleId() {
        return umModuleId;
    }

    public void setUmModuleId(int umModuleId) {
        this.umModuleId = umModuleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmModuleActions that = (UmModuleActions) o;

        if (umModuleId != that.umModuleId) return false;
        if (umAction != null ? !umAction.equals(that.umAction) : that.umAction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umAction != null ? umAction.hashCode() : 0;
        result = 31 * result + umModuleId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "UM_MODULE_ID", referencedColumnName = "UM_ID", nullable = false)
    public UmModule getUmModuleByUmModuleId() {
        return umModuleByUmModuleId;
    }

    public void setUmModuleByUmModuleId(UmModule umModuleByUmModuleId) {
        this.umModuleByUmModuleId = umModuleByUmModuleId;
    }
}
