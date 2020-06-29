package com.zeta.spotlight.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CorporateAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @JsonProperty("isActive")
    @Column(nullable = false)
    private boolean isActive;

    @JsonProperty("isDBA")
    @Column(nullable = false)
    private boolean isDBA;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date createdAt;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date updatedAt;

    @JsonProperty("createdBy")
    private String createdBy = "";

    @JsonProperty("updatedBy")
    private String updatedBy = "";

    @PrePersist
    void setDefaults() {
        if(this.createdBy.isEmpty()) this.createdBy = "zeta_DBA";
        if(this.updatedBy.isEmpty()) this.updatedBy = "zeta_DBA";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isDBA() {
        return isDBA;
    }

    public void setDBA(boolean DBA) {
        isDBA = DBA;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
