/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class CreditsView extends JPanel{
    private JLabel editor1;
    private JLabel editor2;
    private JLabel editor3;
    
    CreditsView(){
        
        GridLayout grid = new GridLayout(15,15);
        
        editor1 = new JLabel("Laura Rufo");
        add(editor1);
        editor2 = new JLabel("Dylan Wallach");
        add(editor2);
        editor3 = new JLabel("Stephen Kessler");
        add(editor3);
       
        setLayout(grid);
    }
    public void setOptions(boolean optionsSet, String p1, String p2, Color c, boolean b){
        if(optionsSet == true){
            
            
            setBackground(c);
        }
    }
}
