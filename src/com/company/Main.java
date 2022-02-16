package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cow cows1 = new Cow(200, 3, "male","Kara Buka");
        Cow cows2 = new Cow(300, 2, "female","Targil");
        Cow cows3 = new Cow(400, 4, "female","Sari");
        Cow cows4 = new Cow(500, 3, "male","Ala Buka");
        Cow cows5 = new Cow(350, 2, "female","Ak");
        Cow[] cows = new Cow[]{cows1, cows2, cows3, cows4, cows5};

        Cow cows6 = new Cow(450, 3, "male","kara");
        Cow[] cow = new Cow[]{cows6};

        Sheep sheep1 = new Sheep(50, 2, "female", "Kara Koy");
        Sheep sheep2 = new Sheep(100, 4, "male", "Kara Kochkor");
        Sheep sheep3 = new Sheep(60, 3, "female", "Sari Koy");
        Sheep[] sheeps = new Sheep[]{sheep1, sheep2, sheep3};

        Sheep sheep4 = new Sheep(70, 3, "female", "Kara Koy");
        Sheep[] sheep = new Sheep[]{sheep4};



        Horse horses1 = new Horse(600, 4, "male", "Ak Kuula", "Ak");
        Horse horses2 = new Horse(700, 5, "male", "Tulpar", "Boz");
        Horse[] horses = new Horse[]{horses1, horses2};

        Horse horses3 = new Horse(500, 2, "male", "Kawka", "Ak");
        Horse[] horse = new Horse[]{horses3};


        Farm farm1 = new Farm("Ozgon", cows, horses,sheeps, "Azamat");
        System.out.println("3 sheeps, 5 cows, 2 horses ");
        farm1.getFarm();

        Farm farm2= new Farm("Kara Suu", cow, horse, sheep, "Aibek");
        System.out.println("3 sheeps, 5 cows, 2 horses ");
        farm2.getFarm();








    }
}
