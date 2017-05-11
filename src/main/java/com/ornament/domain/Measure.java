package com.ornament.domain;

import java.util.Date;

/**
 * Created by chenshuguo on 2017/5/11.
 */
public class Measure {
    private int measureId;
    private float measuerPrise;
    private Date measureDate;
    private int measereStatus;

    public int getMeasureId() {
        return measureId;
    }

    public void setMeasureId(int measureId) {
        this.measureId = measureId;
    }

    public float getMeasuerPrise() {
        return measuerPrise;
    }

    public void setMeasuerPrise(float measuerPrise) {
        this.measuerPrise = measuerPrise;
    }

    public Date getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(Date measureDate) {
        this.measureDate = measureDate;
    }

    public int getMeasereStatus() {
        return measereStatus;
    }

    public void setMeasereStatus(int measereStatus) {
        this.measereStatus = measereStatus;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "measureId=" + measureId +
                ", measuerPrise=" + measuerPrise +
                ", measureDate=" + measureDate +
                ", measereStatus=" + measereStatus +
                '}';
    }
}
