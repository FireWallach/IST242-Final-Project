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
 * @author sak5657
 */
public class ViewSplash extends JPanel{
    private JLabel splashLabel;
    private JLabel  optionsLabel;
    
    ViewSplash(){
        
        
        splashLabel = new JLabel(new ImageIcon("src/images/WarSplash.png"));
        add(splashLabel);
    
        optionsLabel = new JLabel("WAR by Group 10");
        add(optionsLabel);
  }
}
