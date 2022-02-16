package com.company;

public abstract class Animals {
    private int weight;
    private int age;
    private String gender;
    private String nickName;


    public Animals(){};

    public Animals(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickName;
    }

    public void setNickname(String nickName) {
        this.nickName = nickName;
    }
    public void getAnimals(){
        System.out.println(getNickname()+", Gender - "
                +getGender()+
                ", age - "+getAge()+", weight - "+
                getWeight());
    }

}
