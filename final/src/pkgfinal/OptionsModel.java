/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Laura
 */
public class OptionsModel {
    private String playerName1;
    private String playerName2;
    private String player1;
    private String player2;
    private String background;
    private boolean displayNames;
    
    private boolean hasChanged;
    OptionsModel(){
         hasChanged = false;
    }
    public String getPlayerName1() {
        return playerName1;
    }

    public void setDisplayNames(boolean b){
        this.displayNames = b;
    }
    public boolean getDisplayNames(){
        return this.displayNames;
    }
    public void setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
    }

    public String getPlayerName2() {
        return playerName2;
    }


    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
    }
    
     public void setPlayer1(String player1) {
        this.player1 = player1;
    }
     
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    
    public String getPlayer1(){
        return player1;
    }
    
     public String getPlayer2(){
        return player2;
    }
    
    public boolean getChanged(){
        return hasChanged;
    }
    public void setChanged(boolean h){
        hasChanged = h;
    }
        
    

  
}
