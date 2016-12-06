/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Dylan
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class MainController {
    private MainView m_view;
    private MainModel m_model;
    private Board board;
    private Deck deck;
    private int turn;
    MainController(MainView m_view, MainModel m_model, Board board){
        this.m_view = m_view;
        this.m_model = m_model;
        this.board = board;
        board.shuffle();
        turn = 0;
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();

                if(clickSource == m_view.getNextTurnButton()){
                    if((turn < 30) && !(board.decksEmpty())){
                        turn++;
                        board.putInPlay();
                        System.out.println("In play 1:"+board.getInPlay1().getName());
                        System.out.println("In play 2:"+board.getInPlay2().getName());
                        String cardName = board.getInPlay1().getName();
                        ImageIcon cardImage;
                        switch (cardName){
                            //Ace
                            case "Ace of Spades":
                                m_model.setCardName1("Ace of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/AceSpades.png"));
                                break;
                            case "Ace of Clubs":
                                m_model.setCardName1("Ace of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/AceClubs.png"));
                                break;
                            case "Ace of Diamonds":
                                m_model.setCardName1("Ace of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/Ace of Diamonds.png"));
                                break;
                            case "Ace of Hearts":
                                m_model.setCardName1("Ace of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/Ace of Hearts.png"));
                                break;
                            //2    
                            case "Two of Spades":
                                m_model.setCardName1("Ace of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/2Spades.png"));
                                break;
                            case "Two of Clubs":
                                m_model.setCardName1("Two of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/2Clubs.png"));
                                break;
                            case "Two of Diamonds":
                                m_model.setCardName1("Two of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/2 of Diamonds.png"));
                                break;
                            case "Two of Hearts":
                                m_model.setCardName1("Two of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/2 of Hearts.png"));
                                break;
                            //3
                            case "Three of Spades":
                                m_model.setCardName1("Three of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/3Spades.png"));
                                break;
                            case "Three of Clubs":
                                m_model.setCardName1("Three of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/3Clubs.png"));
                                break;
                            case "Three of Diamonds":
                                m_model.setCardName1("Three of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/3 of Diamonds.png"));
                                break;
                            case "Three of Hearts":
                                m_model.setCardName1("Three of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/3 of Hearts.png"));
                                break;
                            //4
                            case "Four of Spades":
                                m_model.setCardName1("Four of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/4Spades.png"));
                                break;
                            case "Four of Clubs":
                                m_model.setCardName1("Four of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/4Clubs.png"));
                                break;
                            case "Four of Diamonds":
                                m_model.setCardName1("Four of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/4 of Diamonds.png"));
                                break;
                            case "Four of Hearts":
                                m_model.setCardName1("Four of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/4 of Hearts.png"));
                                break;
                            //5
                            case "Five of Spades":
                                m_model.setCardName1("Five of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/5Spades.png"));
                                break;
                            case "Five of Clubs":
                                m_model.setCardName1("Five of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/5Clubs.png"));
                                break;
                            case "Five of Diamonds":
                                m_model.setCardName1("Five of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/5 of Diamonds.png"));
                                break;
                            case "Five of Hearts":
                                m_model.setCardName1("Five of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/5 of Hearts.png"));
                                break;
                            //6
                            case "Six of Spades":
                                m_model.setCardName1("Six of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/6Spades.png"));
                                break;
                            case "Six of Clubs":
                                m_model.setCardName1("Six of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/6Clubs.png"));
                                break;
                            case "Six of Diamonds":
                                m_model.setCardName1("Six of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/6 of Diamonds.png"));
                                break;
                            case "Six of Hearts":
                                m_model.setCardName1("Six of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/6 of Hearts.png"));
                                break;
                            //7
                            case "Seven of Spades":
                                m_model.setCardName1("Seven of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/7Spades.png"));
                                break;
                            case "Seven of Clubs":
                                m_model.setCardName1("Seven of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/7Clubs.png"));
                                break;
                            case "Seven of Diamonds":
                                m_model.setCardName1("Seven of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/7 of Diamonds.png"));
                                break;
                            case "Seven of Hearts":
                                m_model.setCardName1("Seven of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/7 of Hearts.png"));
                                break;
                            //8
                            case "Eight of Spades":
                                m_model.setCardName1("Eight of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/8Spades.png"));
                                break;
                            case "Eight of Clubs":
                                m_model.setCardName1("Eight of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/8Clubs.png"));
                                break;
                            case "Eight of Diamonds":
                                m_model.setCardName1("Eight of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/8 of Diamonds.png"));
                                break;
                            case "Eight of Hearts":
                                m_model.setCardName1("Eight of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/8 of Hearts.png"));
                                break;
                            //9
                            case "Nine of Spades":
                                m_model.setCardName1("Nine of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/9Spades.png"));
                                break;
                            case "Nine of Clubs":
                                m_model.setCardName1("Nine of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/9Clubs.png"));
                                break;
                            case "Nine of Diamonds":
                                m_model.setCardName1("Nine of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/9 of Diamonds.png"));
                                break;
                            case "Nine of Hearts":
                                m_model.setCardName1("Nine of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/9 of Hearts.png"));
                                break;
                            //10
                            case "Ten of Spades":
                                m_model.setCardName1("Ten of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/10Spades.png"));
                                break;
                            case "Ten of Clubs":
                                m_model.setCardName1("Ten of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/10Clubs.png"));
                                break;
                            case "Ten of Diamonds":
                                m_model.setCardName1("Ten of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/10 of Diamonds.png"));
                                break;
                            case "Ten of Hearts":
                                m_model.setCardName1("Ten of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/10 of Hearts.png"));
                                break;
                            //Jack
                            case "Jack of Spades":
                                m_model.setCardName1("Jack of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/JackSpades.png"));
                                break;
                            case "Jack of Clubs":
                                m_model.setCardName1("Jack of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/JackClubs.png"));
                                break;
                            case "Jack of Diamonds":
                                m_model.setCardName1("Jack of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/Jack of Diamonds.png"));
                                break;
                            case "Jack of Hearts":
                                m_model.setCardName1("Jack of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/Jack of Hearts.png"));
                                break;
                            //Queen
                            case "Queen of Spades":
                                m_model.setCardName1("Queen of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/QueenSpades.png"));
                                break;
                            case "Queen of Clubs":
                                m_model.setCardName1("Queen of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/QueenClubs.png"));
                                break;
                            case "Queen of Diamonds":
                                m_model.setCardName1("Queen of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/Queen of Diamonds.png"));
                                break;
                            case "Queen of Hearts":
                                m_model.setCardName1("Queen of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/Queen of Hearts.png"));
                                break;
                            //King
                            case "King of Spades":
                                m_model.setCardName1("King of Spades");
                                m_model.setCardImage1(new ImageIcon("src/images/KingSpades.png"));
                                break;
                            case "King of Clubs":
                                m_model.setCardName1("King of Clubs");
                                m_model.setCardImage1(new ImageIcon("src/images/KingClubs.png"));
                                break;
                            case "King of Diamonds":
                                m_model.setCardName1("King of Diamonds");
                                m_model.setCardImage1(new ImageIcon("src/images/King of Diamonds.png"));
                                break;
                            case "King of Hearts":
                                m_model.setCardName1("King of Hearts");
                                m_model.setCardImage1(new ImageIcon("src/images/King of Hearts.png"));
                                break;
                            default:
                                m_model.setCardName1("Card in Play");
                                m_model.setCardImage1(new ImageIcon("src/images/cardBack.png"));
                                break;
                        }
                        String cardName1 = board.getInPlay2().getName();
                        switch (cardName1){
                            //Ace
                            case "Ace of Spades":
                                m_model.setCardName2("Ace of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/AceSpades.png"));
                                break;
                            case "Ace of Clubs":
                                m_model.setCardName2("Ace of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/AceClubs.png"));
                                break;
                            case "Ace of Diamonds":
                                m_model.setCardName2("Ace of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/Ace of Diamonds.png"));
                                break;
                            case "Ace of Hearts":
                                m_model.setCardName2("Ace of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/Ace of Hearts.png"));
                                break;
                            //Two
                            case "Two of Spades":
                                m_model.setCardName2("Two of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/2Spades.png"));
                                break;
                            case "Two of Clubs":
                                m_model.setCardName2("Two of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/2Clubs.png"));
                                break;
                            case "Two of Diamonds":
                                m_model.setCardName2("Two of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/2 of Diamonds.png"));
                                break;
                            case "Two of Hearts":
                                m_model.setCardName2("Two of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/2 of Hearts.png"));
                                break;
                            //3
                            case "Three of Spades":
                                m_model.setCardName2("Three of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/3Spades.png"));
                                break;
                            case "Three of Clubs":
                                m_model.setCardName2("Three of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/3Clubs.png"));
                                break;
                            case "Three of Diamonds":
                                m_model.setCardName2("Three of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/3 of Diamonds.png"));
                                break;
                            case "Three of Hearts":
                                m_model.setCardName2("Three of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/3 of Hearts.png"));
                                break;
                            //4
                            case "Four of Spades":
                                m_model.setCardName2("Four of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/4Spades.png"));
                                break;
                            case "Four of Clubs":
                                m_model.setCardName2("Four of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/4Clubs.png"));
                                break;
                            case "Four of Diamonds":
                                m_model.setCardName2("Three of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/4 of Diamonds.png"));
                                break;
                            case "Four of Hearts":
                                m_model.setCardName2("Four of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/4 of Hearts.png"));
                                break;
                            //5
                            case "Five of Spades":
                                m_model.setCardName2("Five of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/5Spades.png"));
                                break;
                            case "Five of Clubs":
                                m_model.setCardName2("Five of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/5Clubs.png"));
                                break;
                            case "Five of Diamonds":
                                m_model.setCardName2("Five of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/5 of Diamonds.png"));
                                break;
                            case "Five of Hearts":
                                m_model.setCardName2("Five of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/5 of Hearts.png"));
                                break;
                            //6
                            case "Six of Spades":
                                m_model.setCardName2("Six of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/6Spades.png"));
                                break;
                            case "Six of Clubs":
                                m_model.setCardName2("Six of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/6Clubs.png"));
                                break;
                            case "Six of Diamonds":
                                m_model.setCardName2("Six of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/6 of Diamonds.png"));
                                break;
                            case "Six of Hearts":
                                m_model.setCardName2("Six of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/6 of Hearts.png"));
                                break;
                            //7
                            case "Seven of Spades":
                                m_model.setCardName2("Seven of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/7Spades.png"));
                                break;
                            case "Seven of Clubs":
                                m_model.setCardName2("Seven of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/7Clubs.png"));
                                break;
                            case "Seven of Diamonds":
                                m_model.setCardName2("Seven of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/7 of Diamonds.png"));
                                break;
                            case "Seven of Hearts":
                                m_model.setCardName2("Seven of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/7 of Hearts.png"));
                                break;
                            //8
                            case "Eight of Spades":
                                m_model.setCardName2("Eight of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/8Spades.png"));
                                break;
                            case "Eight of Clubs":
                                m_model.setCardName2("Eight of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/8Clubs.png"));
                                break;
                            case "Eight of Diamonds":
                                m_model.setCardName2("Eight of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/8 of Diamonds.png"));
                                break;
                            case "Eight of Hearts":
                                m_model.setCardName2("Eight of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/8 of Hearts.png"));
                                break;
                            //9
                            case "Nine of Spades":
                                m_model.setCardName2("Nine of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/9Spades.png"));
                                break;
                            case "Nine of Clubs":
                                m_model.setCardName2("Nine of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/9Clubs.png"));
                                break;
                            case "Nine of Diamonds":
                                m_model.setCardName2("Nine of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/9 of Diamonds.png"));
                                break;
                            case "Nine of Hearts":
                                m_model.setCardName2("Nine of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/9 of Hearts.png"));
                                break;
                            //10
                            case "Ten of Spades":
                                m_model.setCardName2("Ten of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/10Spades.png"));
                                break;
                            case "Ten of Clubs":
                                m_model.setCardName2("Ten of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/10Clubs.png"));
                                break;
                            case "Ten of Diamonds":
                                m_model.setCardName2("Ten of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/10 of Diamonds.png"));
                                break;
                            case "Ten of Hearts":
                                m_model.setCardName2("Ten of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/10 of Hearts.png"));
                                break;
                            //Jack
                            case "Jack of Spades":
                                m_model.setCardName2("Jack of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/JackSpades.png"));
                                break;
                            case "Jack of Clubs":
                                m_model.setCardName2("Jack of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/JackClubs.png"));
                                break;
                            case "Jack of Diamonds":
                                m_model.setCardName2("Jack of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/Jack of Diamonds.png"));
                                break;
                            case "Jack of Hearts":
                                m_model.setCardName2("Jack of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/Jack of Hearts.png"));
                                break;
                            //Queen 
                            case "Queen of Spades":
                                m_model.setCardName2("Queen of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/QueenSpades.png"));
                                break;
                            case "Queen of Clubs":
                                m_model.setCardName2("Queen of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/QueenClubs.png"));
                                break;
                            case "Queen of Diamonds":
                                m_model.setCardName2("Queen of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/Queen of Diamonds.png"));
                                break;
                            case "Queen of Hearts":
                                m_model.setCardName2("Queen of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/Queen of Hearts.png"));
                                break;
                            //King
                            case "King of Spades":
                                m_model.setCardName2("King of Spades");
                                m_model.setCardImage2(new ImageIcon("src/images/KingSpades.png"));
                                break;
                            case "King of Clubs":
                                m_model.setCardName2("King of Clubs");
                                m_model.setCardImage2(new ImageIcon("src/images/KingClubs.png"));
                                break;
                            case "King of Diamonds":
                                m_model.setCardName2("King of Diamonds");
                                m_model.setCardImage2(new ImageIcon("src/images/King of Diamonds.png"));
                                break;
                            case "King of Hearts":
                                m_model.setCardName2("King of Hearts");
                                m_model.setCardImage2(new ImageIcon("src/images/King of Hearts.png"));
                                break;
                            default:
                                m_model.setCardName2("Card in Play");
                                m_model.setCardImage2(new ImageIcon("src/images/cardBack.png"));
                                break;   
                        }
                        m_view.setField(m_model.getCardName1(),m_model.getCardName2(), m_model.getCardImage1(), m_model.getCardImage2());
                        //Show cards in play in the view. Cards can be found at board.getInPlay1() and board.getInPlay2() 
                        
                        board.refill();
                        //Show round winner in view. This can be found at board.roundWinner().
                        //If a war happened, display cards won in war. War can be checked for in board.isWarLastTurn(). The cards won can be returned in an arrayList<Card> from board.getWinPool().
                        board.wipeWinPool();
                    }
                    else{
                        //The game has ended either by turn-timeout or one player has lost all of their cards.
                        //Laura, please at this point display the ending page. This will simply say, "[Player] has won with [P1's Card Total] vs. [P2's Card Total] on turn [ending turn]"
                        //Winning player can be found at board.whoWon(). Deck 1 size can be found at board.deck1.size(). Deck 2 size can be found at board.deck2.size(). Turn is a variable of this class.
                        //If whoWon() returns a 3, there was a tie. Just display "Both players tied with 26 vs. 26 at turn 30."
                        //This is the only way to tie in this game.
                    }
                    
                    
                    
                    
                    
                    
                    
 
//                      
//                        
//                        if(board.whoWon() != 3){
//                            //LAURA: display cards [board.getInPlay1() and board.getInPlay2()]
//                            //LAURA: display winner [board.whoWon()]
//                            //board.replaceCardsNoWar(board.whoWon());
//                        }
//                        //else{
//                            //DYLAN: fill winPool
//                            //DYLAN: pull another card
//                            //LAURA: display new cards in play
//                            //LAURA: display winner
//                            //DYLAN: return pool to winner
//                        //}
//                    //}
//                    //else{
//                        //LAURA: End game
//                    }
                        
                    
                    
                }
                if(clickSource == m_view.getQuitButton()){
                   System.exit(0);
                }
            }
 
        }
        m_view.addButtonListener(new ButtonListener());
        
    }
    
}
