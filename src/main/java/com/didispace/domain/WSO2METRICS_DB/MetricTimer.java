package com.didispace.domain.WSO2METRICS_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "METRIC_TIMER", schema = "PUBLIC", catalog = "WSO2METRICS_DB")
public class MetricTimer {
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
    private double meanRate;
    private double m1Rate;
    private double m5Rate;
    private double m15Rate;
    private String rateUnit;
    private String durationUnit;

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

    @Basic
    @Column(name = "MEAN_RATE")
    public double getMeanRate() {
        return meanRate;
    }

    public void setMeanRate(double meanRate) {
        this.meanRate = meanRate;
    }

    @Basic
    @Column(name = "M1_RATE")
    public double getM1Rate() {
        return m1Rate;
    }

    public void setM1Rate(double m1Rate) {
        this.m1Rate = m1Rate;
    }

    @Basic
    @Column(name = "M5_RATE")
    public double getM5Rate() {
        return m5Rate;
    }

    public void setM5Rate(double m5Rate) {
        this.m5Rate = m5Rate;
    }

    @Basic
    @Column(name = "M15_RATE")
    public double getM15Rate() {
        return m15Rate;
    }

    public void setM15Rate(double m15Rate) {
        this.m15Rate = m15Rate;
    }

    @Basic
    @Column(name = "RATE_UNIT")
    public String getRateUnit() {
        return rateUnit;
    }

    public void setRateUnit(String rateUnit) {
        this.rateUnit = rateUnit;
    }

    @Basic
    @Column(name = "DURATION_UNIT")
    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetricTimer that = (MetricTimer) o;

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
        if (Double.compare(that.meanRate, meanRate) != 0) return false;
        if (Double.compare(that.m1Rate, m1Rate) != 0) return false;
        if (Double.compare(that.m5Rate, m5Rate) != 0) return false;
        if (Double.compare(that.m15Rate, m15Rate) != 0) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rateUnit != null ? !rateUnit.equals(that.rateUnit) : that.rateUnit != null) return false;
        if (durationUnit != null ? !durationUnit.equals(that.durationUnit) : that.durationUnit != null) return false;

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
        temp = Double.doubleToLongBits(meanRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m1Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m5Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m15Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (rateUnit != null ? rateUnit.hashCode() : 0);
        result = 31 * result + (durationUnit != null ? durationUnit.hashCode() : 0);
        return result;
    }
}
