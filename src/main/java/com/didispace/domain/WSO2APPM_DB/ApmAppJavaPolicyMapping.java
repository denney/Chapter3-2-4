package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_JAVA_POLICY_MAPPING", schema = "PUBLIC", catalog = "WSO2APPM_DB")
@IdClass(ApmAppJavaPolicyMappingPK.class)
public class ApmAppJavaPolicyMapping {
    private int javaPolicyId;
    private int appId;
    private ApmAppJavaPolicy apmAppJavaPolicyByJavaPolicyId;
    private ApmApp apmAppByAppId;

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

    @ManyToOne
    @JoinColumn(name = "JAVA_POLICY_ID", referencedColumnName = "JAVA_POLICY_ID", nullable = false)
    public ApmAppJavaPolicy getApmAppJavaPolicyByJavaPolicyId() {
        return apmAppJavaPolicyByJavaPolicyId;
    }

    public void setApmAppJavaPolicyByJavaPolicyId(ApmAppJavaPolicy apmAppJavaPolicyByJavaPolicyId) {
        this.apmAppJavaPolicyByJavaPolicyId = apmAppJavaPolicyByJavaPolicyId;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID", nullable = false)
    public ApmApp getApmAppByAppId() {
        return apmAppByAppId;
    }

    public void setApmAppByAppId(ApmApp apmAppByAppId) {
        this.apmAppByAppId = apmAppByAppId;
    }
}
