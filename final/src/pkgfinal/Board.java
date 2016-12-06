/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.ArrayList;
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
    private ArrayList<Card> winPool; //Most recent war's card pool.
    int warCount;
    
    Board(){
        deck1 = new Deck(1);
        deck2 = new Deck(2);
        winPool = new ArrayList<Card>();
        warCount = 0;
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
    public void putInPlay(){ //Removes cards from the deck and puts them in the inPlay variables.
        inPlay1 = deck1.getTopCard();
        deck1.deleteTopCard();
        inPlay2 = deck2.getTopCard();
        deck2.deleteTopCard();
    }
    public int roundWinner(){ //Determines which card is greater in value of the inPlay cards.
        if(inPlay1.getVal() > inPlay2.getVal()){
            return 1;
        }
        else if( inPlay1.getVal() < inPlay2.getVal()){
            return 2;
        }
        else return 3; // this means war
    }
    
    public boolean decksEmpty(){
        if(deck1.isEmpty() == true){
            return true;
        } 
        else if(deck2.isEmpty() == true){
            return true;
        }
        else return false;
    }
    
    public int whoWon(){
        if(deck1.getCardList().size() > deck2.getCardList().size()){
            return 1;
        }
        else if(deck2.getCardList().size() > deck1.getCardList().size())
            return 2;
        else
            return 3;
    }
    
    public void refill(){
        int winner = this.roundWinner();
        switch (winner) {
            case 1:
                deck1.addCard(inPlay1);
                deck1.addCard(inPlay2);
                inPlay1 = null;
                inPlay2 = null;
                break;
            case 2:
                deck2.addCard(inPlay1);
                deck2.addCard(inPlay2);
                inPlay1 = null;
                inPlay2 = null;
                break;
            case 3:
                executeWar();
                warCount++;
                break;
            default:
                System.out.println("SOMETHING WENT WRONG");
                break;
        }
    }


    public Card getInPlay1() {
        return inPlay1;
    }

    public Card getInPlay2() {
        return inPlay2;
    }
    
    public void executeWar(){
        winPool.add(inPlay1);
        winPool.add(inPlay2);
        for(int i = 0; i < 3; i++){
            if(!decksEmpty()){
                winPool.add(deck1.getTopCard());
                deck1.deleteTopCard();
                winPool.add(deck2.getTopCard());
                deck2.deleteTopCard();
            }
        }
        if(!decksEmpty())
            refill();
        if(roundWinner() == 1){
            for(int i = 0; i < winPool.size(); i ++)
            {
                deck1.addCard(winPool.get(i));
            }
        }
        else{
            for(int i = 0; i < winPool.size(); i ++)
            {
                deck2.addCard(winPool.get(i));
            }
        }
        winPool.clear();
    }
    
}
