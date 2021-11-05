package com.pb.korol.hw6;
import java.lang.reflect.*;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animalsToTreat = new Animal[6];
        animalsToTreat[0] = new Cat("тунец", "квартира", 16);
        animalsToTreat[1] = new Cat("мыши", "дом", 14);
        animalsToTreat[2] = new Dog("говядина", "ферма", "гав");
        animalsToTreat[3] = new Dog("корм", "питомник", "тяв");
        animalsToTreat[4] = new Horse("овес", "ферма", 35);
        animalsToTreat[5] = new Animal("люди", "пещера");

        Class<?> doctorClazz = Class.forName("com.pb.korol.hw6.Veterinarian");
        Constructor<?> newDoctor = doctorClazz.getConstructor(String.class, int.class);
        Object doctor1 = newDoctor.newInstance("Айболит", 0);

        if (doctor1 instanceof Veterinarian) {
            Veterinarian veterinarian1 = (Veterinarian) doctor1;

            System.out.println();
            System.out.println("Прием у врача по имени " + veterinarian1.getName() + ".");

            for (Animal nextAnimal: animalsToTreat) {
                veterinarian1.treatAnimal(nextAnimal);
            }
        }
    }
}
