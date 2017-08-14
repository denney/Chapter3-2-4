package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_JAVA_POLICY_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmAppJavaPolicyMappingPK.class)
public class ApmAppJavaPolicyMapping {
    private int javaPolicyId;
    private int appId;

    @Id
    @Column(name = "JAVA_POLICY_ID")
    public int getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(int javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
    }

    @Id
    @Column(name = "APP_ID")
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

        ApmAppJavaPolicyMapping that = (ApmAppJavaPolicyMapping) o;

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
