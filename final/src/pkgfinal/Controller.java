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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Controller {
    
    private Model model;
    private View view;
    
    //Instance Variables for Options Model, View, and Controller
    private OptionsModel o_model;
    private OptionsView o_view;
    private OptionsController o_Controller;  
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    private MainModel m_model;
    private MainView m_view;
    private MainController m_controller;
  
    private InstructionsView i_view;
    
    private CreditsView c_view;
    
    
    public Controller(Model model, View view ) {
        this.model = model;
        this.view = view;
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view, m_view); 
        
        m_model = new MainModel();
        m_view = new MainView(m_model);
        m_controller = new MainController(m_view, m_model);
        
        
        i_view = new InstructionsView();
        
        c_view = new CreditsView();
        
        view.addCreditsButtonListener(new CreditsButtonListener());
        view.addInstructionsButtonListener(new InstructionsButtonListener());
        view.addOptionsButtonListener(new OptionsButtonListener());
        view.addMainButtonListener(new MainButtonListener());        
        
    }
    
    
    class CreditsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.switchToCreditsPanel(c_view);
            c_view.setOptions(o_model.getChanged(),o_model.getPlayerName1(), o_model.getPlayerName2(), o_view.getBackground(), o_model.getDisplayNames());
        }
    }
    class InstructionsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.switchToInstructionsPanel(i_view);
            i_view.setOptions(o_model.getChanged(),o_model.getPlayerName1(), o_model.getPlayerName2(), o_view.getBackground(), o_model.getDisplayNames());
        }
    }
    
    class OptionsButtonListener implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
                view.switchToOptionsPanel(o_view);        
        }
    }     
 
    class MainButtonListener implements ActionListener {  
        @Override
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            m_view.setOptions(o_model.getChanged(),o_model.getPlayerName1(), o_model.getPlayerName2(), o_view.getBackground(), o_model.getDisplayNames());
            view.switchToMainPanel(m_view);
            
        }
    }         
    
    
   
    //TODO: Add listeners on buttons to switch to other Panels
    
}


         
    
