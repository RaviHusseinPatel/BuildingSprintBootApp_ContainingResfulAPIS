package com.example.GoodAfternoonChristmas.models;

public class GreetingPOJO {

    private String name;
    private int time;



    public  GreetingPOJO(String name, int time){
        this.name=name;
        this.time=0001;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
