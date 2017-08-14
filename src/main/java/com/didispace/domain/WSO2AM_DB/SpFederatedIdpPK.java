package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class SpFederatedIdpPK implements Serializable {
    private int id;
    private int authenticatorId;

    @Column(name = "ID")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "AUTHENTICATOR_ID")
    @Id
    public int getAuthenticatorId() {
        return authenticatorId;
    }

    public void setAuthenticatorId(int authenticatorId) {
        this.authenticatorId = authenticatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpFederatedIdpPK that = (SpFederatedIdpPK) o;

        if (id != that.id) return false;
        if (authenticatorId != that.authenticatorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + authenticatorId;
        return result;
    }
}
