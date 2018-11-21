// Source code for the GameControl class
// The GameControl class is a member of the controllayer
// Methods in the  GameControl class manage Game objects
// Author: your team name
// Date Last modified: date you wrote this code
// ==============================================================
package control;

import model.*;
import cityofaaron.CityOfAaron;

public class GameControl {

   public static void createNewGame(String _name) {
      // create the game object
      Game game = new Game();

      // create the player object and set the name
      Player player = new Player();
      player.setName(_name);

      // save reference to the player object in the game
      game.setPlayer(player);
      // create and initialize a CropData object
      // save a reference to it in the Game object
      CropData cropData = new CropData();

      cropData.setYear(0);
      cropData.setPopulation(100);
      cropData.setNewPeople(5);
      cropData.setCropYield(3);
      cropData.setNumberWhoDied(0);
      cropData.setWheatInStore(2700);
      cropData.setAcresOwned(1000);
      cropData.setAcresPlanted(1000);
      cropData.setHarvest(3000);
      cropData.setAcresPlanted(1000);

      game.setCropData(cropData);

      // when all is done, save a reference to the Game object
      CityOfAaron.setGame(game);
   }

        //create the Locations and the Map object 
        
        /**
         * The createMap method
         **/
   
        public static Map createMap() {
            //create the Map object
            //refer to the Map constructor
            Map theMap = new Map(MAX_ROW, MAX_COL); 
            
            //create a string that will go in the Location objects
            //that contain the river
            String river = "You are on the River. The river is the source\n" +
                           "of life for our city. The river marks the eastern\n" +
                           "boundary of the city - it is wilderness to the East.\n";
            
            Location loc = new Location(); 
            
            //use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
            
            //set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++) {
                theMap.setLocation(i, 4, loc); 
            }
    
            // FARMLAND
            
            //define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
                              "In the spring, this low farmland floods and is covered with rich\n" +
                              "new soil. Wheat is planted as far as you can see.";
            
            //set a farmland location with a hint
            Location loc2 = new Location();
            loc2.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc2.setSymbol("///");
            theMap.setLocation(0, 2, loc2);
            
            // MOUNTAIN
       
            //define the string for a mountain range
            String mountain = "You are in a mountain range. \n"; 
            // define new Location
            Location loc3 = new Location();
            loc3.setDescription(mountain);
            loc3.setSymbol("^^^");
            
            // for loop sets 3rd row of map as mountain
            for (int i = 0; i < 4; i++) {
            theMap.setLocation(1, i, loc3);
            }
            
            // PLAINS 
            //define the string for the plains
            String plains = "You are in the plains. \n"; 
            // define the plains location
            Location loc4 = new Location();
            loc4.setDescription(plains);
            loc4.setSymbol("'''");
            
            // for loop sets 
            for (int i = 2; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    theMap.setLocation(i, j, loc4);                    
                }
            }
          
            // TRADING POST
            
            //define the string for a trading post
            String tradingPost = "Welcome to the trading post. \n";
            Location loc5 = new Location();
            loc5.setDescription(tradingPost);
            loc5.setSymbol("$$$"); 
            theMap.setLocation(4, 4, loc5);
        
            // return 
            return theMap;
        }
}
