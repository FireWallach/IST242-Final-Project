/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Dylan
 */
public class MainModel {
    private String background;
    private String cardName1;
    private String cardName2;
    private ImageIcon cardImage1;
    private ImageIcon cardImage2;
    private String winnerName;
    private String warString;
   
    private int deckSize1;
    private int deckSize2;
    MainModel(){
         
    }
    public void setBackgroundName(String background){
        this.background = background;    
    }
    public String getBackgroundName(){
        
        return background;
    }

    public String getCardName1() {
        return cardName1;
    }

    public void setCardName1(String cardName) {
        this.cardName1 = cardName;
    }

    public ImageIcon getCardImage1() {
        return cardImage1;
    }

    public void setCardImage1(ImageIcon cardImage1) {
        this.cardImage1 = cardImage1;
    }

    public ImageIcon getCardImage2() {
        return cardImage2;
    }

    public void setCardImage2(ImageIcon cardImage2) {
        this.cardImage2 = cardImage2;
    }

    public String getCardName2() {
        return cardName2;
    }

    public void setCardName2(String cardName2) {
        this.cardName2 = cardName2;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    public String getWarString() {
        return warString;
    }

    public void setWarString(String warString) {
        this.warString = warString;
    }

   

    public int getDeckSize1() {
        return deckSize1;
    }

    public void setDeckSize1(int deckSize1) {
        this.deckSize1 = deckSize1;
    }

    public int getDeckSize2() {
        return deckSize2;
    }

    public void setDeckSize2(int deckSize2) {
        this.deckSize2 = deckSize2;
    }
    

    

    

    
    
    

    
    
    
}
