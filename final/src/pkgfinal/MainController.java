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
    
    MainController(MainView m_view, MainModel m_model, Board board){
        this.m_view = m_view;
        this.m_model = m_model;
        this.board = board;
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();
                
                
                if(clickSource == m_view.getNextTurnButton()){
                    if(!board.decksEmpty()){
//                        board.putInPlay();
//                        System.out.println(board.getInPlay1().getName());
//                        if(board.getInPlay1().getName().equals("Ace of Spades")){
//                             m_model.setCardName1("Ace of Spades");
//                             m_model.setCardImage1(new ImageIcon("src/images/AceSpades.png"));
//                        }
//                        if(board.getInPlay2().getName().equals("Ace of Spades")){
//                            m_model.setCardName2("Ace of Spades");
//                            m_model.setCardImage2(new ImageIcon("src/images/AceSpades.png"));
//                        }
//                        if(board.getInPlay2().getName().equals("Ace of Hearts")){
//                            m_model.setCardName2("Ace of Hearts");
//                            m_model.setCardImage2(new ImageIcon("src/images/Ace of Hearts.png"));
//                        }

                        //System.out.println(board.getInPlay2().getName());
                        
                        if(board.whoWon() != 3){
                            //LAURA: display cards [board.getInPlay1() and board.getInPlay2()]
                            //LAURA: display winner [board.whoWon()]
                            //board.replaceCardsNoWar(board.whoWon());
                        }
                        //else{
                            //DYLAN: fill winPool
                            //DYLAN: pull another card
                            //LAURA: display new cards in play
                            //LAURA: display winner
                            //DYLAN: return pool to winner
                        //}
                    //}
                    //else{
                        //LAURA: End game
                    }
                        
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
