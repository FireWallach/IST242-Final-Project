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

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class MainView extends JPanel{        
        JLabel MenuLabel;
        
        MainModel m_model;
        OptionsModel o_model;
        
        MainView(MainModel m_model)
        {
            this.m_model = m_model;
                   
            
            MenuLabel = new JLabel("Welcome to the Main Menu!");

            

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(MenuLabel);

            //add(retButton);               
        }
}

