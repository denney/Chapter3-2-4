package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_CONFIG_OPERATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmConfigOperation {
    private int operationId;
    private byte[] operationConfig;
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
    @Column(name = "OPERATION_CONFIG")
    public byte[] getOperationConfig() {
        return operationConfig;
    }

    public void setOperationConfig(byte[] operationConfig) {
        this.operationConfig = operationConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmConfigOperation that = (DmConfigOperation) o;

        if (operationId != that.operationId) return false;
        if (!Arrays.equals(operationConfig, that.operationConfig)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationId;
        result = 31 * result + Arrays.hashCode(operationConfig);
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
