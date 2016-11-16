/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class MainView extends JPanel{
    MainView()
    {
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
    }
}

