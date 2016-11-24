/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Laura
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class MainView extends JPanel{        
    private JLabel MenuLabel;
    private JButton retButton;
    private MainModel m_model;
    private OptionsModel o_model;
    private OptionsView o_view;
    private JButton nextTurnButton;
    private JButton quitButton;
    private JLabel optionsLabel;
    MainView(MainModel m_model)
    {
        this.m_model = m_model;


        MenuLabel = new JLabel("Welcome to the Main Menu!");
        nextTurnButton = new JButton("Next");
        quitButton = new JButton("Quit");
        optionsLabel = new JLabel("No options selected yet");
        // It may be useful to have a Save & Return button

        retButton = new JButton("Save and Return");

        add(MenuLabel);
        add(nextTurnButton);
        add(quitButton);
        add(optionsLabel);
        add(retButton);               
    }
    public JButton getNextTurnButton() {
        return nextTurnButton;
    }
    public void setOptions(boolean optionsSet, String p1, String p2, Color c){
        if(optionsSet == true){
            optionsLabel.setText("Player 1: " + p1 + " Player 2: " + p2 + " Background Color: " + c.toString());
        }
        else{
            optionsLabel.setText("No options selected yet");
        }
    }

    public void setNextTurnButton(){
        this.nextTurnButton = nextTurnButton;
    }
    public JButton getQuitButton() {
        return quitButton;
    }


    public void setQuitButton(JButton quitButton) {
        this.quitButton = quitButton;
    }

    public void setOptionsLabel(String pName1, String pName2) {
        optionsLabel.setText(o_model.getPlayerName1()+" "+o_model.getPlayerName2());
    }
}

