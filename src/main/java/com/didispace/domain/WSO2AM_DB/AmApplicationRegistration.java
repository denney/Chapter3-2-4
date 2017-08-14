package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_APPLICATION_REGISTRATION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApplicationRegistration {
    private int regId;
    private Integer subscriberId;
    private String wfRef;
    private Integer appId;
    private String tokenType;
    private String tokenScope;
    private String inputs;
    private String allowedDomains;
    private Long validityPeriod;
    private AmSubscriber amSubscriberBySubscriberId;
    private AmApplication amApplicationByAppId;

    @Id
    @Column(name = "REG_ID")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "SUBSCRIBER_ID")
    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Basic
    @Column(name = "WF_REF")
    public String getWfRef() {
        return wfRef;
    }

    public void setWfRef(String wfRef) {
        this.wfRef = wfRef;
    }

    @Basic
    @Column(name = "APP_ID")
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "TOKEN_TYPE")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Basic
    @Column(name = "TOKEN_SCOPE")
    public String getTokenScope() {
        return tokenScope;
    }

    public void setTokenScope(String tokenScope) {
        this.tokenScope = tokenScope;
    }

    @Basic
    @Column(name = "INPUTS")
    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    @Basic
    @Column(name = "ALLOWED_DOMAINS")
    public String getAllowedDomains() {
        return allowedDomains;
    }

    public void setAllowedDomains(String allowedDomains) {
        this.allowedDomains = allowedDomains;
    }

    @Basic
    @Column(name = "VALIDITY_PERIOD")
    public Long getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApplicationRegistration that = (AmApplicationRegistration) o;

        if (regId != that.regId) return false;
        if (subscriberId != null ? !subscriberId.equals(that.subscriberId) : that.subscriberId != null) return false;
        if (wfRef != null ? !wfRef.equals(that.wfRef) : that.wfRef != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (tokenType != null ? !tokenType.equals(that.tokenType) : that.tokenType != null) return false;
        if (tokenScope != null ? !tokenScope.equals(that.tokenScope) : that.tokenScope != null) return false;
        if (inputs != null ? !inputs.equals(that.inputs) : that.inputs != null) return false;
        if (allowedDomains != null ? !allowedDomains.equals(that.allowedDomains) : that.allowedDomains != null)
            return false;
        if (validityPeriod != null ? !validityPeriod.equals(that.validityPeriod) : that.validityPeriod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regId;
        result = 31 * result + (subscriberId != null ? subscriberId.hashCode() : 0);
        result = 31 * result + (wfRef != null ? wfRef.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (tokenType != null ? tokenType.hashCode() : 0);
        result = 31 * result + (tokenScope != null ? tokenScope.hashCode() : 0);
        result = 31 * result + (inputs != null ? inputs.hashCode() : 0);
        result = 31 * result + (allowedDomains != null ? allowedDomains.hashCode() : 0);
        result = 31 * result + (validityPeriod != null ? validityPeriod.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIBER_ID", referencedColumnName = "SUBSCRIBER_ID")
    public AmSubscriber getAmSubscriberBySubscriberId() {
        return amSubscriberBySubscriberId;
    }

    public void setAmSubscriberBySubscriberId(AmSubscriber amSubscriberBySubscriberId) {
        this.amSubscriberBySubscriberId = amSubscriberBySubscriberId;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "APPLICATION_ID")
    public AmApplication getAmApplicationByAppId() {
        return amApplicationByAppId;
    }

    public void setAmApplicationByAppId(AmApplication amApplicationByAppId) {
        this.amApplicationByAppId = amApplicationByAppId;
    }
}
