package com.example.readjsonfromfile;

import androidx.annotation.NonNull;

public class Mountains {
    private String name;
    private String location;
    private int size;
    private int cost;

    public Mountains(String name, String location, int size, int cost) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " has an altitude of " + size + "m above sea level";
    }
}
