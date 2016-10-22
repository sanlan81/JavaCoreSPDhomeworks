package com.spduniversity.javacore.hw3.pizza;

import java.util.Scanner;

public class TestPizza extends PizzaHot {


    private AmericanoPizza americanoPizza = new AmericanoPizza(Cheese, Sausege, Olive);
    private ItallianoPizza itallianoPizza = new ItallianoPizza(Cheese, Cucumber, Pork);
    private OwnPizza ownPizza = new OwnPizza(Cheese, Cucumber, Pork, Sausege, Olive, Corn, Seafood);
    private int americanPrize;
    private int itallianPrize;
    private int ownPizzaPrize;
    private int totalCheeseI;

    private int totalCheeseO;
    private int totalSausegeO;
    private int totalOliveO;
    private int totalCucumberO;
    private int totalPorkO;
    private int totalCornO;
    private int totalSeafoodO;


    public static void main(String[] args) {
        TestPizza testPizza = new TestPizza();
        testPizza.go();
    }

    private void go() {
        int counter = 0;

        char kindType;

        // String firstName = keyboard.nextLine();
        Scanner keyboard = new Scanner(System.in);
        while (pizzas) {
            System.out.println("We have differents pizzas: (A)Americano, (I)Italiano, (C)Carbanera or you can pick up " + "\n" +
                    "your (O)Own Pizza. " + "What would you like? Please enter  A, I, C or O, : ");

            kindType = keyboard.nextLine().charAt(0);

            if (kindType == 'A' || kindType == 'a') {
                kindAmerican = "Americano";
                System.out.println("Your choose \"Americano\".");
                counter = counter + americanoPizza.getTotalIngridients();
                totalCheese = totalCheese + Cheese;
                totalSausege = totalSausege + Sausege;
                totalOlive = totalOlive + Olive;
                totalAmericanPizza++;
                System.out.println("It's coast 15$");
                americanPrize = americanPrize + americanoPizza.getTotalIngridients();


            } else if (kindType == 'I' || kindType == 'i') {
                kindItallian = "Italliano";
                System.out.println("Your choose \"Italliano\".");
                counter = counter + itallianoPizza.getTotalIngridients();
                totalCheeseI = totalCheeseI + Cheese;
                totalPork = totalPork + Pork;
                totalCucumber = totalCucumber + Cucumber;
                totalItallianPizza++;
                System.out.println("It's coast 16$");
                itallianPrize = itallianPrize + itallianoPizza.getTotalIngridients();

            } else if (kindType == 'C' || kindType == 'c') {
                kindCarbanera = "Carbanera";
                System.out.println("Your choose \"Carbanera\".");
                System.out.println("We are sorry but we don't have this pizza \"Carbanera\" right now!!.");
                System.out.println("Please make another choose.");
                System.out.println("Thank you for understanding!");
            } else if (kindType == 'O' || kindType == 'o') {
                kindOwn = "Own Pizza";
                System.out.println("You decided to pick your \"Own Pizza\".");
                counter = counter + ownPizza.getTotalIngridients();
               /* totalCheeseO = totalCheeseO + Cheese;
                totalSausegeO = totalSausegeO + Sausege;
                totalOliveO = totalOliveO + Olive;
                totalPorkO = totalPorkO + Pork;
                totalCucumberO = totalCucumberO + Cucumber;
                totalCornO = totalCornO + Corn;
                totalSeafoodO = totalSeafoodO + Seafood;*/
                totalOwnPizza++;
                ownPizzaPrize = ownPizzaPrize + ownPizza.getTotalIngridients();

            } else if (kindType != 'A' && kindType != 'a' && kindType != 'I' && kindType != 'i' && kindType != 'C' && kindType != 'c') {
                System.out.println("The Pizza type you have entered is illegal, your pizza choose will be set to Americano. ");
                kindAmerican = "Americano";
                System.out.println("It's coast 15$");
                kindType = 'A';

            }

            ingridients = true;
            // to add cheese

            char trueIngridient;
            while (ingridients) {

                if (kindType == 'A' || kindType == 'a') {
                    System.out.println("Do you want to add any of these ingridients? " + "\n" +
                            "(C)Cheese ,(S)Sausege, (O)Olive, (N)No");


                } else if (kindType == 'I' || kindType == 'i') {
                    System.out.println("Do you want to add any of these ingridients? " + "\n" +
                            "(C)Cheese ,(P)Pork, (U)Cucumber, (N)No");

                } else if (kindType == 'O' || kindType == 'o') {
                    System.out.println("Do you want to add any of these ingridients? " + "\n" +
                            "(C)Cheese ,(P)Pork, (U)Cucumber,(S)Sausege, (O)Olive,(R)Corn, (F)Seafood, (N)No");


                }

                trueIngridient = keyboard.nextLine().charAt(0);
               /* if(((trueIngridient != 'C') || (trueIngridient != 'c'))||((trueIngridient != 'S' )||( trueIngridient != 's'))||
                        ((trueIngridient != 'O') || (trueIngridient != 'o'))||((trueIngridient != 'U' )||(trueIngridient != 'u'))||
                        ((trueIngridient != 'P' )||(trueIngridient != 'p'))||((trueIngridient != 'N' )|| (trueIngridient != 'n'))){
                    System.out.println("Your ingridient you have entered is illegal may be : ");
                 ingridients = false;
                    break;
                }else*/
                if (trueIngridient == 'C' || trueIngridient == 'c') {
                    counter = counter + Cheese;
                    if (kindType == 'A' || kindType == 'a') {
                        totalCheese = totalCheese + Cheese;
                    } else if (kindType == 'I' || kindType == 'i') {
                        totalCheeseI = totalCheeseI + Cheese;
                    } else if (kindType == 'O' || kindType == 'o') {
                        totalCheeseO = totalCheeseO + Cheese;
                        ownPizzaPrize = ownPizzaPrize + totalCheeseO;
                    }

                } else if (trueIngridient == 'S' || trueIngridient == 's') {
                    counter = counter + Sausege;
                    totalSausege = totalSausege + Sausege;
                    if (kindType == 'O' || kindType == 'o') {
                        totalSausegeO = totalSausegeO + Sausege;
                        ownPizzaPrize = ownPizzaPrize + totalSausegeO;
                    }
                } else if (trueIngridient == 'O' || trueIngridient == 'o') {
                    counter = counter + Olive;
                    totalOlive = totalOlive + Olive;
                    if (kindType == 'O' || kindType == 'o') {
                        totalOliveO = totalOliveO + Olive;
                        ownPizzaPrize = ownPizzaPrize + totalOliveO;
                    }

                } else if (trueIngridient == 'U' || trueIngridient == 'u') {
                    counter = counter + Cucumber;
                    totalCucumber = totalCucumber + Cucumber;
                    if (kindType == 'O' || kindType == 'o') {
                        totalCucumberO = totalCucumberO + Cucumber;
                        ownPizzaPrize = ownPizzaPrize + totalCucumberO;

                    }

                } else if (trueIngridient == 'P' || trueIngridient == 'p') {
                    counter = counter + Pork;
                    totalPork = totalPork + Pork;
                    if (kindType == 'O' || kindType == 'o') {
                        totalPorkO = totalPorkO + Pork;
                        ownPizzaPrize = ownPizzaPrize + totalPorkO;
                    }

                } else if (trueIngridient == 'R' || trueIngridient == 'r') {
                    counter = counter + Corn;
                    totalCorn = totalCorn + Corn;
                    if (kindType == 'O' || kindType == 'o') {
                        totalCornO = totalCornO + Corn;
                        ownPizzaPrize = ownPizzaPrize + totalCornO;
                    }

                } else if (trueIngridient == 'F' || trueIngridient == 'f') {
                    counter = counter + Seafood;
                    totalSeafood = totalSeafood + Seafood;
                    if (kindType == 'O' || kindType == 'o') {
                        totalSeafoodO = totalSeafoodO + Seafood;
                        ownPizzaPrize = ownPizzaPrize + totalSeafoodO;
                    }

                } else if (trueIngridient == 'N' || trueIngridient == 'n') {
                    ingridients = false;
                    break;
                }
                System.out.println(counter);
                System.out.println("Do you want to add somthing else? (Y/N)");
                trueIngridient = keyboard.nextLine().charAt(0);
                if (trueIngridient == 'Y' || trueIngridient == 'y') {
                } else if (trueIngridient == 'N' || trueIngridient == 'n') {
                    ingridients = false;
                }
            }
            System.out.println("Do you want to add another pizza  and one more ? (Y/N)");
            trueIngridient = keyboard.nextLine().charAt(0);
            if (trueIngridient == 'Y' || trueIngridient == 'y') {
            } else if (trueIngridient == 'N' || trueIngridient == 'n') {
                pizzas = false;
            }

        }


        // Payment Confirmation
        if ((totalAmericanPizza != 0) && (totalItallianPizza != 0) && (totalOwnPizza != 0)) {
            System.out.println("Here is your order: ");
            System.out.println("Base " + totalAmericanPizza + " " + kindAmerican + " " + americanPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheese + "\n\t" +
                    "Sausege $" + totalSausege + "\n\t" +
                    "Olive $" + totalOlive);
            System.out.println();
            System.out.println("Base " + totalItallianPizza + " " + kindItallian + " " + itallianPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseI + "\n\t" +
                    "Pork $" + totalPork + "\n\t" +
                    "Cucumber $" + totalCucumber);
            System.out.println();
            System.out.println(totalOwnPizza + " " + kindOwn + " " + ownPizzaPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseO + "\n\t" +
                    "Corn $" + totalCornO + "\n\t" +
                    "Sausege $" + totalSausegeO + "\n\t" +
                    "Seafood $" + totalSeafoodO + "\n\t" +
                    "Olive $" + totalOliveO + "\n\t" +
                    "Pork $" + totalPorkO + "\n\t" +
                    "Cucumber $" + totalCucumberO);
            System.out.println("Order Cost: $" + counter);
            System.out.println("Enjoy Your food!!!");
        } else if ((totalAmericanPizza != 0) && (totalOwnPizza != 0)) {
            System.out.println("Here is your order: ");
            System.out.println("Base " + totalAmericanPizza + " " + kindAmerican + " " + americanPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheese + "\n\t" +
                    "Sausege $" + totalSausege + "\n\t" +
                    "Olive $" + totalOlive);
            System.out.println();
            System.out.println(totalOwnPizza + " " + kindOwn + " " + ownPizzaPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseO + "\n\t" +
                    "Corn $" + totalCornO + "\n\t" +
                    "Sausege $" + totalSausegeO + "\n\t" +
                    "Seafood $" + totalSeafoodO + "\n\t" +
                    "Olive $" + totalOliveO + "\n\t" +
                    "Pork $" + totalPorkO + "\n\t" +
                    "Cucumber $" + totalCucumberO);
            System.out.println("Order Cost: $" + counter);
            System.out.println("Enjoy Your food!!!");
        } else if ((totalItallianPizza != 0) && (totalOwnPizza != 0)) {
            System.out.println("Here is your order: ");
            System.out.println("Base " + totalItallianPizza + " " + kindItallian + " " + itallianPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseI + "\n\t" +
                    "Pork $" + totalPork + "\n\t" +
                    "Cucumber $" + totalCucumber);
            System.out.println();
            System.out.println(totalOwnPizza + " " + kindOwn + " " + ownPizzaPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseO + "\n\t" +
                    "Corn $" + totalCornO + "\n\t" +
                    "Sausege $" + totalSausegeO + "\n\t" +
                    "Seafood $" + totalSeafoodO + "\n\t" +
                    "Olive $" + totalOliveO + "\n\t" +
                    "Pork $" + totalPorkO + "\n\t" +
                    "Cucumber $" + totalCucumberO);
            System.out.println("Order Cost: $" + counter);
            System.out.println("Enjoy Your food!!!");
        } else if ((totalAmericanPizza != 0) && (totalItallianPizza != 0)) {
            System.out.println("Here is your order: ");
            System.out.println("Base " + totalAmericanPizza + " " + kindAmerican + " " + americanPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheese + "\n\t" +
                    "Sausege $" + totalSausege + "\n\t" +
                    "Olive $" + totalOlive);
            System.out.println();
            System.out.println("Base " + totalItallianPizza + " " + kindItallian + " " + itallianPrize + "$");
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseI + "\n\t" +
                    "Pork $" + totalPork + "\n\t" +
                    "Cucumber $" + totalCucumber);
            System.out.println("Order Cost: $" + counter);
            System.out.println("Enjoy Your food!!!");
        } else if (totalAmericanPizza != 0) {
            System.out.println("Here is your order: Base " + totalAmericanPizza + " " + kindAmerican + " " + americanPrize + "$");
            System.out.println("Order Cost: $" + counter);
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheese + "\n\t" +
                    "Sausege $" + totalSausege + "\n\t" +
                    "Olive $" + totalOlive);
            System.out.println("Enjoy Your food!!!");

        } else if (totalItallianPizza != 0) {
            System.out.println("Here is your order: Base " + totalItallianPizza + " " + kindItallian + " " + itallianPrize + "$");
            System.out.println("Order Cost: $" + counter);
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseI + "\n\t" +
                    "Pork $" + totalPork + "\n\t" +
                    "Cucumber $" + totalCucumber);
            System.out.println("Enjoy Your food!!!");
        } else if (totalOwnPizza != 0) {
            System.out.println("Here is your order: " + totalOwnPizza + " " + kindOwn + " " + ownPizzaPrize + "$");
            System.out.println("Order Cost: $" + counter);
            System.out.println("Total ingridients: \n\t" +
                    "Cheese $" + totalCheeseO + "\n\t" +
                    "Corn $" + totalCornO + "\n\t" +
                    "Sausege $" + totalSausegeO + "\n\t" +
                    "Seafood $" + totalSeafoodO + "\n\t" +
                    "Olive $" + totalOliveO + "\n\t" +
                    "Pork $" + totalPorkO + "\n\t" +
                    "Cucumber $" + totalCucumberO);
            System.out.println("Enjoy Your food!!!");
        }
    }
}
