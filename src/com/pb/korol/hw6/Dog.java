package com.pb.korol.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String barkSound;

    public Dog(String food, String location, String barkSound) {
        super(food, location);
        this.barkSound = barkSound;
    }

    @Override
    public String getSpecies() {
        return "собака";
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает: " + barkSound + "!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String toString() {
        return "Собака - любимая еда: " + food + ", место жительства: " + location +
                ", звук лая: \"" + barkSound + "\".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        Dog anotherDog = (Dog) obj;
        return food.equals(anotherDog.food) &&
               location.equals(anotherDog.location) &&
               barkSound.equals(anotherDog.barkSound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, barkSound);
    }
}
