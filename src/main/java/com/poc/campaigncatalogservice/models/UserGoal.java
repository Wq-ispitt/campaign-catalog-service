package com.poc.campaigncatalogservice.models;

import java.util.List;

public class UserGoal {

    private List<Goal> userGoal;

    public List<Goal> getUserGoal() {
        return userGoal;
    }

    public void setUserGoal(List<Goal> userGoal) {
        this.userGoal = userGoal;
    }
}
