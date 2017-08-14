package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class UmModuleActionsPK implements Serializable {
    private String umAction;
    private int umModuleId;

    @Column(name = "UM_ACTION")
    @Id
    public String getUmAction() {
        return umAction;
    }

    public void setUmAction(String umAction) {
        this.umAction = umAction;
    }

    @Column(name = "UM_MODULE_ID")
    @Id
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

        UmModuleActionsPK that = (UmModuleActionsPK) o;

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
}
