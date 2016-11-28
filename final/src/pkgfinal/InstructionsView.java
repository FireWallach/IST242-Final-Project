/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class InstructionsView extends JPanel{
    
   
    private JLabel instructions1;
    private JLabel instructions2;
    private JLabel instructions3;
    private JLabel instructions4;
    
    InstructionsView(){
        
        GridLayout grid = new GridLayout(15,15);
        
        instructions1 = new JLabel("Both player will have two decks of cards.");
        add(instructions1);
        
        instructions2 = new JLabel("When a player clicks the next button, a card will draw which can range from 2 to ace.");
        add(instructions2);
        
        instructions3 = new JLabel("Both players will draw cards to see you has a greater card");
        add(instructions3);
        
        instructions4 = new JLabel("If two players have a card with the same value, both will draw a card until there is a card greater than the other card in value");
        add(instructions4);
    }
    public void setOptions(boolean optionsSet, String p1, String p2, Color c, boolean b){
        if(optionsSet == true){
            
            
            setBackground(c);
        }
    }
}

