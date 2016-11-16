/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.ArrayList;

/**
 *
 * @author daw5510
 */
public class Deck {
    private ArrayList<Card> cardList;
    
    Deck(){
        cardList = new ArrayList<Card>();
        cardList.add(new Card("Ace of Spades", 14, "Spades"));
        cardList.add(new Card("Two of Spades", 2, "Spades"));
        cardList.add(new Card("Three of Spades", 3, "Spades"));
        cardList.add(new Card("Four of Spades", 4, "Spades"));
        cardList.add(new Card("Five of Spades", 5, "Spades"));
        cardList.add(new Card("Six of Spades", 6, "Spades"));
        cardList.add(new Card("Seven of Spades", 7, "Spades"));
        cardList.add(new Card("Eight of Spades", 8, "Spades"));
        cardList.add(new Card("Nine of Spades", 9, "Spades"));
        cardList.add(new Card("Ten of Spades", 10, "Spades"));
        cardList.add(new Card("Jack of Spades", 11, "Spades"));
        cardList.add(new Card("Queen of Spades", 12, "Spades"));
        cardList.add(new Card("King of Spades", 13, "Spades"));
        cardList.add(new Card("King of Spades", 13, "Spades"));
    }
}
