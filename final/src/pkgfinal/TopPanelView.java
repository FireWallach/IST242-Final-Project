/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class TopPanelView extends JPanel{
    private JLabel cardLabel;
    private JLabel picture;
    private Deck deck;
    private String cardInfo;
    private MainModel m_model;
    
    TopPanelView(){
        deck = new Deck();
        
        
        cardLabel = new JLabel(":)");
        add(cardLabel);
        picture = new JLabel(new ImageIcon("src/images/7Spades.png"));
        add(picture);
        
    }

    
}
