/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author daw5510
 */
public class ButtonPanel extends JPanel{
    JButton mainButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;  
    public ButtonPanel() {
        super();       
        mainButton = new JButton("Main");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
                                  
        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);
    }
}