package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_SAML2_ASSERTION_STORE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnSaml2AssertionStore {
    private int id;
    private String saml2Id;
    private String saml2Issuer;
    private String saml2Subject;
    private String saml2SessionIndex;
    private String saml2AuthnContextClassRef;
    private String saml2Assertion;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SAML2_ID")
    public String getSaml2Id() {
        return saml2Id;
    }

    public void setSaml2Id(String saml2Id) {
        this.saml2Id = saml2Id;
    }

    @Basic
    @Column(name = "SAML2_ISSUER")
    public String getSaml2Issuer() {
        return saml2Issuer;
    }

    public void setSaml2Issuer(String saml2Issuer) {
        this.saml2Issuer = saml2Issuer;
    }

    @Basic
    @Column(name = "SAML2_SUBJECT")
    public String getSaml2Subject() {
        return saml2Subject;
    }

    public void setSaml2Subject(String saml2Subject) {
        this.saml2Subject = saml2Subject;
    }

    @Basic
    @Column(name = "SAML2_SESSION_INDEX")
    public String getSaml2SessionIndex() {
        return saml2SessionIndex;
    }

    public void setSaml2SessionIndex(String saml2SessionIndex) {
        this.saml2SessionIndex = saml2SessionIndex;
    }

    @Basic
    @Column(name = "SAML2_AUTHN_CONTEXT_CLASS_REF")
    public String getSaml2AuthnContextClassRef() {
        return saml2AuthnContextClassRef;
    }

    public void setSaml2AuthnContextClassRef(String saml2AuthnContextClassRef) {
        this.saml2AuthnContextClassRef = saml2AuthnContextClassRef;
    }

    @Basic
    @Column(name = "SAML2_ASSERTION")
    public String getSaml2Assertion() {
        return saml2Assertion;
    }

    public void setSaml2Assertion(String saml2Assertion) {
        this.saml2Assertion = saml2Assertion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnSaml2AssertionStore that = (IdnSaml2AssertionStore) o;

        if (id != that.id) return false;
        if (saml2Id != null ? !saml2Id.equals(that.saml2Id) : that.saml2Id != null) return false;
        if (saml2Issuer != null ? !saml2Issuer.equals(that.saml2Issuer) : that.saml2Issuer != null) return false;
        if (saml2Subject != null ? !saml2Subject.equals(that.saml2Subject) : that.saml2Subject != null) return false;
        if (saml2SessionIndex != null ? !saml2SessionIndex.equals(that.saml2SessionIndex) : that.saml2SessionIndex != null)
            return false;
        if (saml2AuthnContextClassRef != null ? !saml2AuthnContextClassRef.equals(that.saml2AuthnContextClassRef) : that.saml2AuthnContextClassRef != null)
            return false;
        if (saml2Assertion != null ? !saml2Assertion.equals(that.saml2Assertion) : that.saml2Assertion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (saml2Id != null ? saml2Id.hashCode() : 0);
        result = 31 * result + (saml2Issuer != null ? saml2Issuer.hashCode() : 0);
        result = 31 * result + (saml2Subject != null ? saml2Subject.hashCode() : 0);
        result = 31 * result + (saml2SessionIndex != null ? saml2SessionIndex.hashCode() : 0);
        result = 31 * result + (saml2AuthnContextClassRef != null ? saml2AuthnContextClassRef.hashCode() : 0);
        result = 31 * result + (saml2Assertion != null ? saml2Assertion.hashCode() : 0);
        return result;
    }
}
