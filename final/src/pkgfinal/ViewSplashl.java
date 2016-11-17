/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sak5657
 */
public class ViewSplashl extends JPanel{
    JButton splashButton;
    JLabel  optionsLabel;
    
    ViewSplashl(){
        
        splashButton = new JButton(new ImageIcon("src/images/war_title.png"));
        add(splashButton);
    
        optionsLabel = new JLabel("WAR by Group 10");
        add(optionsLabel);
  }
}
