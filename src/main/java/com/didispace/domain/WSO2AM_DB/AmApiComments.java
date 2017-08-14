package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_COMMENTS", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiComments {
    private int commentId;
    private String commentText;
    private String commentedUser;
    private Timestamp dateCommented;
    private int apiId;
    private AmApi amApiByApiId;

    @Id
    @Column(name = "COMMENT_ID")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "COMMENT_TEXT")
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Basic
    @Column(name = "COMMENTED_USER")
    public String getCommentedUser() {
        return commentedUser;
    }

    public void setCommentedUser(String commentedUser) {
        this.commentedUser = commentedUser;
    }

    @Basic
    @Column(name = "DATE_COMMENTED")
    public Timestamp getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(Timestamp dateCommented) {
        this.dateCommented = dateCommented;
    }

    @Basic
    @Column(name = "API_ID")
    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApiComments that = (AmApiComments) o;

        if (commentId != that.commentId) return false;
        if (apiId != that.apiId) return false;
        if (commentText != null ? !commentText.equals(that.commentText) : that.commentText != null) return false;
        if (commentedUser != null ? !commentedUser.equals(that.commentedUser) : that.commentedUser != null)
            return false;
        if (dateCommented != null ? !dateCommented.equals(that.dateCommented) : that.dateCommented != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + (commentedUser != null ? commentedUser.hashCode() : 0);
        result = 31 * result + (dateCommented != null ? dateCommented.hashCode() : 0);
        result = 31 * result + apiId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "API_ID", referencedColumnName = "API_ID", nullable = false)
    public AmApi getAmApiByApiId() {
        return amApiByApiId;
    }

    public void setAmApiByApiId(AmApi amApiByApiId) {
        this.amApiByApiId = amApiByApiId;
    }
}
