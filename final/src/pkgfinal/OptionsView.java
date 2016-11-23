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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
        private JTextField playerName1;
        private JTextField playerName2;
        
        private JButton quitButton;
        
        private OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            playerName1 = new JTextField("--Enter Player Name--");
            playerName2 = new JTextField("--Enter Player Name--");
            

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(playerName1);
            add(playerName2);
            
            
            //add(retButton);               
        }

    /**
     * @return the playerName
     */
    public JTextField getPlayerName1() {
        return playerName1;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName1(JTextField playerName1) {
        this.playerName1 = playerName1;
    }

    public JTextField getPlayerName2() {
        return playerName2;
    }
    
    public void setPlayerName2(JTextField playerName2) {
        this.playerName2 = playerName2;
    }
    
    
    
    
}

