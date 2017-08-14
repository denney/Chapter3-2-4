package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_APPLICATION_KEY_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(AmApplicationKeyMappingPK.class)
public class AmApplicationKeyMapping {
    private int applicationId;
    private String consumerKey;
    private String keyType;
    private String state;
    private String createMode;
    private AmApplication amApplicationByApplicationId;

    @Id
    @Column(name = "APPLICATION_ID")
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "CONSUMER_KEY")
    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @Id
    @Column(name = "KEY_TYPE")
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "CREATE_MODE")
    public String getCreateMode() {
        return createMode;
    }

    public void setCreateMode(String createMode) {
        this.createMode = createMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApplicationKeyMapping that = (AmApplicationKeyMapping) o;

        if (applicationId != that.applicationId) return false;
        if (consumerKey != null ? !consumerKey.equals(that.consumerKey) : that.consumerKey != null) return false;
        if (keyType != null ? !keyType.equals(that.keyType) : that.keyType != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (createMode != null ? !createMode.equals(that.createMode) : that.createMode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationId;
        result = 31 * result + (consumerKey != null ? consumerKey.hashCode() : 0);
        result = 31 * result + (keyType != null ? keyType.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createMode != null ? createMode.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "APPLICATION_ID", nullable = false)
    public AmApplication getAmApplicationByApplicationId() {
        return amApplicationByApplicationId;
    }

    public void setAmApplicationByApplicationId(AmApplication amApplicationByApplicationId) {
        this.amApplicationByApplicationId = amApplicationByApplicationId;
    }
}
