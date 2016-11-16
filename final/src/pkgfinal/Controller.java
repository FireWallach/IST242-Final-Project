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
/**
 *
 *  The Nav Controller handles logic to switch between Views
 * 
 * @author jrimland
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    
    Model model;
    View view;
    
    //Instance Variables for Options Model, View, and Controller
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;  
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;
    
    public Controller(Model model, View view ) {
        this.model = model;
        this.view = view;
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view); 
        
        m_view = new MainView();
                
        view.addOptionsButtonListener(new OptionsButtonListener());
        view.addMainButtonListener(new MainButtonListener());        
        
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            //view.switchToMainPanel(m_view);
        }
    }         
    
    //TODO: Add listeners on buttons to switch to other Panels
    
}

