package com.pb.korol.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private int maxSpeed;

    public Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест много, потому что нужно бегать " + maxSpeed + " км/ч.");
    }

    @Override
    public String toString() {
        return "Лошадь - любимая еда: " + food + ", место жительства: " + location +
                ", максимальная скорость: " + maxSpeed + " км/ч.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        Horse anotherHorse = (Horse) obj;
        return food.equals(anotherHorse.food) &&
               location.equals(anotherHorse.location) &&
               maxSpeed == anotherHorse.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, maxSpeed);
    }
}
