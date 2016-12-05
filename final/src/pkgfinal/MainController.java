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
    
    MainController(MainView m_view, MainModel m_model){
        this.m_view = m_view;
        this.m_model = m_model;
        
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();
                
                
                if(clickSource == m_view.getNextTurnButton()){
                    
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
