package com.zeta.spotlight.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Program implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonProperty("issuerId")
    @Column(nullable = false)
    private int issuerId;

    @Column(nullable = false)
    private String name;

    @JsonProperty("corpId")
    @Column(nullable = false)
    private Long corpId;

    @JsonProperty("companyId")
    @Column(nullable = false)
    private Long companyId;

    @JsonProperty("currencyName")
    @Column(nullable = false)
    private String currencyName;

    private String description;

    @Column(nullable = false)
    private boolean active;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date createdAt;

    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date updatedAt;

    @JsonProperty("createdBy")
    private String createdBy = "";

    @JsonProperty("updatedBy")
    private String updatedBy = "";

    @OneToMany(mappedBy = "program", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Badge> badges = new ArrayList<>();

    public void addBadge(Badge badge) {
        this.badges.add(badge);
    }

    public int getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(int issuerId) {
        this.issuerId = issuerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", badges=" + badges +
                '}';
    }

    @PrePersist
    private void setDefaults() {
        if (this.createdBy.isEmpty()) this.createdBy = "hr_admin";
        if (this.updatedBy.isEmpty()) this.updatedBy = "hr_admin";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Program)) return false;
        Program program = (Program) o;
        return id.equals(program.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
