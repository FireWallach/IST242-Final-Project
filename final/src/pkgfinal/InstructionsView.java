/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class InstructionsView extends JPanel{
    
   
    private JLabel Instructions1;
    private JLabel Instructions2;
    private JLabel Instructions3;
    private JLabel Instructions4;
    
    InstructionsView(){
        
        GridLayout grid = new GridLayout(15,15);
        
        Instructions1 = new JLabel("Both player will have two decks of cards.");
        add(Instructions1);
        
        Instructions2 = new JLabel("When a player clicks the next button, a card will draw which can range from 2 to ace.");
        add(Instructions2);
        
        Instructions3 = new JLabel("Both players will draw cards to see you has a greater card");
        add(Instructions3);
        
        Instructions4 = new JLabel("If two players have a card with the same value, both will draw a card until there is a card greater than the other card in value");
        add(Instructions4);
    }
}

