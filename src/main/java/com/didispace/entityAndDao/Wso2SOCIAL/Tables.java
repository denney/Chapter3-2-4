package com.didispace.entityAndDao.Wso2SOCIAL;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by admin on 2017/8/15.
 */
@Entity
public class Tables {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String tableType;
    private String storageType;
    private String sql;
    private String remarks;
    private Long lastModification;
    private Integer id;
    private String typeName;
    private String tableClass;
    private Long rowCountEstimate;

    @Basic
    @Column(name = "TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "TABLE_TYPE")
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    @Basic
    @Column(name = "STORAGE_TYPE")
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    @Basic
    @Column(name = "SQL")
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Basic
    @Column(name = "REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "LAST_MODIFICATION")
    public Long getLastModification() {
        return lastModification;
    }

    public void setLastModification(Long lastModification) {
        this.lastModification = lastModification;
    }

    @Basic
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TYPE_NAME")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "TABLE_CLASS")
    public String getTableClass() {
        return tableClass;
    }

    public void setTableClass(String tableClass) {
        this.tableClass = tableClass;
    }

    @Basic
    @Column(name = "ROW_COUNT_ESTIMATE")
    public Long getRowCountEstimate() {
        return rowCountEstimate;
    }

    public void setRowCountEstimate(Long rowCountEstimate) {
        this.rowCountEstimate = rowCountEstimate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tables tables = (Tables) o;

        if (tableCatalog != null ? !tableCatalog.equals(tables.tableCatalog) : tables.tableCatalog != null)
            return false;
        if (tableSchema != null ? !tableSchema.equals(tables.tableSchema) : tables.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(tables.tableName) : tables.tableName != null) return false;
        if (tableType != null ? !tableType.equals(tables.tableType) : tables.tableType != null) return false;
        if (storageType != null ? !storageType.equals(tables.storageType) : tables.storageType != null) return false;
        if (sql != null ? !sql.equals(tables.sql) : tables.sql != null) return false;
        if (remarks != null ? !remarks.equals(tables.remarks) : tables.remarks != null) return false;
        if (lastModification != null ? !lastModification.equals(tables.lastModification) : tables.lastModification != null)
            return false;
        if (id != null ? !id.equals(tables.id) : tables.id != null) return false;
        if (typeName != null ? !typeName.equals(tables.typeName) : tables.typeName != null) return false;
        if (tableClass != null ? !tableClass.equals(tables.tableClass) : tables.tableClass != null) return false;
        if (rowCountEstimate != null ? !rowCountEstimate.equals(tables.rowCountEstimate) : tables.rowCountEstimate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (tableType != null ? tableType.hashCode() : 0);
        result = 31 * result + (storageType != null ? storageType.hashCode() : 0);
        result = 31 * result + (sql != null ? sql.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (lastModification != null ? lastModification.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (tableClass != null ? tableClass.hashCode() : 0);
        result = 31 * result + (rowCountEstimate != null ? rowCountEstimate.hashCode() : 0);
        return result;
    }
}
