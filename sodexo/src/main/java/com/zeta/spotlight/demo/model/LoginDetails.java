package com.zeta.spotlight.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginDetails {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

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
}
