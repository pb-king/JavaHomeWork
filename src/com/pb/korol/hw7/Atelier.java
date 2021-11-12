package com.pb.korol.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothesToDress = new Clothes[4];
        clothesToDress[0] = new Tshirt(Size.L, "красный", 350);
        clothesToDress[1] = new Pants(Size.M, "синий", 850);
        clothesToDress[2] = new Skirt(Size.M, "зеленый", 650);
        clothesToDress[3] = new Tie(Size.L, "серый", 250);

        dressWoman(clothesToDress);
        System.out.println();
        dressMan(clothesToDress);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в наличии:");

        for (Clothes nextPiece: clothes) {
            if (nextPiece instanceof MenClothes) {
                ((MenClothes)nextPiece).dressMan();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда в наличии:");

        for (Clothes nextPiece: clothes) {
            if (nextPiece instanceof WomenClothes) {
                ((WomenClothes)nextPiece).dressWoman();
            }
        }
    }
}
