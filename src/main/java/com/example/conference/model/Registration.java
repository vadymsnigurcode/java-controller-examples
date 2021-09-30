package com.example.conference.model;

import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}
