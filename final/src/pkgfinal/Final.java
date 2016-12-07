/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author daw5510
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turns = 0;
        // TODO code application logic here
        
        View view = new View();
        Controller controller = new Controller(view);
        view.setVisible(true);

    }
    
   // Links to where card images came from.
   // https://commons.wikimedia.org/wiki/Category:Individual_playing_cards
   // http://whisperingimps.com/products/special_edition
}
