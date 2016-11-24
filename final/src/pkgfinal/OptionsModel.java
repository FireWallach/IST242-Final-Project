/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;

/**
 *
 * @author Laura
 */
public class OptionsModel {
    private String playerName1;
    private String playerName2;
    private Color currColor;
    private boolean hasChanged;

    
    OptionsModel(){
        hasChanged = false;
    }
    public String getPlayerName1() {
        return playerName1;
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
    
    public void setColor(Color c){
        currColor = c;
    }
    public Color getColor(){
        return currColor;
    }
    public boolean getChanged(){
        return hasChanged;
    }
    public void setChanged(boolean h){
        hasChanged = h;
    }
    
        
    

  
}
