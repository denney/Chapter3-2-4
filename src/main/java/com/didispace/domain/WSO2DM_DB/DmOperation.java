package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_OPERATION", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmOperation {
    private int id;
    private String type;
    private Timestamp createdTimestamp;
    private Timestamp receivedTimestamp;
    private String operationCode;
    private DmCommandOperation dmCommandOperationById;
    private DmConfigOperation dmConfigOperationById;
    private Collection<DmDeviceOperationResponse> dmDeviceOperationResponsesById;
    private Collection<DmEnrolmentOpMapping> dmEnrolmentOpMappingsById;
    private Collection<DmNotification> dmNotificationsById;
    private DmPolicyOperation dmPolicyOperationById;
    private DmProfileOperation dmProfileOperationById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "CREATED_TIMESTAMP")
    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Basic
    @Column(name = "RECEIVED_TIMESTAMP")
    public Timestamp getReceivedTimestamp() {
        return receivedTimestamp;
    }

    public void setReceivedTimestamp(Timestamp receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }

    @Basic
    @Column(name = "OPERATION_CODE")
    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmOperation that = (DmOperation) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (createdTimestamp != null ? !createdTimestamp.equals(that.createdTimestamp) : that.createdTimestamp != null)
            return false;
        if (receivedTimestamp != null ? !receivedTimestamp.equals(that.receivedTimestamp) : that.receivedTimestamp != null)
            return false;
        if (operationCode != null ? !operationCode.equals(that.operationCode) : that.operationCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (createdTimestamp != null ? createdTimestamp.hashCode() : 0);
        result = 31 * result + (receivedTimestamp != null ? receivedTimestamp.hashCode() : 0);
        result = 31 * result + (operationCode != null ? operationCode.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "dmOperationByOperationId")
    public DmCommandOperation getDmCommandOperationById() {
        return dmCommandOperationById;
    }

    public void setDmCommandOperationById(DmCommandOperation dmCommandOperationById) {
        this.dmCommandOperationById = dmCommandOperationById;
    }

    @OneToOne(mappedBy = "dmOperationByOperationId")
    public DmConfigOperation getDmConfigOperationById() {
        return dmConfigOperationById;
    }

    public void setDmConfigOperationById(DmConfigOperation dmConfigOperationById) {
        this.dmConfigOperationById = dmConfigOperationById;
    }

    @OneToMany(mappedBy = "dmOperationByOperationId")
    public Collection<DmDeviceOperationResponse> getDmDeviceOperationResponsesById() {
        return dmDeviceOperationResponsesById;
    }

    public void setDmDeviceOperationResponsesById(Collection<DmDeviceOperationResponse> dmDeviceOperationResponsesById) {
        this.dmDeviceOperationResponsesById = dmDeviceOperationResponsesById;
    }

    @OneToMany(mappedBy = "dmOperationByOperationId")
    public Collection<DmEnrolmentOpMapping> getDmEnrolmentOpMappingsById() {
        return dmEnrolmentOpMappingsById;
    }

    public void setDmEnrolmentOpMappingsById(Collection<DmEnrolmentOpMapping> dmEnrolmentOpMappingsById) {
        this.dmEnrolmentOpMappingsById = dmEnrolmentOpMappingsById;
    }

    @OneToMany(mappedBy = "dmOperationByOperationId")
    public Collection<DmNotification> getDmNotificationsById() {
        return dmNotificationsById;
    }

    public void setDmNotificationsById(Collection<DmNotification> dmNotificationsById) {
        this.dmNotificationsById = dmNotificationsById;
    }

    @OneToOne(mappedBy = "dmOperationByOperationId")
    public DmPolicyOperation getDmPolicyOperationById() {
        return dmPolicyOperationById;
    }

    public void setDmPolicyOperationById(DmPolicyOperation dmPolicyOperationById) {
        this.dmPolicyOperationById = dmPolicyOperationById;
    }

    @OneToOne(mappedBy = "dmOperationByOperationId")
    public DmProfileOperation getDmProfileOperationById() {
        return dmProfileOperationById;
    }

    public void setDmProfileOperationById(DmProfileOperation dmProfileOperationById) {
        this.dmProfileOperationById = dmProfileOperationById;
    }
}
