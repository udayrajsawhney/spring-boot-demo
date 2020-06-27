/*
package com.zeta.spotlight.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class ProgramBadge implements Serializable {

    @Id
    @ManyToOne
    private Program program;

    @Id
    @ManyToOne
    private Badge badge;

    private Long companyId;

    private String batchName;

    private String iconImage;

    private String description;

    private Integer points;

    private boolean isEnabled;

    public ProgramBadge() {
    }

    public ProgramBadge(Program program, Badge badge) {
        System.out.println("Inside construcutor-U"+ program.getId());
        this.program = program;
        this.badge = badge;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getIconImage() {
        return iconImage;
    }

    public void setIconImage(String iconImage) {
        this.iconImage = iconImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramBadge that = (ProgramBadge) o;
        return isEnabled == that.isEnabled &&
                program.equals(that.program) &&
                badge.equals(that.badge) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(batchName, that.batchName) &&
                Objects.equals(iconImage, that.iconImage) &&
                Objects.equals(description, that.description) &&
                Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(program, badge, companyId, batchName, iconImage, description, points, isEnabled);
    }
}
*/
