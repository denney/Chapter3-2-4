package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class AmApplicationKeyMappingPK implements Serializable {
    private int applicationId;
    private String keyType;

    @Column(name = "APPLICATION_ID")
    @Id
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    @Column(name = "KEY_TYPE")
    @Id
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApplicationKeyMappingPK that = (AmApplicationKeyMappingPK) o;

        if (applicationId != that.applicationId) return false;
        if (keyType != null ? !keyType.equals(that.keyType) : that.keyType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationId;
        result = 31 * result + (keyType != null ? keyType.hashCode() : 0);
        return result;
    }
}
