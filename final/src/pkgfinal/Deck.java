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
    
    Deck(int series){
        if(series == 1){
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
            cardList.add(new Card("Ace of Clubs", 14, "Clubs"));
            cardList.add(new Card("Two of Clubs", 2, "Clubs"));
            cardList.add(new Card("Three of Clubs", 3, "Clubs"));
            cardList.add(new Card("Four of Clubs", 4, "Clubs"));
            cardList.add(new Card("Five of Clubs", 5, "Clubs"));
            cardList.add(new Card("Six of Clubs", 6, "Clubs"));
            cardList.add(new Card("Seven of Clubs", 7, "Clubs"));
            cardList.add(new Card("Eight of Clubs", 8, "Clubs"));
            cardList.add(new Card("Nine of Clubs", 9, "Clubs"));
            cardList.add(new Card("Ten of Clubs", 10, "Clubs"));
            cardList.add(new Card("Jack of Clubs", 11, "Clubs"));
            cardList.add(new Card("Queen of Clubs", 12, "Clubs"));
            cardList.add(new Card("King of Clubs", 13, "Clubs"));    
        }
        else if(series == 2){
            cardList = new ArrayList<Card>();
            cardList.add(new Card("Ace of Hearts", 14, "Hearts"));
            cardList.add(new Card("Two of Hearts", 2, "Hearts"));
            cardList.add(new Card("Three of Hearts", 3, "Hearts"));
            cardList.add(new Card("Four of Hearts", 4, "Hearts"));
            cardList.add(new Card("Five of Hearts", 5, "Hearts"));
            cardList.add(new Card("Six of Hearts", 6, "Hearts"));
            cardList.add(new Card("Seven of Hearts", 7, "Hearts"));
            cardList.add(new Card("Eight of Hearts", 8, "Hearts"));
            cardList.add(new Card("Nine of Hearts", 9, "Hearts"));
            cardList.add(new Card("Ten of Hearts", 10, "Hearts"));
            cardList.add(new Card("Jack of Hearts", 11, "Hearts"));
            cardList.add(new Card("Queen of Hearts", 12, "Hearts"));
            cardList.add(new Card("King of Hearts", 13, "Hearts"));
            cardList.add(new Card("Ace of Diamonds", 14, "Diamonds"));
            cardList.add(new Card("Two of Diamonds", 2, "Diamonds"));
            cardList.add(new Card("Three of Diamonds", 3, "Diamonds"));
            cardList.add(new Card("Four of Diamonds", 4, "Diamonds"));
            cardList.add(new Card("Five of Diamonds", 5, "Diamonds"));
            cardList.add(new Card("Six of Diamonds", 6, "Diamonds"));
            cardList.add(new Card("Seven of Diamonds", 7, "Diamonds"));
            cardList.add(new Card("Eight of Diamonds", 8, "Diamonds"));
            cardList.add(new Card("Nine of Diamonds", 9, "Diamonds"));
            cardList.add(new Card("Ten of Diamonds", 10, "Diamonds"));
            cardList.add(new Card("Jack of Diamonds", 11, "Diamonds"));
            cardList.add(new Card("Queen of Diamonds", 12, "Diamonds"));
            cardList.add(new Card("King of Diamonds", 13, "Diamonds"));
        }
    }
    public Card getTopCard(){
        return cardList.get(0);
    }
    public ArrayList<Card> getCardList(){
        return cardList;
    }
    public Card getCard(int index){
        return cardList.get(index);
    }
    public void displayDeck(){
        for(int i = 0; i < cardList.size(); i++){
            System.out.println(cardList.get(i).getName());
        }
    }
}
