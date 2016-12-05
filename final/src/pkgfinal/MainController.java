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
    
    MainController(MainView m_view, MainModel m_model, Board board){
        this.m_view = m_view;
        this.m_model = m_model;
        this.board = board;
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();
                
                
                if(clickSource == m_view.getNextTurnButton()){
                    board.draw();
                    //display card located in board.inPlay 1 or 2
                    //provided war did not occur:
                    //change winner label to board.whoWon()
                    //update card count with board.cardsleft(1 or 2)
                    //provided war did not occur:
                    board.replaceCardsNoWar(board.whoWon());
                    m_model.setCardName("the best card");
                    m_view.setField(m_model.getCardName());
                    
                }
                if(clickSource == m_view.getQuitButton()){
                   System.exit(0);
                }
            }
 
        }
        m_view.addButtonListener(new ButtonListener());
        
    }
    
}
