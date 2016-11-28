package com.company;

import com.company.MusicalInstrument.Guitar;
import com.company.MusicalInstrument.MusicalInstrument;
import com.company.MusicalInstrument.Piano;
import com.company.MusicalInstrument.Tromb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MusicShop {
    static Map<MusicalInstrument, Integer> inventar = new HashMap<>();
    static double shopIncome = 0;

    public static void main(String[] args) {
        loadInventar();
        sellMusicalInstrument();
        System.out.println("Shop income: " + shopIncome + "$");
    }

    private static void sellMusicalInstrument() {
        Scanner scan = new Scanner(System.in);
        do {

            System.out.println("Do you want to buy something? Press Y or N");
            String wishToBuy= scan.next();
            if(wishToBuy.equals("n")){
                return;
            }
            System.out.println("What kind of instrument would you like to buy? Press 1 for Guitar, 2 for Piano, 3 for Tromb");
            int decision = scan.nextInt();
            switch (decision) {
                case 1:

                    for (Map.Entry<MusicalInstrument, Integer> nextElement : inventar.entrySet()) {
                        if (nextElement.getKey().getName().equals("Guitar")) {
                            System.out.println("You've chose a guitar! The cost is " + nextElement.getKey().getPrice() + "$");
                            nextElement.setValue(nextElement.getValue() - 1);
                            shopIncome += nextElement.getKey().getPrice();
                        }
                        break;
                    }
                case 2:
                    for (Map.Entry<MusicalInstrument, Integer> nextElement : inventar.entrySet()) {
                        if (nextElement.getKey().getName().equals("Piano")) {
                            System.out.println("You've chose a piano! The cost is " + nextElement.getKey().getPrice() + "$");
                            nextElement.setValue(nextElement.getValue() - 1);
                            shopIncome += nextElement.getKey().getPrice();
                        }
                        break;
                    }
                case 3:
                    for (Map.Entry<MusicalInstrument, Integer> nextElement : inventar.entrySet()) {
                        if (nextElement.getKey().getName().equals("Tromb")) {
                            System.out.println("You've chose a tromb! The cost is " + nextElement.getKey().getPrice() + "$");
                            nextElement.setValue(nextElement.getValue() - 1);
                            shopIncome += nextElement.getKey().getPrice();
                        }
                        break;
                    }
            }
        } while (true);
    }

    private static void loadInventar() {
        inventar.put(new Guitar("Guitar", "Jamamay", 250, true), 16);
        inventar.put(new Piano("Piano", "Leeroy", 1500), 6);
        inventar.put(new Tromb("Tromb", "Jo-Jo", 95), 35);
    }
}
