package com.poc.campaigncatalogservice.models;

public class Campaign {

    private String campId;
    private String name;

    public Campaign() {
    }

    public Campaign(String campId, String name) {
        this.campId = campId;
        this.name = name;
    }

    public String getCampId() {
        return campId;
    }

    public void setCampId(String campId) {
        this.campId = campId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
