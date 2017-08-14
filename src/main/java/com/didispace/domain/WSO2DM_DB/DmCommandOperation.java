package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_COMMAND_OPERATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmCommandOperation {
    private int operationId;
    private boolean enabled;
    private DmOperation dmOperationByOperationId;

    @Id
    @Column(name = "OPERATION_ID")
    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "ENABLED")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmCommandOperation that = (DmCommandOperation) o;

        if (operationId != that.operationId) return false;
        if (enabled != that.enabled) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationId;
        result = 31 * result + (enabled ? 1 : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "OPERATION_ID", referencedColumnName = "ID", nullable = false)
    public DmOperation getDmOperationByOperationId() {
        return dmOperationByOperationId;
    }

    public void setDmOperationByOperationId(DmOperation dmOperationByOperationId) {
        this.dmOperationByOperationId = dmOperationByOperationId;
    }
}
