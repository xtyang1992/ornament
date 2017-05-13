package com.ornament.domain;

import java.util.Date;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public class Project {
    private int projectId;
    private String projectName;
    private String projectAddress;
    private String projectArea;
    private String projectType;
    private float projectSubscription;
    private float projectPrice;
    private float projectChangeValueTotal;
    private float projectMaterialValueTotal;
    private float projectBuildValueTotal;
    private float projectAllocateValueTotal;
    private float projectCollectionValueTotal;
    private float projectCollectionValueRemain;
    private int projectStatus;
    private String projectCompleteDate;
    private String projectEndDate;
    private String projectVocationSuggestion;
    private String projectCollectionSuggestion;
    private int projectCollectionTimes;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getProjectArea() {
        return projectArea;
    }

    public void setProjectArea(String projectArea) {
        this.projectArea = projectArea;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public float getProjectSubscription() {
        return projectSubscription;
    }

    public void setProjectSubscription(float projectSubscription) {
        this.projectSubscription = projectSubscription;
    }

    public float getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(float projectPrice) {
        this.projectPrice = projectPrice;
    }

    public float getProjectChangeValueTotal() {
        return projectChangeValueTotal;
    }

    public void setProjectChangeValueTotal(float projectChangeValueTotal) {
        this.projectChangeValueTotal = projectChangeValueTotal;
    }

    public float getProjectMaterialValueTotal() {
        return projectMaterialValueTotal;
    }

    public void setProjectMaterialValueTotal(float projectMaterialValueTotal) {
        this.projectMaterialValueTotal = projectMaterialValueTotal;
    }

    public float getProjectBuildValueTotal() {
        return projectBuildValueTotal;
    }

    public void setProjectBuildValueTotal(float projectBuildValueTotal) {
        this.projectBuildValueTotal = projectBuildValueTotal;
    }

    public float getProjectAllocateValueTotal() {
        return projectAllocateValueTotal;
    }

    public void setProjectAllocateValueTotal(float projectAllocateValueTotal) {
        this.projectAllocateValueTotal = projectAllocateValueTotal;
    }

    public float getProjectCollectionValueTotal() {
        return projectCollectionValueTotal;
    }

    public void setProjectCollectionValueTotal(float projectCollectionValueTotal) {
        this.projectCollectionValueTotal = projectCollectionValueTotal;
    }

    public float getProjectCollectionValueRemain() {
        return projectCollectionValueRemain;
    }

    public void setProjectCollectionValueRemain(float projectCollectionValueRemain) {
        this.projectCollectionValueRemain = projectCollectionValueRemain;
    }

    public int getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(int projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectCompleteDate() {
        return projectCompleteDate;
    }

    public void setProjectCompleteDate(String projectCompleteDate) {
        this.projectCompleteDate = projectCompleteDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectVocationSuggestion() {
        return projectVocationSuggestion;
    }

    public void setProjectVocationSuggestion(String projectVocationSuggestion) {
        this.projectVocationSuggestion = projectVocationSuggestion;
    }

    public String getProjectCollectionSuggestion() {
        return projectCollectionSuggestion;
    }

    public void setProjectCollectionSuggestion(String projectCollectionSuggestion) {
        this.projectCollectionSuggestion = projectCollectionSuggestion;
    }

    public int getProjectCollectionTimes() {
        return projectCollectionTimes;
    }

    public void setProjectCollectionTimes(int projectCollectionTimes) {
        this.projectCollectionTimes = projectCollectionTimes;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectAddress='" + projectAddress + '\'' +
                ", projectArea='" + projectArea + '\'' +
                ", projectType='" + projectType + '\'' +
                ", projectSubscription=" + projectSubscription +
                ", projectPrice=" + projectPrice +
                ", projectChangeValueTotal=" + projectChangeValueTotal +
                ", projectMaterialValueTotal=" + projectMaterialValueTotal +
                ", projectBuildValueTotal=" + projectBuildValueTotal +
                ", projectAllocateValueTotal=" + projectAllocateValueTotal +
                ", projectCollectionValueTotal=" + projectCollectionValueTotal +
                ", projectCollectionValueRemain=" + projectCollectionValueRemain +
                ", projectStatus=" + projectStatus +
                ", projectCompleteDate='" + projectCompleteDate + '\'' +
                ", projectEndDate='" + projectEndDate + '\'' +
                ", projectVocationSuggestion='" + projectVocationSuggestion + '\'' +
                ", projectCollectionSuggestion='" + projectCollectionSuggestion + '\'' +
                ", projectCollectionTimes=" + projectCollectionTimes +
                '}';
    }
}
