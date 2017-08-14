package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY_OPERATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicyOperation {
    private int operationId;
    private int enabled;
    private byte[] operationDetails;
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
    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "OPERATION_DETAILS")
    public byte[] getOperationDetails() {
        return operationDetails;
    }

    public void setOperationDetails(byte[] operationDetails) {
        this.operationDetails = operationDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPolicyOperation that = (DmPolicyOperation) o;

        if (operationId != that.operationId) return false;
        if (enabled != that.enabled) return false;
        if (!Arrays.equals(operationDetails, that.operationDetails)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationId;
        result = 31 * result + enabled;
        result = 31 * result + Arrays.hashCode(operationDetails);
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
