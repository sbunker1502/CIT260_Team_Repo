/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.*;


/**
 *
 * @author Team Awesome
 */
public class CropView {
   // Create a Scanner object
   private static Scanner keyboard = new Scanner(System.in);   
     
   // Get references to the Game object and the CropData object
   static private Game game = CityOfAaron.getGame();
   static private CropData cropData = game.getCropData();

   // The buyLandView method
   // Purpose: interface with the user input for buying land
   // Parameters: none
   // Returns: none
   public static void buyLandView(){
      // Get the cost of land for this round.
      int price = CropControl.calcLandCost();

      // Prompt the user to enter the number of acres to buy
      System.out.format("Land is selling for %d bushels per acre.%n",price);
      int toBuy;
      boolean paramsNotOkay;
      
      do{
         paramsNotOkay = false;
         System.out.print("\nHow many acres of land do you wish to buy? "); 
         //  Get the user’s input and save it.
         toBuy = keyboard.nextInt();
         try{
            // Call the buyLand( ) method in the control layer to buy the land
            CropControl.buyLand(cropData, toBuy, price);
         }
         catch(CropException e)
         {
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println(e.getMessage());
              paramsNotOkay = true;
         }
      }while(paramsNotOkay);

      // output how much land we now own
      System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
   }

// The runCropView method()
// Purpose: runs the methods to manage the crops game
// Parameters: none
// Returns: none
public static void runCropView(){
    // call the buyLandView( ) method
    buyLandView( );

    // add calls to the other crop view methods
    // as they are written
}


   public static void sellLandView(){
       // Get the cost of land for this round.
      int price = CropControl.calcLandCost();

      // Prompt the user to enter the number of acres to buy
      System.out.format("Land is selling for %d bushels per acre.%n",price);
      int toSell;
      boolean paramsNotOkay;
      
      do{
         paramsNotOkay = false;
         System.out.print("\nHow many acres of land do you wish to buy? "); 
         //  Get the user’s input and save it.
         toSell = keyboard.nextInt();
         try{
            // Call the sellLand( ) method in the control layer to buy the land
            CropControl.sellLand(price, toSell, cropData);
         }
         catch(CropException e)
         {
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println(e.getMessage());
              paramsNotOkay = true;
         }
      }while(paramsNotOkay);

      // output how much land we now own
      System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
      /*System.out.println("\n sellLandView");*/
   }
   public static void plantCropsView(){
      // Get the cost of land for this round.
      int acresOwned = CropControl.calcLandCost();
      int population = CropControl.calcLandCost();
      int wheatInStore = CropControl.calcLandCost();
      int canTend = population * 10;
      int canPlant = wheatInStore * 2;
      
      // Prompt the user to enter the number of acres to buy
      System.out.format("You own %d acres of land.%n",acresOwned);
      System.out.format("Your population can tend up to %d acres of crops.%n",canTend);
      System.out.format("You have enough wheat to plant %d acres of crops.%n",canPlant);
      int toPlant;
      boolean paramsNotOkay;
      
      do{
         paramsNotOkay = false;
         System.out.print("\nHow many acres of crops do you wish to plant? "); 
         //  Get the user’s input and save it.
         toPlant = keyboard.nextInt();
         try{
            // Call the buyLand( ) method in the control layer to buy the land
            CropControl.plantCrops(toPlant, acresOwned, population, wheatInStore, cropData);
         }
         catch(CropException e)
         {
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println(e.getMessage());
              paramsNotOkay = true;
         }
      }while(paramsNotOkay);

      // output how much land we now own
      System.out.format("You have planted %d acres of crops. ", cropData.getAcresOwned());
      
   }
   public static void displayCropsReportView(){
      System.out.println("\n displayCropsReportView");
   }
   
   // The feedPeopleView method
   // Purpose: To figure out how much wheat
   // Parameters: none
   // Returns: none
   public static void feedPeopleView() {
      //get amount of wheat in store
      int wheatInStore = cropData.getWheatInStore();
      //display wheat in store to user
      System.out.format("There are %d bushels of wheat in store.%n", wheatInStore);
      int wheatForPeople;
      boolean paramsNotOkay;
      do {
         paramsNotOkay = false;

         //ask user how much wheat to feed the people
         System.out.print("How much wheat would you like to give to the people?");
         
         //get input
         wheatForPeople = keyboard.nextInt(); 
         try {
           /* if (wheatForPeople < 0) {
                throw new CropException("Cannot Feed People Negative Amount of Wheat");
            }

            if (wheatForPeople > wheat) {
                throw new CropException("Cannot Feed People More Wheat than Possessed");
            }*/

            //give to the people
            CropControl.feedPeople(wheatInStore, wheatForPeople, cropData);
         }
         catch (CropException e) {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
            
           /* catch (CropException e) {
              system.out.printLn("Cant Do that");
              system.out.printLn(e.getMessage());
              }
      //return wheatInStore
      return 1;*/
            
         }
      } while (paramsNotOkay);
      // output how much wheat we now own
      System.out.format("You now own %d bushels of wheat. ", cropData.getWheatInStore());
      
   }
   /*

   
      public static void sellLandView() {
        // get cost of land this round
        int price = CropControl.calcLandPrice();
        int toSell = 0;
        // prompt user to enter number of of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        boolean ok = true;
        do {
            try {
                System.out.print("How many acres of land do you wish to sell?");
                toSell = keyboard.nextInt();
                
                if (toSell < 0) {
                    throw new CropException("Cannot Sell Negative Amount of Land");
                }                
                // actually sell the land
                CropControl.sellLand(price, toSell, cropData);
                ok =  false;
            }
            catch (CropException e) {
                System.out.println(e.getMessage());
                ok = true;
            }
        } while (ok);      
        
        // actually sell the land 
   
      }
    */
   

       
}
