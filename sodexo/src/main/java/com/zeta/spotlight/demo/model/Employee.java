package com.zeta.spotlight.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("managerId")
    private int managerId;

    @JsonProperty("corpId")
    @Column(nullable = false)
    private Long corpId;

    @JsonProperty("deptId")
    private Long deptId;

    @JsonProperty("companyId")
    @Column(nullable = false)
    private Long companyId;

    @JsonProperty("programId")
    private Long programId;

    @Column(length = 10)
    @JsonProperty("phoneNum")
    private String phoneNum;

    @Column(nullable = false)
    private String name;
    private String designation;

    @JsonProperty("buId")
    private String buId;

    @JsonProperty("emailId")
    @Column(unique = true, nullable = false)
    private String emailId;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date createdAt;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date updatedAt;

    @JsonProperty("isEnabled")
    private boolean isEnabled;

    @JsonProperty("isManager")
    private boolean isManager;

    @JsonProperty("createdBy")
    private String createdBy = "";

    @JsonProperty("updatedBy")
    private String updatedBy = "";

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long compId) {
        this.companyId = compId;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBuId() {
        return buId;
    }

    public void setBuId(String buId) {
        this.buId = buId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @PrePersist
    private void setDefaults() {
        if (this.createdBy.isEmpty()) this.createdBy = "hr_admin";
        if (this.updatedBy.isEmpty()) this.updatedBy = "hr_admin";
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "managerId=" + managerId +
                ", corpId=" + corpId +
                ", deptId=" + deptId +
                ", companyId=" + companyId +
                ", programId=" + programId +
                ", phoneNum=" + phoneNum +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", buId='" + buId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", isEnabled=" + isEnabled +
                ", isManager=" + isManager +
                '}';
    }
}


