package com.zeta.spotlight.demo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zeta.spotlight.demo.model.Employee;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class EmployeeResponse {

    @JsonProperty("data")
    private Optional<List<Employee>> employees;

    @JsonProperty("message")
    private final String message;

    @JsonProperty("time")
    private final Date time;

    public EmployeeResponse(Optional<List<Employee>> employees, String message) {
        this.employees = employees;
        this.message = message;
        this.time = new Date();
    }
}
