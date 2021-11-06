package com.pb.korol.hw6;

public class Veterinarian {
    private String name;
    private int animalsTreated;

    public Veterinarian(String name, int animalsTreated) {
        this.name = name;
        this.animalsTreated = animalsTreated;
    }

    public String getName() {
        return name;
    }

    public void treatAnimal(Animal animal) {
        String species = animal.getSpecies();
        System.out.println();
        System.out.println("Прием пациента №" + (animalsTreated + 1) + ". Это " + species + ".");
        System.out.println("Любимая еда - " + animal.getFood() + ", место жительства - " + animal.getLocation() + ".");

        switch (species) {
            case "кошка":
                animal.sleep();
                break;
            case "собака":
                animal.makeNoise();
                break;
            default:
                animal.eat();
        }
        animalsTreated++;
    }
}
