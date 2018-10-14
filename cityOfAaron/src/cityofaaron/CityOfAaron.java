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
 * @author Shawn Curtis
 */
public class CityOfAaron {

   public static void main(String[] args) {
      Player player1 = new Player();
      Game game1 = new Game();
      Location location1 = new Location();
      Location location2 = new Location("test string 2", "peace 2");
      CropData cropDataTest = new CropData();
      
      
      player1.setName("Shawn");
      game1.setPlayer(player1);
      
      location1.setDescription("test string");
      location1.setSymbol("peace");
      
      cropDataTest.setYear(2018);
      cropDataTest.setPopulation(672);
      cropDataTest.setAcresOwned(47);
      cropDataTest.setCropYield(1234);
      cropDataTest.setWheatInStore(5432);
      cropDataTest.setNumberWhoDied(0);
      cropDataTest.setNewPeople(8);
      cropDataTest.setHarvest(77);
      cropDataTest.setPeopleFed(680);
      cropDataTest.setAcresPlanted(47);
      cropDataTest.setWheatForPeople(1);
      
      System.out.println(game1.getPlayer().getName() + "\n");
      System.out.println(TeamMembers.withAnH.getTitle() + " " + TeamMembers.withAnH.getName() + "\n" + TeamMembers.withAnE.getTitle() + " " + TeamMembers.withAnE.getName() + "\n" + TeamMembers.withAT.getTitle() + " " + TeamMembers.withAT.getName());
      System.out.println("\n"+ location1.getDescription() + " " + location1.getSymbol());
      System.out.println("\n"+ location2.getDescription() + " " + location2.getSymbol());
      
      System.out.println("\n\n\n\n\n" + cropDataTest.getYear() + ", ");
      System.out.println(cropDataTest.getPopulation() + ", ");
      System.out.println(cropDataTest.getAcresOwned() + ", ");
      System.out.println(cropDataTest.getCropYield() + ", ");
      System.out.println(cropDataTest.getWheatInStore() + ", ");
      System.out.println(cropDataTest.getNumberWhoDied() + ", ");
      System.out.println(cropDataTest.getNewPeople() + ", ");
      System.out.println(cropDataTest.getHarvest() + ", ");
      System.out.println(cropDataTest.getPeopleFed() + ", ");
      System.out.println(cropDataTest.getAcresPlanted() + ", ");
      System.out.println(cropDataTest.getWheatForPeople());
      
      
   }    
}
