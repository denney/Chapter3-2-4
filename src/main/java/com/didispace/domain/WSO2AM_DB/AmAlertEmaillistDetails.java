package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_ALERT_EMAILLIST_DETAILS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmAlertEmaillistDetails {
    private Integer emailListId;
    private String email;

    @Basic
    @Column(name = "EMAIL_LIST_ID")
    public Integer getEmailListId() {
        return emailListId;
    }

    public void setEmailListId(Integer emailListId) {
        this.emailListId = emailListId;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmAlertEmaillistDetails that = (AmAlertEmaillistDetails) o;

        if (emailListId != null ? !emailListId.equals(that.emailListId) : that.emailListId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emailListId != null ? emailListId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
