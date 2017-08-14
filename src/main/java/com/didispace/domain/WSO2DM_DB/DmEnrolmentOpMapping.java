package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_ENROLMENT_OP_MAPPING", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmEnrolmentOpMapping {
    private int id;
    private int enrolmentId;
    private int operationId;
    private String status;
    private int createdTimestamp;
    private int updatedTimestamp;
    private DmEnrolment dmEnrolmentByEnrolmentId;
    private DmOperation dmOperationByOperationId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ENROLMENT_ID")
    public int getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(int enrolmentId) {
        this.enrolmentId = enrolmentId;
    }

    @Basic
    @Column(name = "OPERATION_ID")
    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CREATED_TIMESTAMP")
    public int getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(int createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Basic
    @Column(name = "UPDATED_TIMESTAMP")
    public int getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(int updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmEnrolmentOpMapping that = (DmEnrolmentOpMapping) o;

        if (id != that.id) return false;
        if (enrolmentId != that.enrolmentId) return false;
        if (operationId != that.operationId) return false;
        if (createdTimestamp != that.createdTimestamp) return false;
        if (updatedTimestamp != that.updatedTimestamp) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + enrolmentId;
        result = 31 * result + operationId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + createdTimestamp;
        result = 31 * result + updatedTimestamp;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ENROLMENT_ID", referencedColumnName = "ID", nullable = false)
    public DmEnrolment getDmEnrolmentByEnrolmentId() {
        return dmEnrolmentByEnrolmentId;
    }

    public void setDmEnrolmentByEnrolmentId(DmEnrolment dmEnrolmentByEnrolmentId) {
        this.dmEnrolmentByEnrolmentId = dmEnrolmentByEnrolmentId;
    }

    @ManyToOne
    @JoinColumn(name = "OPERATION_ID", referencedColumnName = "ID", nullable = false)
    public DmOperation getDmOperationByOperationId() {
        return dmOperationByOperationId;
    }

    public void setDmOperationByOperationId(DmOperation dmOperationByOperationId) {
        this.dmOperationByOperationId = dmOperationByOperationId;
    }
}
