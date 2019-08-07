package com.poc.campaigncatalogservice.models;

public class CatalogItem {

    private String name;
    private String desc;
    private String goal;

    public CatalogItem(String name, String desc, String goal) {
        this.name = name;
        this.desc = desc;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
