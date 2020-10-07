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
        Deck myDeck = new Deck();
        //myDeck.showCards(); Ver todas cartas antes de shuffle
        myDeck.shuffle();
        System.out.println(myDeck.toString());
        //myDeck.showCards(); Ver todas cartas despues de shufle
        myDeck.head();
        System.out.println(myDeck.toString());
        Card C;
        
        int numberCards = 1;

        System.out.println("Mostrando una tarjeta: ");
        for (int i = 0; i < numberCards; i++) {
            C = myDeck.drawRandomCard();
            System.out.println(C.toString());
        }
        System.out.println(myDeck.toString());
        
        int fiveCards = 5;
        System.out.println("Mostrando cinco tarjetas: ");
        for (int i = 0; i < fiveCards; i++) {
            C = myDeck.drawRandomCard();
            System.out.println(C.toString());
        }
        System.out.println(myDeck.toString());

        ////System.out.println(myDeck.toString2()); Ver cartas restantes
    }
}
