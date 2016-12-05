/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Dylan
 */
public class MainModel {
    private String background;
    private String cardName;
   
    MainModel(){
         
    }
    public void setBackgroundName(String background){
        this.background = background;    
    }
    public String getBackgroundName(){
        
        return background;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    
    
}
