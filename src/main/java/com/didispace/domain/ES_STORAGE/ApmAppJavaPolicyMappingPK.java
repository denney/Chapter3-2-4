package com.didispace.domain.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class ApmAppJavaPolicyMappingPK implements Serializable {
    private int javaPolicyId;
    private int appId;

    @Column(name = "JAVA_POLICY_ID")
    @Id
    public int getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(int javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
    }

    @Column(name = "APP_ID")
    @Id
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppJavaPolicyMappingPK that = (ApmAppJavaPolicyMappingPK) o;

        if (javaPolicyId != that.javaPolicyId) return false;
        if (appId != that.appId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = javaPolicyId;
        result = 31 * result + appId;
        return result;
    }
}
