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


public class MainView extends JPanel{        
    private JLabel menuLabel;
    
    private MainModel m_model;
    private OptionsModel o_model;
    private OptionsView o_view;
    private JButton nextTurnButton;
    private JButton quitButton;
    private JLabel optionsLabel;
    private Color defaultBackground;
    private JPanel content;
    private JLabel player1CardImage;
    private ImageIcon card2;
   
    private ImageIcon card1;
    private JLabel player2CardImage;
    private JLabel cardNameLabel1;
    private JLabel cardNameLabel2;
    private JLabel roundWinner;
    private JLabel warLabel;

    
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
        
        //content panel
        cardNameLabel1 = new JLabel();
        card1 = new ImageIcon("src/images/cardBack.png");
        cardNameLabel2 = new JLabel();
        player1CardImage = new JLabel(getCard1());
        card2= new ImageIcon("src/images/cardBack.png");
        player2CardImage = new JLabel(getCard2());
        roundWinner = new JLabel();
        warLabel = new JLabel();
       
        content.add(cardNameLabel1);
        content.add(player1CardImage);
        content.add(player2CardImage);
        content.add(cardNameLabel2);
        
        content.add(roundWinner);
    
        content.add(warLabel);

        add(content);
        add(menuLabel, BorderLayout.NORTH);
        
        add(nextTurnButton, BorderLayout.WEST);
        add(quitButton, BorderLayout.EAST);
        add(optionsLabel, BorderLayout.SOUTH);
         
        
        
    }
    
    public JButton getNextTurnButton() {
        return nextTurnButton;
    }
    
    public void setField(String cardName1,String cardName2, ImageIcon image1, ImageIcon image2, String winner, String war){
        cardNameLabel1.setText(cardName1);
        cardNameLabel2.setText(cardName2);
        player1CardImage.setIcon(image1);
        player2CardImage.setIcon(image2);
        roundWinner.setText(winner);
        warLabel.setText(war);
    }
    public void setOptions(boolean optionsSet, String p1, String p2, Color c, boolean b){
        if(optionsSet == true){
            String optionsString;
            if(b == true)
                optionsString = "Yes";
            else
                optionsString = "No";
            
            getContent().setBackground(c);
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

    public ImageIcon getCard1() {
        return card1;
    }

    public void setCard1(ImageIcon card1) {
        this.card1 = card1;
    }

    public ImageIcon getCard2() {
        
        return card2;
    }

    public void setCard2(ImageIcon card2) {
        this.card2 = card2;
        
    }

    public JLabel getRoundWinner() {
        return roundWinner;
    }

    public void setRoundWinner(JLabel roundWinner) {
        this.roundWinner = roundWinner;
    }

    public JLabel getWarLabel() {
        return warLabel;
    }

    public void setWarLabel(JLabel warLabel) {
        this.warLabel = warLabel;
    }

    public JPanel getContent() {
        return content;
    }

    public void setContent(JPanel content) {
        this.content = content;
    }
}

