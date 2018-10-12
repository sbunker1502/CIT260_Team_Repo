/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 */
package cityofaaron;
import model.*;
/**
 *
 * @author seanbunker
 */
public class CityOfAaron {

   public static void main(String[] args) {
      Player player1 = new Player();
      player1.setName("Shawn");
       
      Game game1 = new Game();
      game1.setPlayer(player1);
      System.out.println(game1.getPlayer().getName() + "\n");
      System.out.println(TeamMembers.withAnH.getTitle() + " " + TeamMembers.withAnH.getName() + "\n" + TeamMembers.withAnE.getTitle() + " " + TeamMembers.withAnE.getName() + "\n" + TeamMembers.withAT.getTitle() + " " + TeamMembers.withAT.getName());
   }    
}
