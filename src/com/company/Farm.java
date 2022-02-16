package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;
    private String ownerName;

    public Farm(){};

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    void getFarm(){
        System.out.println("Address: "+getAddress() + ", Owner: "+ getOwnerName());
        for (Animals cows:getCows()) {
            cows.getAnimals();
        }

        for (Animals sheeps:getSheeps()) {
            sheeps.getAnimals();
        }
        for (Horse horses: getHorses()) {
            horses.getHorse();
        }
    }

    }

