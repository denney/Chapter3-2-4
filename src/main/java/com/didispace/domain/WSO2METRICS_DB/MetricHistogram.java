package com.didispace.domain.WSO2METRICS_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "METRIC_HISTOGRAM", schema = "PUBLIC", catalog = "WSO2METRICS_DB")
public class MetricHistogram {
    private long id;
    private String source;
    private long timestamp;
    private String name;
    private long count;
    private double max;
    private double mean;
    private double min;
    private double stddev;
    private double p50;
    private double p75;
    private double p95;
    private double p98;
    private double p99;
    private double p999;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SOURCE")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "TIMESTAMP")
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
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
    @Column(name = "COUNT")
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Basic
    @Column(name = "MAX")
    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Basic
    @Column(name = "MEAN")
    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    @Basic
    @Column(name = "MIN")
    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    @Basic
    @Column(name = "STDDEV")
    public double getStddev() {
        return stddev;
    }

    public void setStddev(double stddev) {
        this.stddev = stddev;
    }

    @Basic
    @Column(name = "P50")
    public double getP50() {
        return p50;
    }

    public void setP50(double p50) {
        this.p50 = p50;
    }

    @Basic
    @Column(name = "P75")
    public double getP75() {
        return p75;
    }

    public void setP75(double p75) {
        this.p75 = p75;
    }

    @Basic
    @Column(name = "P95")
    public double getP95() {
        return p95;
    }

    public void setP95(double p95) {
        this.p95 = p95;
    }

    @Basic
    @Column(name = "P98")
    public double getP98() {
        return p98;
    }

    public void setP98(double p98) {
        this.p98 = p98;
    }

    @Basic
    @Column(name = "P99")
    public double getP99() {
        return p99;
    }

    public void setP99(double p99) {
        this.p99 = p99;
    }

    @Basic
    @Column(name = "P999")
    public double getP999() {
        return p999;
    }

    public void setP999(double p999) {
        this.p999 = p999;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetricHistogram that = (MetricHistogram) o;

        if (id != that.id) return false;
        if (timestamp != that.timestamp) return false;
        if (count != that.count) return false;
        if (Double.compare(that.max, max) != 0) return false;
        if (Double.compare(that.mean, mean) != 0) return false;
        if (Double.compare(that.min, min) != 0) return false;
        if (Double.compare(that.stddev, stddev) != 0) return false;
        if (Double.compare(that.p50, p50) != 0) return false;
        if (Double.compare(that.p75, p75) != 0) return false;
        if (Double.compare(that.p95, p95) != 0) return false;
        if (Double.compare(that.p98, p98) != 0) return false;
        if (Double.compare(that.p99, p99) != 0) return false;
        if (Double.compare(that.p999, p999) != 0) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (count ^ (count >>> 32));
        temp = Double.doubleToLongBits(max);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mean);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(min);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stddev);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p50);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p75);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p95);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p98);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p99);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p999);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
