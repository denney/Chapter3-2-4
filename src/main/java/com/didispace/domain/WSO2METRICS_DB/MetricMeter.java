package com.didispace.domain.WSO2METRICS_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "METRIC_METER", schema = "PUBLIC", catalog = "WSO2METRICS_DB")
public class MetricMeter {
    private long id;
    private String source;
    private long timestamp;
    private String name;
    private long count;
    private double meanRate;
    private double m1Rate;
    private double m5Rate;
    private double m15Rate;
    private String rateUnit;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetricMeter that = (MetricMeter) o;

        if (id != that.id) return false;
        if (timestamp != that.timestamp) return false;
        if (count != that.count) return false;
        if (Double.compare(that.meanRate, meanRate) != 0) return false;
        if (Double.compare(that.m1Rate, m1Rate) != 0) return false;
        if (Double.compare(that.m5Rate, m5Rate) != 0) return false;
        if (Double.compare(that.m15Rate, m15Rate) != 0) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rateUnit != null ? !rateUnit.equals(that.rateUnit) : that.rateUnit != null) return false;

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
        temp = Double.doubleToLongBits(meanRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m1Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m5Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m15Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (rateUnit != null ? rateUnit.hashCode() : 0);
        return result;
    }
}
