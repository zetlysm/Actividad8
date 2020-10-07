/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomp8;

/**
 *
 * @author hgarz
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String r, String s) {
        rank = r;
        suit = s;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return suit + " " + rank;
    }
}
