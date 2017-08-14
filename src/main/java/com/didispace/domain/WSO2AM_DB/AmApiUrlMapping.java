package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_URL_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiUrlMapping {
    private int urlMappingId;
    private int apiId;
    private String httpMethod;
    private String authScheme;
    private String urlPattern;
    private String throttlingTier;
    private byte[] mediationScript;

    @Id
    @Column(name = "URL_MAPPING_ID")
    public int getUrlMappingId() {
        return urlMappingId;
    }

    public void setUrlMappingId(int urlMappingId) {
        this.urlMappingId = urlMappingId;
    }

    @Basic
    @Column(name = "API_ID")
    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
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
    @Column(name = "AUTH_SCHEME")
    public String getAuthScheme() {
        return authScheme;
    }

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
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
    @Column(name = "THROTTLING_TIER")
    public String getThrottlingTier() {
        return throttlingTier;
    }

    public void setThrottlingTier(String throttlingTier) {
        this.throttlingTier = throttlingTier;
    }

    @Basic
    @Column(name = "MEDIATION_SCRIPT")
    public byte[] getMediationScript() {
        return mediationScript;
    }

    public void setMediationScript(byte[] mediationScript) {
        this.mediationScript = mediationScript;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApiUrlMapping that = (AmApiUrlMapping) o;

        if (urlMappingId != that.urlMappingId) return false;
        if (apiId != that.apiId) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (authScheme != null ? !authScheme.equals(that.authScheme) : that.authScheme != null) return false;
        if (urlPattern != null ? !urlPattern.equals(that.urlPattern) : that.urlPattern != null) return false;
        if (throttlingTier != null ? !throttlingTier.equals(that.throttlingTier) : that.throttlingTier != null)
            return false;
        if (!Arrays.equals(mediationScript, that.mediationScript)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlMappingId;
        result = 31 * result + apiId;
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (authScheme != null ? authScheme.hashCode() : 0);
        result = 31 * result + (urlPattern != null ? urlPattern.hashCode() : 0);
        result = 31 * result + (throttlingTier != null ? throttlingTier.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(mediationScript);
        return result;
    }
}
