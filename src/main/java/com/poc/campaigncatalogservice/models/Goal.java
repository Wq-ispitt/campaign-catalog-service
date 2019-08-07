package com.poc.campaigncatalogservice.models;

public class Goal {

    private String campId;
    private String campGoal;

    public Goal() {
    }

    public Goal(String campId, String campGoal) {
        this.campId = campId;
        this.campGoal = campGoal;
    }

    public String getCampId() {
        return campId;
    }

    public void setCampId(String campId) {
        this.campId = campId;
    }

    public String getCampGoal() {
        return campGoal;
    }

    public void setCampGoal(String campGoal) {
        this.campGoal = campGoal;
    }

}
