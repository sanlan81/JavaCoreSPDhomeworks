package com.spduniversity.javacore.hw6.EnumPizza;

import java.util.HashMap;
import java.util.Scanner;

public class Meal {

    private HashMap<Prise, Integer> hashMap = new HashMap<>();
    private int americanoPizza = 0;
    private int itallianoPizza = 0;
    private int ownPizza = 0;
    private int counter = 0;

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.go();
    }

    private void go() {
        char kindType;

        Scanner keyboard = new Scanner(System.in);

        boolean pizzas = true;
        while (pizzas) {
            System.out.println("We have differents pizzas: (A)Americano, (I)Italiano or you can pick up " + "\n" +
                    "your (O)Own Pizza. " + "What would you like? Please enter  A, I or O ");

            kindType = keyboard.nextLine().charAt(0);

            if (kindType == 'A' || kindType == 'a') {
                americanoPizza++;
                System.out.println(Pizza.Name.Americano);
                System.out.println(Order.Americano);
                System.out.println("It wii be coast  23 $");
                counter = counter + Prise.Cheese.getPrice() + Prise.Sousage.getPrice() + Prise.Corn.getPrice();

            } else if (kindType == 'I' || kindType == 'i') {
                itallianoPizza++;
                System.out.println(Pizza.Name.Italliano);
                System.out.println(Order.Italliano);
                System.out.println("It wii be coast  28 $");
                counter = counter + Prise.Cheese.getPrice() + Prise.Pork.getPrice() + Prise.Olive.getPrice();

            } else if (kindType == 'O' || kindType == 'o') {
                ownPizza++;
                System.out.println(Pizza.Name.OwnPiazza);
                System.out.println(Order.OwnPizza);

            } else {
                System.out.println("The Pizza type you have entered is illegal, your pizza choose will be set to Americano. ");
                System.out.println("It will be  coast 23 $");
                counter = counter + Prise.Cheese.getPrice() + Prise.Sousage.getPrice() + Prise.Corn.getPrice();
                americanoPizza++;
                kindType = 'A';
            }
            char trueIngridient;
            while (true) {

                if (kindType == 'I' || kindType == 'i') {
                    System.out.println("Do you want to add any of these ingridients ? " + "\n" +
                            "(C)Cheese ,(P)Pork, (O)Olive, (N)No");

                } else if (kindType == 'O' || kindType == 'o') {
                    System.out.println("Do you want to add any of these ingridients ? " + "\n" +
                            "(C)Cheese ,(P)Pork, (S)Sausage, (O)Olive,(R)Corn, (F)Seafood, (N)No");
                } else {
                    System.out.println("Do you want to add any of these ingridients ? " + "\n" +
                            "(C)Cheese ,(S)Sausage, (R)Corn, (N)No");
                }
                trueIngridient = keyboard.nextLine().charAt(0);

                if (trueIngridient == 'C' || trueIngridient == 'c') {

                    if (kindType == 'I' || kindType == 'i') {
                        System.out.println(Prise.Cheese + " " + Prise.Cheese.getPrice() + "  $");
                        counter = counter + Prise.Cheese.getPrice();
                    } else if (kindType == 'O' || kindType == 'o') {
                        System.out.println(Prise.Cheese + " " + Prise.Cheese.getPrice() + "  $");
                        counter = counter + Prise.Cheese.getPrice();
                        hashMap.putIfAbsent(Prise.Cheese, Prise.Cheese.getPrice());

                    } else {
                        System.out.println(Prise.Cheese + " " + Prise.Cheese.getPrice() + "  $");
                        counter = counter + Prise.Cheese.getPrice();

                    }
                } else if (trueIngridient == 'S' || trueIngridient == 's') {
                    System.out.println(Prise.Sousage + " " + Prise.Sousage.getPrice() + " $");
                    counter = counter + Prise.Sousage.getPrice();
                    hashMap.putIfAbsent(Prise.Sousage, Prise.Sousage.getPrice());


                } else if (trueIngridient == 'R' || trueIngridient == 'r') {
                    System.out.println(Prise.Corn + " " + Prise.Corn.getPrice() + " $");
                    counter = counter + Prise.Corn.getPrice();
                    hashMap.putIfAbsent(Prise.Corn, Prise.Corn.getPrice());

                } else if (trueIngridient == 'P' || trueIngridient == 'p') {
                    System.out.println(Prise.Pork + " " + Prise.Pork.getPrice() + " $");
                    counter = counter + Prise.Pork.getPrice();
                    hashMap.putIfAbsent(Prise.Pork, Prise.Pork.getPrice());

                } else if (trueIngridient == 'O' || trueIngridient == 'o') {
                    System.out.println(Prise.Olive + " " + Prise.Olive.getPrice() + " $");
                    counter = counter + Prise.Olive.getPrice();
                    hashMap.putIfAbsent(Prise.Olive, Prise.Cheese.getPrice());

                } else if (trueIngridient == 'F' || trueIngridient == 'f') {
                    System.out.println(Prise.Seafood + " " + Prise.Seafood.getPrice() + " $");
                    counter = counter + Prise.Seafood.getPrice();
                    hashMap.putIfAbsent(Prise.Seafood, Prise.Seafood.getPrice());
                } else if (trueIngridient == 'N' || trueIngridient == 'n') {
                    break;
                }
            }
            System.out.println("If you want to order another pizza or this same  one more press any letter!  " + "\n" +
                    "If  you want receive the check press (N)");
            trueIngridient = keyboard.nextLine().charAt(0);
            if (trueIngridient == 'N' || trueIngridient == 'n') {
                pizzas = false;
            }
        }
        // Payment Confirmation
        if ((americanoPizza != 0) && (ownPizza != 0) && (itallianoPizza != 0)) {
            System.out.println("You ordered " + americanoPizza + " American Pizza");
            System.out.println("Here is your order: Base  pizza $ 23  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Sousage + " " + Prise.Sousage.getPrice() + "\n\t" +
                    Prise.Corn + " " + Prise.Corn.getPrice());
            System.out.println("============================");
            System.out.println("You ordered " + itallianoPizza + " Itallian Pizza");
            System.out.println("Here is your order: Base  $ 28  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Pork + " " + Prise.Pork.getPrice() + "\n\t" +
                    Prise.Olive + " " + Prise.Olive.getPrice());
            System.out.println("============================");
            System.out.println("You ordered " + ownPizza + " Own Pizza");
            System.out.println("Total ingridients for one inch : ");
            System.out.println(hashMap + "\n\t");
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if ((americanoPizza != 0) && (ownPizza != 0)) {
            System.out.println("You ordered " + americanoPizza + " American Pizza");
            System.out.println("Here is your order: Base  pizza $ 23  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Sousage + " " + Prise.Sousage.getPrice() + "\n\t" +
                    Prise.Corn + " " + Prise.Corn.getPrice());
            System.out.println("============================");
            System.out.println("You ordered " + ownPizza + " Own Pizza");
            System.out.println("Total ingridients for one inch : ");
            System.out.println(hashMap + "\n\t");
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if ((ownPizza != 0) && (itallianoPizza != 0)) {
            System.out.println("You ordered " + itallianoPizza + " Itallian Pizza");
            System.out.println("Here is your order: Base  $ 28  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Pork + " " + Prise.Pork.getPrice() + "\n\t" +
                    Prise.Olive + " " + Prise.Olive.getPrice());
            System.out.println("============================");
            System.out.println("You ordered " + ownPizza + " Own Pizza");
            System.out.println("Total ingridients for one inch : ");
            System.out.println(hashMap + "\n\t");
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if ((americanoPizza != 0) && (itallianoPizza != 0)) {
            System.out.println("You ordered " + americanoPizza + " American Pizza");
            System.out.println("Here is your order: Base  pizza $ 23  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Sousage + " " + Prise.Sousage.getPrice() + "\n\t" +
                    Prise.Corn + " " + Prise.Corn.getPrice());
            System.out.println("============================");
            System.out.println("You ordered " + itallianoPizza + " Itallian Pizza");
            System.out.println("Here is your order: Base  $ 28  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Pork + " " + Prise.Pork.getPrice() + "\n\t" +
                    Prise.Olive + " " + Prise.Olive.getPrice());
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if (americanoPizza != 0) {
            System.out.println("You ordered " + americanoPizza + " American Pizza");
            System.out.println("Here is your order: Base  pizza $ 23  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Sousage + " " + Prise.Sousage.getPrice() + "\n\t" +
                    Prise.Corn + " " + Prise.Corn.getPrice());
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if (itallianoPizza != 0) {
            System.out.println("You ordered " + itallianoPizza + " Itallian Pizza");
            System.out.println("Here is your order: Base  $ 28  ");
            System.out.println("Total ingridients for one inch : \n\t" +
                    Prise.Cheese + " " + Prise.Cheese.getPrice() + "\n\t" +
                    Prise.Pork + " " + Prise.Pork.getPrice() + "\n\t" +
                    Prise.Olive + " " + Prise.Olive.getPrice());
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");

        } else if (ownPizza != 0) {
            System.out.println("You ordered " + ownPizza + " Own Pizza");
            System.out.println("Total ingridients for one inch : ");
            System.out.println(hashMap + "\n\t");
            System.out.println("Total praise : $ " + counter);
            System.out.println("Enjoy Your food!!!");
        }
    }
}