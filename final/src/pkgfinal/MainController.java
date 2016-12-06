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
                    
                    
                    
                    
                    
                    
                    
                    
//                    if(!board.decksEmpty()){
////                        board.putInPlay();
////                        System.out.println(board.getInPlay1().getName());
////                        if(board.getInPlay1().getName().equals("Ace of Spades")){
////                             m_model.setCardName1("Ace of Spades");
////                             m_model.setCardImage1(new ImageIcon("src/images/AceSpades.png"));
////                        }
////                        if(board.getInPlay2().getName().equals("Ace of Spades")){
////                            m_model.setCardName2("Ace of Spades");
////                            m_model.setCardImage2(new ImageIcon("src/images/AceSpades.png"));
////                        }
////                        if(board.getInPlay2().getName().equals("Ace of Hearts")){
////                            m_model.setCardName2("Ace of Hearts");
////                            m_model.setCardImage2(new ImageIcon("src/images/Ace of Hearts.png"));
////                        }
//
//                        //System.out.println(board.getInPlay2().getName());
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
                        
                    m_model.setCardName1("Card in Play");
                    m_model.setCardName2("Card in Play");
                    m_model.setCardImage1(new ImageIcon("src/images/cardBack.png"));
                    m_model.setCardImage2(new ImageIcon("src/images/cardBack.png"));
                    m_view.setField(m_model.getCardName1(),m_model.getCardName2(), m_model.getCardImage1(), m_model.getCardImage2());
                    
                }
                if(clickSource == m_view.getQuitButton()){
                   System.exit(0);
                }
            }
 
        }
        m_view.addButtonListener(new ButtonListener());
        
    }
    
}
