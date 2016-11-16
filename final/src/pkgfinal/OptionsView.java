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
public class OptionsView extends JPanel{
        JButton retButton;
        JTextField playerName;
        JLabel setBackground;
        JSlider difficulty;
        JButton blueButton;
        JButton greenButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            playerName = new JTextField("--Enter Player Name--");
            setBackground = new JLabel("Choose background color");
            blueButton = new JButton("Blue"); 

            

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(playerName);
            add(setBackground);
            add(blueButton);

            //add(retButton);               
        }
}

