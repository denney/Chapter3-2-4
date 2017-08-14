package com.didispace.domain.WSO2MobileAndroid_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AD_FEATURE", schema = "PUBLIC", catalog = "WSO2MOBILEANDROID_DB")
public class AdFeature {
    private int id;
    private String code;
    private String name;
    private String description;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdFeature adFeature = (AdFeature) o;

        if (id != adFeature.id) return false;
        if (code != null ? !code.equals(adFeature.code) : adFeature.code != null) return false;
        if (name != null ? !name.equals(adFeature.name) : adFeature.name != null) return false;
        if (description != null ? !description.equals(adFeature.description) : adFeature.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
