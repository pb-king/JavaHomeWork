package com.pb.korol.hw6;

public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getSpecies() {
        return "какое-то животное";
    }

    public void makeNoise() {
        System.out.println("Животное издает какой-то звук.");
    }

    public void eat() {
        System.out.println("Животное ест.");
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
