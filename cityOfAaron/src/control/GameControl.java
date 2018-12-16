// Source code for the GameControl class
// The GameControl class is a member of the controllayer
// Methods in the  GameControl class manage Game objects
// Author: your team name
// Date Last modified: date you wrote this code
// ==============================================================
package control;
import model.*;
import cityofaaron.*;
import exceptions.CropException;
import java.io.*; 
import java.util.*; 
import java.util.Scanner;

public class GameControl {
    
   // size of the Locations array
   private static final int MAX_ROW = 5;
   private static final int MAX_COL = 5;
   // create the game object
   private static Game theGame = new Game();
   
   public static void createNewGame(String _name) {
      // create the game object
      //Game theGame = new Game();

      // create the player object and set the name
      Player thePlayer = new Player();
      thePlayer.setName(_name);
      theGame.setPlayer(thePlayer); 
      
      // create and initialize a CropData object
      // save a reference to it in the Game object
      // method prologue ….  
     
      createCropDataObject();
      createMap();
      
      /*CropData cropData = new CropData(); 

      cropData.setYear(0);
      cropData.setPopulation(100);
      cropData.setNewPeople(5);
      cropData.setCropYield(3);
      cropData.setNumberWhoDied(0);
      cropData.setOffering(10);
      cropData.setWheatInStore(2700);
      cropData.setAcresOwned(1000);
      cropData.setAcresPlanted(1000);
      cropData.setHarvest(3000);
      cropData.setOfferingBushels(300);
      cropData.setAcresPlanted(1000);

      game.setCropData(cropData);
      */
      // when all is done, save a reference to the Game object
      CityOfAaron.setCurrentGame(theGame);
   
   }
   
   public static void createCropDataObject(){
      CropData theCrops = new CropData();
      theCrops.setYear(0);
      theCrops.setPopulation(100);
      theCrops.setNewPeople(5);
      theCrops.setCropYield(3);
      theCrops.setNumberWhoDied(0);
      theCrops.setOffering(10);
      theCrops.setWheatInStore(2700);
      theCrops.setAcresOwned(1000);
      theCrops.setAcresPlanted(1000);
      theCrops.setHarvest(3000);
      theCrops.setOfferingBushels(300);
      theCrops.setAcresPlanted(1000); 
      theGame.setCropData(theCrops);         
   }

   
        //create the Locations and the Map object 
        
        /**
         * The createMap method
         **/
   
