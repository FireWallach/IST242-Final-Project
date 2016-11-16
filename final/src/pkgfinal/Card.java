/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author daw5510
 */
public class Card {
    private String name;
    private int value;
    private String suit;
    
    Card(String name, int value, String suit){
        this.name = name;
        this.value = value;
        this.suit = suit;        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getVal(){
        return this.value;
    }
}
