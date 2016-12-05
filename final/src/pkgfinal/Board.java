/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Random;

/**
 *
 * @author daw5510
 */
public class Board {
    private Deck deck1;
    private Deck deck2;
    
    Board(){
        deck1 = new Deck(1);
        deck2 = new Deck(2);
    }
    
    public Deck getDeck1(){
        return deck1;
    }
    
    public Deck getDeck2(){
        return deck2;
    }
    public void shuffle(){
        for(int i = 0; i < 2000; i++){
            int p1 = new Random().nextInt(26);
            int p2 = new Random().nextInt(26);
//            System.out.println(p1);
//            System.out.println(p2);
            Card hold = deck1.getCardList().get(p1);
            deck1.getCardList().set(p1, deck2.getCardList().get(p2));
            deck2.getCardList().set(p2, hold);
        }
    }
    public void printDecks(){
        System.out.println("\nDeck 1:");
        deck1.displayDeck();
        System.out.println("\nDeck 2:");
        deck2.displayDeck();
    }
}
