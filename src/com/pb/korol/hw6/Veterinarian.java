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

    private String identifyAnimal(Animal animal) {
        if (animal instanceof Cat) return "кошка";
        if (animal instanceof Dog) return "собака";
        if (animal instanceof Horse) return "лошадь";
        return "неизвестное доктору животное";
    }

    public void treatAnimal(Animal animal) {
        String animalType = identifyAnimal(animal);
        System.out.println();
        System.out.println("Прием пациента №" + (animalsTreated + 1) + ". Это " + animalType + ".");
        System.out.println("Любимая еда - " + animal.getFood() + ", место жительства - " + animal.getLocation() + ".");

        switch (animalType) {
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
