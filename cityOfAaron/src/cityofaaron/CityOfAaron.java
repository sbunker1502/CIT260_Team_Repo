/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 */
package cityofaaron;
import model.*;
import view.*;
import java.util.Scanner;
/**
 *
 * @author Team Awesome
 */

public class CityOfAaron {
   // variable for keeping a reference to the Game object
   private static Game theGame = null;
   public static Game getGame() {
        return theGame;
    }
    public static void setGame(Game game1) {
        theGame = game1;
    }


   public static void main(String[] args) {
      MainMenuView mmv = new MainMenuView();
      mmv.displayMenu();
   }    
}
