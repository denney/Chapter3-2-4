package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_APP_URL_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppUrlMapping {
    private int urlMappingId;
    private String httpMethod;
    private String urlPattern;
    private Boolean skipThrottling;
    private ApmPolicyGroup apmPolicyGroupByPolicyGrpId;

    @Id
    @Column(name = "URL_MAPPING_ID")
    public int getUrlMappingId() {
        return urlMappingId;
    }

    public void setUrlMappingId(int urlMappingId) {
        this.urlMappingId = urlMappingId;
    }

    @Basic
    @Column(name = "HTTP_METHOD")
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Basic
    @Column(name = "URL_PATTERN")
    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    @Basic
    @Column(name = "SKIP_THROTTLING")
    public Boolean getSkipThrottling() {
        return skipThrottling;
    }

    public void setSkipThrottling(Boolean skipThrottling) {
        this.skipThrottling = skipThrottling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppUrlMapping that = (ApmAppUrlMapping) o;

        if (urlMappingId != that.urlMappingId) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (urlPattern != null ? !urlPattern.equals(that.urlPattern) : that.urlPattern != null) return false;
        if (skipThrottling != null ? !skipThrottling.equals(that.skipThrottling) : that.skipThrottling != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlMappingId;
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (urlPattern != null ? urlPattern.hashCode() : 0);
        result = 31 * result + (skipThrottling != null ? skipThrottling.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_GRP_ID", referencedColumnName = "POLICY_GRP_ID")
    public ApmPolicyGroup getApmPolicyGroupByPolicyGrpId() {
        return apmPolicyGroupByPolicyGrpId;
    }

    public void setApmPolicyGroupByPolicyGrpId(ApmPolicyGroup apmPolicyGroupByPolicyGrpId) {
        this.apmPolicyGroupByPolicyGrpId = apmPolicyGroupByPolicyGrpId;
    }
}
