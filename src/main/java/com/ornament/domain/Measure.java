package com.ornament.domain;

import java.util.Date;

/**
 * Created by chenshuguo on 2017/5/11.
 */
public class Measure {
    private int measureId;
    private float measurePrice;
    private String measureDate;
    private int measureStatus;

    public int getMeasureId() {
        return measureId;
    }

    public void setMeasureId(int measureId) {
        this.measureId = measureId;
    }

    public float getMeasurePrice() {
        return measurePrice;
    }

    public void setMeasurePrice(float measurePrice) {
        this.measurePrice = measurePrice;
    }

    public String getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(String measureDate) {
        this.measureDate = measureDate;
    }

    public int getMeasureStatus() {
        return measureStatus;
    }

    public void setMeasureStatus(int measureStatus) {
        this.measureStatus = measureStatus;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "measureId=" + measureId +
                ", measurePrice=" + measurePrice +
                ", measureDate=" + measureDate +
                ", measureStatus=" + measureStatus +
                '}';
    }
}