   public static void createMap() {
      //create the Map object
      //refer to the Map constructor
      Maps theMap = new Maps(MAX_ROW, MAX_COL); 

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

      //set this location object in each cell of the array in column 4
      for(int i = 0; i < MAX_ROW; i++) {
         theMap.setLocation(i, 2, loc2); 
      }
      // MOUNTAIN

      //define the string for a mountain range
      String mountain = "You are in a mountain range. \n"; 
      // define new Location
      Location loc3 = new Location();
      loc3.setDescription(mountain);
      loc3.setSymbol("^^^");

      // for loop sets 3rd row of map as mountain
      for (int i = 0; i < MAX_ROW; i++) {
         theMap.setLocation(i, 3, loc3);
      }

      // PLAINS 
      //define the string for the plains
      String plains = "You are in the plains. \n"; 
      // define the plains location
      Location loc4 = new Location();
      loc4.setDescription(plains);
      loc4.setSymbol("'''");

      // for loop sets 
      for (int i = 0; i < 5; i++) {
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

      theGame.setMap(theMap);
      
      // return 
      // return theMap;
      
      // function is void type. return statement can be used only if nothing is returned.
   }
      
   public static void displayMap(){

    //Declare the map array
    //String playerMap[][] = new String[5][5];
    
    //This is the map display and the symbols used
    /*String[][] theMap = {
    {"///","///","^^^","^^^","~~~"},
    {"///","///","^^^","^^^","~~~"},
    {"$$$","$$$","^^^","^^^","~~~"},
    {"$$$","$$$","^^^","^^^","'''"},
    {"$$$","$$$","^^^","^^^","'''"}};*/

    Location[][] theMap = CityOfAaron.getGame().getMap().getLocations();
   
    System.out.println("***   VILLAGE MAP   ***\n"  
        + "     1     2     3     4     5");
    
    //For loops are used to call the array locations in the map
    for(int i = 0; i < theMap.length; i++){
        System.out.println(i + "|");
        for(int j = 0; j < theMap[i].length; j++){
             System.out.println(theMap[i][j].getSymbol() + "|");
        }
   
    System.out.println ("\n");
   }
    
    //This is the legend for the map
    System.out.println( "Key:\n" +
        "/// - farmland\n" +
        "^^^ - mountain\n" +
        "~~~ - river\n" +
        "$$$ - trading post\n" +
        "''' - plains");  
}
   
   
   //create the tools list
   public static void createListTools() {
      ArrayList<ListItem> tools = new ArrayList<>(); 

      tools.add(new ListItem("plow", 8));
      tools.add(new ListItem("shovel", 46));
      tools.add(new ListItem("hammer", 23));

      theGame.setTools(tools);

   }

   // method to display tools list
   public static void showListTools() {
      ArrayList<ListItem> tools = theGame.getTools();
      showList(tools);
   }
        
   
      //create the list of animals
   public static void createAnimalList() {
       ArrayList<ListItem> animals = new ArrayList<>();

       animals.add(new ListItem("cows", 12));
       animals.add(new ListItem("horses", 3));
       animals.add(new ListItem("pigs", 7));
       animals.add(new ListItem("goats", 4)); 

       //save the animals in the game
      theGame.setAnimals(animals);
   }  
   public static void showAnimalList() {
      ArrayList<ListItem> animals = theGame.getAnimals();
      showList(animals);
   }
   public static void saveAnimalList() {
      ArrayList<ListItem> animals = theGame.getAnimals();
      showList(animals);
   }
   //method to save the animals list to disk 
  /*        public static void saveAnimalList() {
       Scanner keyboard = new Scanner(System.in);
       //receive a string of the file name, passed into the printing routine.
       String listPath;
       System.out.println("Please enter a file path for the animals list: ");
       listPath = keyboard.next();


       //declare a reference to a PrintWriter object
     try (PrintWriter out = new PrintWriter(listPath);) {
           //create the PrintWriter object

           //get a reference to the ArrayList
           ArrayList<ListItem> animals = Game.getAnimals();

           //output a heading for the report
           out.println("\n\n Animals List      "); 
           //use a for loop to get the data from the ArrayList
           for (ListItem item : animals) {
           out.printf("%n%-20s%7d", item.getName()
                                        , item.getNumber());

           }
   }
  
   // method to display animals list
   public static void showAnimalsList() {
       System.out.println("showAnimalsList Method Called");
      /* ArrayList<ListItem> animals = Game.getAnimals();

       for (ListItem item : animals) {
           System.out.println("Loop");
           System.out.println(item.getName() + ": " + item.getNumber());
       }
   } */
   
   public static void createProvisionsList(){
      ArrayList<ListItem> provisions = new ArrayList<>();

      provisions.add(new ListItem("meals", 21));
      provisions.add(new ListItem("windex", 75));
      provisions.add(new ListItem("paper towels", 61));
      provisions.add(new ListItem("grocery bags", 123));

      theGame.setProvisions(provisions);
   }

   // method to display tools list
   public static void outputProvisionsList() {
      ArrayList<ListItem> provisions = theGame.getProvisions();
      showList(provisions);
   }
   
   // method to display tools list
   public static void outputList(int listType, int mode)throws IOException{
      if(mode != 1 && mode != 2){
         throw new IOException("Only 1 and 2 are valid inputs.");
      }
      
      // get the arrayList to outputfrom listType, then choose an action based on mode.
      if(listType == 3){
         GameControl.createProvisionsList();
         ArrayList<ListItem> listToOutput = theGame.getProvisions();
         String listTypeToOutput = "provisionsList";
         if(mode == 1){
            showList(listToOutput);
         }
         else{
            saveList(listToOutput, listTypeToOutput);
         }
      }else
      if(listType == 2){
         GameControl.createAnimalList();
         ArrayList<ListItem> listToOutput = theGame.getAnimals();
         String listTypeToOutput = "animalsList";
         if(mode == 1){
            showList(listToOutput);
         }
         else{
            saveList(listToOutput, listTypeToOutput);
         }
      }
      else{
         GameControl.createListTools();
         ArrayList<ListItem> listToOutput = theGame.getTools();
         String listTypeToOutput = "toolsList";
         if(mode == 1){
            showList(listToOutput);
         }
         else{
            saveList(listToOutput, listTypeToOutput);
         }
      } 
   }
   
   //Single function to display lists for all week 12 individual assignments. sc
   public static void showList(ArrayList<ListItem> misterList) {
      for (ListItem num : misterList) { 		      
           System.out.println(num.toString()); 		
      }
   }
   
   //Single function to display lists for all week 12 individual assignments. sc
   public static void saveList(ArrayList<ListItem> misterList, String listTypeToOutput) {
      String fileName = listTypeToOutput + ".txt";
      try(PrintWriter out = new PrintWriter(fileName)){
         for (ListItem num : misterList) { 		      
            out.println(num.toString()); 		
         }
      }
      catch(IOException e){
         System.out.println("File Error.");
      }

   }
   
      // the getSavedGame method
   // Purpose: load a saved game from disk
   // Parameters: the file path
   // Returns: none
   // Side Effect: the game reference in the driver is updated
   public static void getSavedGame(String filePath)
   {
      Game theGame = null;

      try (FileInputStream fips = new FileInputStream(filePath)){
         ObjectInputStream input = new ObjectInputStream(fips);
         theGame = (Game)input.readObject();
         CityOfAaron.setCurrentGame(theGame);
      }
      catch(Exception e){
         System.out.println("\nThere was an error reading the saved game file");
      }
   }
   
   // the saveGame method
   // Purpose: save a game to disk
   // Parameters: the file path
   // Returns: none
   // Side Effect: the game reference in the driver is updated
   public static void saveGame(String filePath)
   {
      Game theGame = null;

      try (FileOutputStream fips = new FileOutputStream(filePath)){
         ObjectOutputStream output = new ObjectOutputStream(fips);
         output.writeObject(theGame);
         //theGame = (Game)input.readObject();
         //CityOfAaron.setCurrentGame(theGame);
      }
      catch(Exception e){
         System.out.println("\nThere was an error saving game file");
      }
   }
   
   /*public void printToolsReport() {
        // Receive a string of the file name, passed into the printing routine.
            System.out.println("Enter a filename to save the list.");
            Scanner keyboard = new Scanner(System.in);
            String fileLocation = keyboard.next();
        // declare a reference to a PrintWriterobject
        try (PrintWriter out = new PrintWriter(fileLocation))
        {
        // create the PrintWriterobject
        // get a reference to the ArrayListyou want to output
            ArrayList<ListItem> tools = theGame.tools();
        
        // output a heading for the report
            out.println("\n\n      Tools Report              ");
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
        
                // use a for loop to get the data from the ArrayList
                tools.forEach((item) -> {
                    out.printf("%n%-20s%7d", item.getName(), item.getNumber());
                });
                
        // and output it
        
            System.out.println("The file was sucessfully saved.");
            
            out.flush();
        }
        catch(Exception e)
        {
        // output error message
            System.out.println("Error saving tools to file!");
            System.out.println("I/O Error:" + e.getMessage());
        }
    }*/
   
   
    //cataclysmic event stuff
    public static void cataclysmicEvent(){
        //random number generator
        Random random = new Random();
        CropData theCrops = new CropData();
        int eventRoll = random.nextInt(1) + 20;
        int eventSeverity = random.nextInt(1) + 20;
        
        if(eventRoll == 20){
            //event's happening
            //roll again to see what's affected
            eventRoll = random.nextInt(1) + 20;
            switch (eventRoll){
                case 1:
                   //nothing 0
                   break;
                case 2:
                   // everything will be affected. check the event severity
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setPopulation(1);
                            theCrops.setWheatInStore(1);
                            theCrops.setAcresOwned(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setPopulation(theCrops.getPopulation() * (1-(eventSeverity * 3)/100));
                            theCrops.setWheatInStore(theCrops.getWheatInStore() * (1-(eventSeverity * 3)/100));
                            theCrops.setAcresOwned(theCrops.getAcresOwned() * (1-(eventSeverity * 3)/100));                
                            break;
                    }
                   break;
                case 3:
                case 4:
                   //people and wheat 
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setPopulation(1);
                            theCrops.setWheatInStore(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setPopulation(theCrops.getPopulation() * (1-(eventSeverity * 3)/100));
                            theCrops.setWheatInStore(theCrops.getWheatInStore() * (1-(eventSeverity * 3)/100));               
                            break;
                    }
                   break;
                case 5:
                case 6:
                    //people and land 
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setPopulation(1);
                            theCrops.setAcresOwned(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setPopulation(theCrops.getPopulation() * (1-(eventSeverity * 3)/100));
                            theCrops.setAcresOwned(theCrops.getAcresOwned() * (1-(eventSeverity * 3)/100));                
                            break;
                    }
                    break;
                case 7:
                case 8:
                   //land and wheat 
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setWheatInStore(1);
                            theCrops.setAcresOwned(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setWheatInStore(theCrops.getWheatInStore() * (1-(eventSeverity * 3)/100));
                            theCrops.setAcresOwned(theCrops.getAcresOwned() * (1-(eventSeverity * 3)/100));                
                            break;
                    }
                   break;
                case 9:
                case 10:
                case 11:
                case 12:
                   //people
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setPopulation(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setPopulation(theCrops.getPopulation() * (1-(eventSeverity * 3)/100));               
                            break;
                    }
                   break;
                case 13:
                case 14:
                case 15:
                case 16:
                   //wheat 
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setWheatInStore(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setWheatInStore(theCrops.getWheatInStore() * (1-(eventSeverity * 3)/100));               
                            break;
                    }
                   break;
                case 17:
                case 18:
                case 19:
                case 20:
                   //land 
                    switch(eventSeverity){
                        case 1:
                            // lose nothing
                            break;
                        case 20:
                            // lose all but 1
                            theCrops.setAcresOwned(1);
                            break;
                        default:
                            //lose a percentage == eventSeverity * 3
                            theCrops.setAcresOwned(theCrops.getAcresOwned() * (1-(eventSeverity * 3)/100));                
                            break;
                    }
                   break;
            }
        }
    }
}