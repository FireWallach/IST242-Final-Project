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
 * @author Laura
 */
public class View extends JFrame{
    private Model model;
    private NavViewPanel nVpanel;
    
    
    View(Model model){
        super("WAR");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nVpanel = new NavViewPanel();
        
        add(nVpanel); 
    }
    public void switchToCreditsPanel(CreditsView c_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        nVpanel.removeMain();
        nVpanel.removeCredits();
        nVpanel.addCredits(c_view);
    }
    public void switchToInstructionsPanel(InstructionsView i_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        nVpanel.removeMain();
        nVpanel.removeCredits();
        nVpanel.addInstructions(i_view);
    }
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeInstructions();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.removeMain();
        nVpanel.removeCredits();
        nVpanel.addMain(m_view);        
    }
    
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getOptionsButton().addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.getMenu().getMainButton().addActionListener(al);
    }       
    
    public void addInstructionsButtonListener(ActionListener al)
    {
       nVpanel.getMenu().getInstructionsButton().addActionListener(al);
    }  
    
    public void addCreditsButtonListener(ActionListener al)
    {        
       nVpanel.getMenu().getCreditsButton().addActionListener(al);
    }
    
    //TODO: Add listeners to switch to other Panels
   
    
}
