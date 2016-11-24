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
    
    OptionsController(OptionsModel o_model, OptionsView o_view, MainView m_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_view = m_view;
        
        class ButtonListener implements ActionListener{
            @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        
        if((source == o_view.getBGColorButton()) ){ 
            o_view.incrementIndex();
        }
        else if(source == o_view.getRetButton()){
            o_model.setPlayerName1(o_view.getPlayerName1Text());
            o_model.setPlayerName2(o_view.getPlayerName2Text());
            o_model.setColor(o_view.getColor());
            o_model.setChanged(true);
        }
    }
 
        }
        o_view.addButtonListener(new ButtonListener());
    }
}
