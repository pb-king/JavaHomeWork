package com.pb.korol.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private int sleepDuration;

    public Cat(String food, String location, int sleepDuration) {
        super(food, location);
        this.sleepDuration = sleepDuration;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String toString() {
        return "Кошка - любимая еда: " + food + ", место жительства: " + location +
                ", длительность сна " + sleepDuration + " часов.";
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит целых " + sleepDuration + " часов.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        Cat anotherCat = (Cat) obj;
        return food.equals(anotherCat.food) &&
               location.equals(anotherCat.location) &&
               sleepDuration == anotherCat.sleepDuration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, sleepDuration);
    }
}
