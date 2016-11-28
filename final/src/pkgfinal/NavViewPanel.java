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

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class NavViewPanel extends JPanel{

    NavViewBottomMenuPanel menu;
    ViewSplash splash;
    
    OptionsView o_view;
    MainView m_view;
    InstructionsView i_view;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new ViewSplash();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    
    
    public void addOptions(OptionsView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    } 
    
    public void addInstructions(InstructionsView i_view)
    {        
     this.i_view = i_view;
     add(i_view,BorderLayout.CENTER);
     revalidate();
     repaint();
    }
    
    public void addSplash(View n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeInstructions()
    {
        if(this.i_view != null)
            remove(this.i_view);
    }
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }   

    public void removeSplash()
    {
        remove(splash);
    }
            
}

