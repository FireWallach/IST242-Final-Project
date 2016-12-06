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
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        view.setVisible(true);
        Board board = new Board();
        board.shuffle();
        while((turns < 30) && !(board.decksEmpty())){
            turns++;
            board.putInPlay();
            board.refill();
        }
                board.printDecks();
        System.out.println("Cards: " + (board.getDeck1().getCardList().size() + board.getDeck2().getCardList().size()));
        System.out.println("Wars: " + board.warCount);
        System.out.println("Player " + board.whoWon() + " won with: " + board.getDeck1().getCardList().size() + " vs. " + board.getDeck2().getCardList().size() + " on turn " + turns);
    }
   // https://commons.wikimedia.org/wiki/Category:Individual_playing_cards
   // http://whisperingimps.com/products/special_edition
}
