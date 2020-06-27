package com.zeta.spotlight.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class IssuanceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonProperty("issuerId")
    @Column(nullable = false)
    private Integer issuerId;

    @JsonProperty("beneficiaryId")
    @Column(nullable = false)
    private Integer beneficiaryId;

    @JsonProperty("badgeId")
    @Column(nullable = false)
    private Integer badgeId;

    @JsonProperty("companyId")
    private Integer companyId;

    @JsonProperty("corpId")
    private Integer corpId;

    @JsonProperty("teamId")
    @Column(nullable = false)
    private Integer teamId;

    @JsonProperty("description")
    private String description;

    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Integer getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCorpId() {
        return corpId;
    }

    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IssuanceHistory{" +
                "issuerId=" + issuerId +
                ", beneficiaryId=" + beneficiaryId +
                ", badgeId=" + badgeId +
                ", companyId=" + companyId +
                ", corpId=" + corpId +
                ", teamId=" + teamId +
                ", description='" + description + '\'' +
                '}';
    }
}
