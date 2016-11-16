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
public class ViewSplash extends JPanel{
    JButton splashButton;
    JLabel  optionsLabel;
    
    ViewSplash(){
        
        splashButton = new JButton(new ImageIcon(" "));
        add(splashButton);
    
        optionsLabel = new JLabel("None");
        add(optionsLabel);
  }
}
