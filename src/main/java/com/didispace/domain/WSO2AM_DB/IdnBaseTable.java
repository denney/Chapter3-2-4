package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_BASE_TABLE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnBaseTable {
    private String productName;

    @Id
    @Column(name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnBaseTable that = (IdnBaseTable) o;

        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0;
    }
}
