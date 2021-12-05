package com.example.demo.model;

import java.util.List;

public class Teams {
    private String id;
    private String name;
    private List<Developer> developerList;

    public Teams(String id, String name, List<Developer> developerList) {
        this.id = id;
        this.name = name;
        this.developerList = developerList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }
}
