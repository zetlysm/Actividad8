/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomp8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hgarz
 */
public class Deck {
    private ArrayList<Card> deck;
    private String[] ranks = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JOTA", "REINA", "REY"};
    private String[] suits = {"PICAS NEGRO", "CORAZONES ROJO", "TREBOLES NEGRO", "DIAMANTE ROJO"};

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(ranks[j], suits[i]));
            }
        }
    }

    public void showCards() {
        System.out.println("Mostrando Cards: ");
        int i = 1;
        for (Card c : deck) {
            System.out.println("Carta " + (i++) + " : " + c);
        }
    }
    
    public Card drawRandomCard()
    {
        Random generator = new Random();
        int index = generator.nextInt(deck.size());
        return deck.remove(index);
    }
    
    public void head()
    {
        int index = 0;
        deck.get(index);
        System.out.println("Mostrando Head: \n" + deck.get(index));
        deck.remove(index);
    }

    public void shuffle() {
        System.out.println("Shuffling! ");
        ArrayList<Card> temp = new ArrayList<Card>();
        while (!deck.isEmpty()) {
            int loc = (int) (Math.random() * deck.size());
            temp.add(deck.get(loc));
            deck.remove(loc);
        }
        deck = temp;
    }
    
    public String toString() {
        String result = "Cartas restantes en el deck: " + deck.size()+"\n";
        return result;

    }
    
    public String toString2() {
        String result = "Cartas restantes en el deck: " + deck;
        return result;

    }
}
