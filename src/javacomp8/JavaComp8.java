/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomp8;

import java.util.Scanner;

/**
 *
 * @author hgarz
 */
public class JavaComp8 {

   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuOption;
        Deck myDeck = new Deck();
        Card C;
        input = new Scanner(System.in);
        boolean quit = false;
        System.out.print("Enter your choice:\n"
                + " 1 to Shuffle the deck.\n"
                + " 2 to draw the first card on the deck.\n"
                + " 3 to draw a single random card.\n"
                + " 4 to draw five random cards.\n"
                + " 0 to Exit.\n");
        do {
            System.out.print("Choose menu item: ");
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    myDeck.shuffle();
                    System.out.println(myDeck.toString());
                    break;
                case 2:
                    myDeck.head();
                    System.out.println(myDeck.toString());
                    break;
                case 3:
                    int numberCards = 1;
                    System.out.println("Mostrando una tarjeta: ");
                    for (int i = 0; i < numberCards; i++) {
                        C = myDeck.drawRandomCard();
                        System.out.println(C.toString());
                    }
                    System.out.println(myDeck.toString());
                    break;
                case 4:
                    int fiveCards = 5;
                    System.out.println("Mostrando cinco tarjetas: ");
                    for (int i = 0; i < fiveCards; i++) {
                        C = myDeck.drawRandomCard();
                        System.out.println(C.toString());
                    }
                    System.out.println(myDeck.toString());
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!quit);
        System.out.println("Exiting.");
    }
}
