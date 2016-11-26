/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Laura
 */
public class OptionsController{
    private OptionsModel o_model;
    private OptionsView o_view;
    private MainView m_view;
    private Color defaultColor;
    
    
    OptionsController(OptionsModel o_model, OptionsView o_view, MainView m_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_view = m_view;
       
        defaultColor = o_view.getBackground();
        
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.getRedButton()){
                    o_view.setBackground(Color.RED);

                }
                if(clickSource == o_view.getDefaultButton()){
                    o_view.setBackground(defaultColor);  
                }
                if(clickSource == o_view.getBlueButton()){
                    o_view.setBackground(Color.BLUE);
                }
                if(clickSource == o_view.getGreenButton()){
                    o_view.setBackground(Color.GREEN);
                }
                if(clickSource == o_view.getRetButton()){
                    o_view.setNameField(o_model.getPlayerName1(), o_model.getPlayerName2());  
                    
                    o_model.setChanged(true);
                    
                }
            }
 
        }
        o_view.addButtonListener(new ButtonListener());
    }
}
