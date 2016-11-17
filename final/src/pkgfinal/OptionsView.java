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
        private JButton retButton;
        private JTextField playerName;
        private JLabel chooseBackground;
        
        private JButton blueButton;
        private JButton greenButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            playerName = new JTextField("--Enter Player Name--");
            chooseBackground = new JLabel("Choose background color");
            blueButton = new JButton("Blue"); 
            greenButton = new JButton("Green");
            

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(playerName);
            add(chooseBackground);
            add(blueButton);
            add(greenButton);
            //add(retButton);               
        }

    /**
     * @return the retButton
     */
    public JButton getRetButton() {
        return retButton;
    }

    /**
     * @param retButton the retButton to set
     */
    public void setRetButton(JButton retButton) {
        this.retButton = retButton;
    }

    /**
     * @return the playerName
     */
    public JTextField getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(JTextField playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the blueButton
     */
    public JButton getBlueButton() {
        return blueButton;
    }

    /**
     * @param blueButton the blueButton to set
     */
    public void setBlueButton(JButton blueButton) {
        this.blueButton = blueButton;
    }

    /**
     * @return the greenButton
     */
    public JButton getGreenButton() {
        return greenButton;
    }

    /**
     * @param greenButton the greenButton to set
     */
    public void setGreenButton(JButton greenButton) {
        this.greenButton = greenButton;
    }
}

