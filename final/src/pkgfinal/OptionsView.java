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

import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
    private String playerName;
    private JButton quitButton;

    private OptionsModel o_model;
    private JButton retButton;
    private JLabel optionsLabel;
    OptionsView(OptionsModel o_model)
    {
        this.o_model = o_model;

        GridLayout grid = new GridLayout(10,10);
        playerName1 = new JTextField("--Enter Player Name--");
        playerName2 = new JTextField("--Enter Player Name--");
        optionsLabel = new JLabel("No options Selected Yet");
       
        // It may be useful to have a Save & Return button

        retButton = new JButton("Save and Return");

        add(playerName1);
        add(playerName2);


        add(retButton);
        add(optionsLabel);
        setLayout(grid);
    }
    
    public void addButtonListener(ActionListener al){
        retButton.addActionListener(al);
        
    }
        
    public void setNameField(String pName1, String pName2) {
        pName1 = playerName1.getText();
        pName2 = playerName2.getText();
        o_model.setPlayerName1(pName1);
        o_model.setPlayerName2(pName2);
    }

    public JButton getRetButton() {
        return retButton;
    }
    public void setRetButton(JButton retButton) {
        this.retButton = retButton;
    }

    public JLabel getOptionsLabel() {
        return optionsLabel;
    }
    public void setOptionsLabel(String pName1, String pName2) {
        
        optionsLabel.setText(o_model.getPlayerName1()+" "+o_model.getPlayerName2());
    }

    
    
    
    
}

