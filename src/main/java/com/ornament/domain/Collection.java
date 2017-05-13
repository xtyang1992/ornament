package com.ornament.domain;

import java.util.Date;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public class Collection {
    private int collectionId;
    private int projectId;
    private String collectionDate; //日期
    private String collectionWay;  //收款方式
    private int collectionItem; //收款类别
    private float collectionValue; //
    private float collectionRate; //
    private int collectionStatus; //收款核对状态

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getCollectionWay() {
        return collectionWay;
    }

    public void setCollectionWay(String collectionWay) {
        this.collectionWay = collectionWay;
    }

    public int getCollectionItem() {
        return collectionItem;
    }

    public void setCollectionItem(int collectionItem) {
        this.collectionItem = collectionItem;
    }

    public float getCollectionValue() {
        return collectionValue;
    }

    public void setCollectionValue(float collectionValue) {
        this.collectionValue = collectionValue;
    }

    public float getCollectionRate() {
        return collectionRate;
    }

    public void setCollectionRate(float collectionRate) {
        this.collectionRate = collectionRate;
    }

    public int getCollectionStatus() {
        return collectionStatus;
    }

    public void setCollectionStatus(int collectionStatus) {
        this.collectionStatus = collectionStatus;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collectionId=" + collectionId +
                ", projectId=" + projectId +
                ", collectionDate='" + collectionDate + '\'' +
                ", collectionWay='" + collectionWay + '\'' +
                ", collectionItem=" + collectionItem +
                ", collectionValue=" + collectionValue +
                ", collectionRate=" + collectionRate +
                ", collectionStatus=" + collectionStatus +
                '}';
    }
}
