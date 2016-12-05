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
    private Deck deck1; //Deck for player 1
    private Deck deck2; //Deck for player 2
    private Card inPlay1; //Card currently in play for player 1
    private Card inPlay2; //Card currently in play for player 2
    
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
    public void shuffle(){ //Shuffles the cards in the decks. Meant to be done once at the beginning and never again, but can be used at any time.
        for(int i = 0; i < 2000; i++){
            int p1 = new Random().nextInt(deck1.getCardList().size());
            int p2 = new Random().nextInt(deck2.getCardList().size());
//            System.out.println(p1);
//            System.out.println(p2);
            Card hold = deck1.getCardList().get(p1);
            deck1.getCardList().set(p1, deck2.getCardList().get(p2));
            deck2.getCardList().set(p2, hold);
        }
    }
    public void printDecks(){ //Prints decks to console. (For Debugging)
        System.out.println("\nDeck 1:");
        deck1.displayDeck();
        System.out.println("\nDeck 2:");
        deck2.displayDeck();
    }
    public void draw(){ //Removes cards from the deck and puts them in the inPlay variables.
        inPlay1 = deck1.drawCard();
        inPlay2 = deck2.drawCard();
    }
    public int whoWon(){ //Determines which card is greater in value of the inPlay cards.
        if(getInPlay1().getVal() > getInPlay2().getVal()){
            return 1;
        }
        else if( getInPlay1().getVal() < getInPlay2().getVal()){
            return 2;
        }
        else return 3; // this means war
    }
    
    public void replaceCardsNoWar(int i){
        if(i == 1){
            deck1.addCard(inPlay1);
            deck2.addCard(inPlay2);
        }
        else
        {
            deck2.addCard(inPlay1);
            deck2.addCard(inPlay2);
        }
        inPlay1 = null;
        inPlay2 = null;
    }

    /**
     * @return the inPlay1
     */
    public Card getInPlay1() {
        return inPlay1;
    }

    /**
     * @return the inPlay2
     */
    public Card getInPlay2() {
        return inPlay2;
    }
}
