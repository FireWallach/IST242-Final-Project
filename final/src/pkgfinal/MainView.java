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

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author jrimland-air
 */
public class MainView extends JPanel{        
    private JLabel menuLabel;
    private JButton retButton;
    private MainModel m_model;
    private OptionsModel o_model;
    private OptionsView o_view;
    private JButton nextTurnButton;
    private JButton quitButton;
    private JLabel optionsLabel;
    private Color defaultBackground;
    private JPanel content;
    private JLabel cardImage1;
    private JLabel cardImage2;
    
    private JLabel cardNameLabel;
    MainView(MainModel m_model)
    {
        this.m_model = m_model;
        
        content = new JPanel();
        
        defaultBackground = getBackground();

        setLayout(new BorderLayout());

        menuLabel = new JLabel("Welcome to the Main Menu!");
    
        nextTurnButton = new JButton("Next");
        quitButton = new JButton("Quit");
        optionsLabel = new JLabel("No options selected yet");
        

        
        cardNameLabel = new JLabel("Card");
        content.add(cardNameLabel, BorderLayout.CENTER);
        cardImage1 = new JLabel(new ImageIcon("src/images/CardBack.png"));
        content.add(cardImage1);
        cardImage2 = new JLabel(new ImageIcon("src/images/CardBack.png"));
        content.add(cardImage2);
        add(content);
        add(menuLabel, BorderLayout.NORTH);
        
        add(nextTurnButton, BorderLayout.WEST);
        add(quitButton, BorderLayout.EAST);
        add(optionsLabel, BorderLayout.SOUTH);
         
        
        
    }
    
    public JButton getNextTurnButton() {
        return nextTurnButton;
    }
    
    public void setField(String cardName){
        cardNameLabel.setText(cardName);
    }
    public void setOptions(boolean optionsSet, String p1, String p2, Color c, boolean b){
        if(optionsSet == true){
            String optionsString;
            if(b == true)
                optionsString = "Yes";
            else
                optionsString = "No";
            
            content.setBackground(c);
            setBackground(c);
            if(c.equals(Color.RED)){
                m_model.setBackgroundName("Red");
            }
            else if(c.equals(defaultBackground)){
                m_model.setBackgroundName("Default");
            }
            else if(c.equals(Color.BLUE)){
                m_model.setBackgroundName("Blue");
            }
            else if(c.equals(Color.GREEN)){
                m_model.setBackgroundName("Green");
            }
//            player1 = "Player 1: ";
//            
//            player2 = " Player 2: ";
            
            optionsLabel.setText("Player 1: " + p1 + " Player 2: " + p2 + " Background Color: " +m_model.getBackgroundName() + " Show player names? " + optionsString);
        }
        else{
            optionsLabel.setText("No options selected yet");
        }
    }

    public void setNextTurnButton(JButton nextTurnButton){
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
    public void addButtonListener(ActionListener al){
        nextTurnButton.addActionListener(al);
        quitButton.addActionListener(al);
    }

}

