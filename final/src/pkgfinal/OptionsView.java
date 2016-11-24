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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
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
    private JLabel BGCLabel;
    private JButton BGColorButton;
    int index;                                                                  //Controls Background Color Button's looping           
    private Color[] colors;                                                             //Stores possible background colors
    String[] names;
    private OptionsModel o_model;
    private JButton retButton;
    private JLabel optionsLabel;
    OptionsView(OptionsModel o_model)
    {
        this.o_model = o_model;
        BGCLabel = new JLabel("Background Color:");
        BGColorButton = new JButton("Default");
        GridLayout grid = new GridLayout(10,10);
        playerName1 = new JTextField("--Enter Player Name--");
        playerName2 = new JTextField("--Enter Player Name--");
        optionsLabel = new JLabel("No options Selected Yet");
        index = 5;
        colors = new Color[6];
        colors[0] = Color.BLACK;
        colors[1] = Color.RED;
        colors[2] = Color.YELLOW;
        colors[3] = Color.BLUE;
        colors[4] = Color.GREEN;
        colors[5] = this.getBackground();
        names = new String[6];
        names[0] = "Black";
        names[1] = "Red";
        names[2] = "Yellow";
        names[3] = "Blue";
        names[4] = "Green";
        names[5] = "Default";
        // It may be useful to have a Save & Return button

        retButton = new JButton("Save and Return");

        add(playerName1);
        add(playerName2);
        add(BGCLabel);
        add(BGColorButton);
        add(optionsLabel);
        setLayout(grid);
        add(retButton);
    }
    
    public void addButtonListener(ActionListener al){
        retButton.addActionListener(al);
        BGColorButton.addActionListener(al);
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
    public JButton getBGColorButton(){
        return BGColorButton;
    }
    public void setRetButton(JButton retButton) {
        this.retButton = retButton;
    }
    public String getPlayerName1Text(){
        return playerName1.getText();
    }
    public String getPlayerName2Text(){
        return playerName2.getText();
    }
    public void incrementIndex(){
        if(index == 6)
                index = 0;
            BGColorButton.setText(names[index]);
            index++;
    }
    public Color getColor(){
        return colors[index - 1];
    }
    public JLabel getOptionsLabel() {
        return optionsLabel;
    }
    public void setOptionsLabel(String pName1, String pName2) {
        
        optionsLabel.setText(o_model.getPlayerName1()+" "+o_model.getPlayerName2());
    }  
    
    
    
}

