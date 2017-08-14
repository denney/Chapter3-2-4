package com.didispace.domain.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class ApmApiConsumerAppsPK implements Serializable {
    private int id;
    private String appConsumerKey;

    @Column(name = "ID")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "APP_CONSUMER_KEY")
    @Id
    public String getAppConsumerKey() {
        return appConsumerKey;
    }

    public void setAppConsumerKey(String appConsumerKey) {
        this.appConsumerKey = appConsumerKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApiConsumerAppsPK that = (ApmApiConsumerAppsPK) o;

        if (id != that.id) return false;
        if (appConsumerKey != null ? !appConsumerKey.equals(that.appConsumerKey) : that.appConsumerKey != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appConsumerKey != null ? appConsumerKey.hashCode() : 0);
        return result;
    }
}
