/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;


import javax.swing.*;


/**
 *
 * @author daw5510
 */
public class NavViewBottomMenuPanel extends JPanel{
    private JButton mainButton;
    private JButton optionsButton;
    private JButton instructionsButton;
    private JButton creditsButton;  
    public NavViewBottomMenuPanel() {
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

    public JButton getMainButton() {
        return mainButton;
    }

    public void setMainButton(JButton mainButton) {
        this.mainButton = mainButton;
    }

    public JButton getOptionsButton() {
        return optionsButton;
    }

    public void setOptionsButton(JButton optionsButton) {
        this.optionsButton = optionsButton;
    }

    public JButton getInstructionsButton() {
        return instructionsButton;
    }

    public void setInstructionsButton(JButton instructionsButton) {
        this.instructionsButton = instructionsButton;
    }

    public JButton getCreditsButton() {
        return creditsButton;
    }

    public void setCreditsButton(JButton creditsButton) {
        this.creditsButton = creditsButton;
    }
}
