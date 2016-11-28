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
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
    private JTextField playerName1;
    private JTextField playerName2;
    
    private JButton quitButton;
    private JButton redButton;
    private JButton defaultButton;
    private JButton greenButton;
    private JButton blueButton;
    private String background;
    private OptionsModel o_model;
    private JButton retButton;
    private JLabel optionsLabel;
    private JLabel rButtonLabel;
    private JRadioButton yesButton;
    private JRadioButton noButton;
    private ButtonGroup group;
    OptionsView(OptionsModel o_model)
    {
        this.o_model = o_model;
        optionsLabel = new JLabel("Choose Background Color:");
        add(optionsLabel);
        GridLayout grid = new GridLayout(11,11);
        playerName1 = new JTextField("--Enter Player Name--");
        playerName2 = new JTextField("--Enter Player Name--");
        yesButton = new JRadioButton("Yes");
        noButton = new JRadioButton("No");
        group = new ButtonGroup();
        group.add(yesButton);
        group.add(noButton);
        rButtonLabel = new JLabel("Show player names?");
        
        
        
        defaultButton = new JButton("Default");
        add(defaultButton);
        redButton = new JButton("Red");
        add(redButton);
        greenButton = new JButton("Green");
        add(greenButton);
        blueButton = new JButton("Blue");
        add(blueButton);
        // It may be useful to have a Save & Return button

        retButton = new JButton("Save and Return");

        add(playerName1);
        add(playerName2);
        add(rButtonLabel);
        add(yesButton);
        add(noButton);
        add(retButton);
        
        setLayout(grid);
    }
    
    public void addButtonListener(ActionListener al){
        retButton.addActionListener(al);
        redButton.addActionListener(al);
        getGreenButton().addActionListener(al);
        getBlueButton().addActionListener(al);
        defaultButton.addActionListener(al);
        
    }
        
    public void setNameField(String pName1, String pName2) {
        pName1 = playerName1.getText();
        pName2 = playerName2.getText();
        o_model.setPlayerName1(pName1);
        o_model.setPlayerName2(pName2);
    }
    
        
    public boolean getShowNames(){
        if(noButton.isSelected()){
            return false;
        }
        else
            return true;             
    }
    public JRadioButton getYesButton(){
        return yesButton;
    }
    public JRadioButton getNoButton(){
        return noButton;
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
        
        optionsLabel.setText(o_model.getPlayerName1()+" "+o_model.getPlayerName2()+" ");
    }

    public JButton getRedButton() {
        return redButton;
    }

    public void setRedButton(JButton redButton) {
        this.redButton = redButton;
    }

    public JButton getDefaultButton() {
        return defaultButton;
    }

    public void setDefaultButton(JButton defaultButton) {
        this.defaultButton = defaultButton;
    }

    public JButton getGreenButton() {
        return greenButton;
    }

    public void setGreenButton(JButton greenButton) {
        this.greenButton = greenButton;
    }

    public JButton getBlueButton() {
        return blueButton;
    }

    public void setBlueButton(JButton blueButton) {
        this.blueButton = blueButton;
    }

    
    
    
    
}

