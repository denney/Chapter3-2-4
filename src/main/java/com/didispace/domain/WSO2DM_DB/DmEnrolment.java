package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_ENROLMENT", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmEnrolment {
    private int id;
    private int deviceId;
    private String owner;
    private String ownership;
    private String status;
    private Timestamp dateOfEnrolment;
    private Timestamp dateOfLastUpdate;
    private int tenantId;
    private Collection<DmDeviceOperationResponse> dmDeviceOperationResponsesById;
    private DmDevice dmDeviceByDeviceId;
    private Collection<DmEnrolmentOpMapping> dmEnrolmentOpMappingsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DEVICE_ID")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "OWNER")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "OWNERSHIP")
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
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
    @Column(name = "DATE_OF_ENROLMENT")
    public Timestamp getDateOfEnrolment() {
        return dateOfEnrolment;
    }

    public void setDateOfEnrolment(Timestamp dateOfEnrolment) {
        this.dateOfEnrolment = dateOfEnrolment;
    }

    @Basic
    @Column(name = "DATE_OF_LAST_UPDATE")
    public Timestamp getDateOfLastUpdate() {
        return dateOfLastUpdate;
    }

    public void setDateOfLastUpdate(Timestamp dateOfLastUpdate) {
        this.dateOfLastUpdate = dateOfLastUpdate;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmEnrolment that = (DmEnrolment) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (tenantId != that.tenantId) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (ownership != null ? !ownership.equals(that.ownership) : that.ownership != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (dateOfEnrolment != null ? !dateOfEnrolment.equals(that.dateOfEnrolment) : that.dateOfEnrolment != null)
            return false;
        if (dateOfLastUpdate != null ? !dateOfLastUpdate.equals(that.dateOfLastUpdate) : that.dateOfLastUpdate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (ownership != null ? ownership.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dateOfEnrolment != null ? dateOfEnrolment.hashCode() : 0);
        result = 31 * result + (dateOfLastUpdate != null ? dateOfLastUpdate.hashCode() : 0);
        result = 31 * result + tenantId;
        return result;
    }

    @OneToMany(mappedBy = "dmEnrolmentByEnrolmentId")
    public Collection<DmDeviceOperationResponse> getDmDeviceOperationResponsesById() {
        return dmDeviceOperationResponsesById;
    }

    public void setDmDeviceOperationResponsesById(Collection<DmDeviceOperationResponse> dmDeviceOperationResponsesById) {
        this.dmDeviceOperationResponsesById = dmDeviceOperationResponsesById;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID", nullable = false)
    public DmDevice getDmDeviceByDeviceId() {
        return dmDeviceByDeviceId;
    }

    public void setDmDeviceByDeviceId(DmDevice dmDeviceByDeviceId) {
        this.dmDeviceByDeviceId = dmDeviceByDeviceId;
    }

    @OneToMany(mappedBy = "dmEnrolmentByEnrolmentId")
    public Collection<DmEnrolmentOpMapping> getDmEnrolmentOpMappingsById() {
        return dmEnrolmentOpMappingsById;
    }

    public void setDmEnrolmentOpMappingsById(Collection<DmEnrolmentOpMapping> dmEnrolmentOpMappingsById) {
        this.dmEnrolmentOpMappingsById = dmEnrolmentOpMappingsById;
    }
}
