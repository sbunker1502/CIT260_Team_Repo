/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import control.*;
import cityofaaron.CityOfAaron;

import java.util.Scanner;

public class MainMenuView {
   
   Scanner keyboard = new Scanner(System.in);
   private String theMenu;
   private int max;

   public MainMenuView(){
      // The MainMenuView constructor
      // Purpose: Initialize the menu data
      // Parameters: none
      // Returns: none
      // ===================================

      theMenu =         "\n" +
                        "**********************************\n" +
                        "* CITY OF AARON: MAIN GAME MENU  *\n" +
                        "**********************************\n" +
                        " 1 - Start new game\n" +
                        " 2 - Get and start a saved game\n" +
                        " 3 - Get help on playing the game\n" +
                        " 4 - Save game\n" +
                        " 5 - Quit\n";
      max = 5;
   }
   
   
   
   // The displayMenuView method
   // Purpose: displays the menu, gets the user's input, and does the 
   //               selected action
   // Parameters: none
   // Returns: none
   // =========================================================    
   public void displayMenuView(){
      int menuOption;
      do{
         // Display the menu
         System.out.println(theMenu);

         // Prompt the user and get the user’s input
         menuOption = getMenuOption();

         // Perform the desired action
         doAction(menuOption);

      }while(menuOption != max);
   }


   
   
   
   // The getMenuOption method
   // Purpose: gets the user's input
   // Parameters: none
   // Returns: integer - the option selected
   // ===================================       
   public int getMenuOption(){
      int userInput = 0;
      // begin loop
      do{
         // get user input from the keyboard
         userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
         // loop back to the top of the loop if input was not valid
         if(userInput < 1 || userInput > max){
            System.out.println("Error: you must select 1, 2, 3, 4, or 5");
         }
         // end loop
      } while (userInput < 1 || userInput > max);
      return userInput;
   }

   // The doAction method
   // Purpose: performs the selected action
   // Parameters: none
   // Returns: none
   // ===================================       
   public void doAction(int option)
   {
      switch(option){
         case 1: // create and start a new game
             startNewGame();
             break;
         case 2: // get and start a saved game
             startSavedGame();
             break;
         case 3: // get help menu
             displayHelpMenuView();
             break;
         case 4: // save game
             displaySaveGameView();
             break;
         case 5:
             System.out.println("Thanks for playing ... goodbye.");
      }
      return;
   } 

   public void startNewGame(){
      // Display the Banner Page.
      System.out.println("\nWelcome to the city of Aaron.");

       // Prompt for and get the user’s name.
      String name;
      System.out.println("\nPlease type in your first name: ");
      name = keyboard.next();

      // Call the createNewGame() method in GameControl class
      // pass the name as a parameter
      GameControl.createNewGame(name);

      // Display a welcome message
      System.out.println("Welcome " + name + " have fun!!!");

   }

   
   public void startSavedGame(){
       System.out.println("\n Start saved game option selected.");
   }
   
           
   public void displayHelpMenuView(){
       System.out.println("\n Display help menu selected.");
   }
   
           
   public void displaySaveGameView(){
       System.out.println("\n Display save game selected.");
   }
   

   
   
   /*
   
   
   public void gameMenuView(){
      String theMenu =  "**********************************\n" +
                        "* CITY OF AARON: MAIN GAME MENU  *\n" +
                        "**********************************\n" +
                        " 1 - Start new game\n" +
                        " 2 - Get and start a saved game\n" +
                        " 3 - Get help on playing the game\n" +
                        " 4 - Save game\n" +
                        " 5 - Quit\n";
      System.out.println(theMenu);
      // declare a variable to hold user’s input
      int userInput = 0;
      final int MAX = 5;
      

      // begin loop
      do{
         // get user input from the keyboard
         userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
         // loop back to the top of the loop if input was not valid
         if(userInput < 1 || userInput > MAX){
            System.out.println("Error: you must select 1, 2, 3, 4, or 5");
         }
         // end loop
      } while (userInput < 1 || userInput > MAX);

      
      switch(userInput){
         case 1: // create and start a new game
             startNewGame();
             break;
         case 2: // get and start a saved game
             loadSavedGame();
             break;
         case 3: // get help menu
             displayHelpMenu();
             break;
         case 4: // save game
             saveGame();
             break;
         case 5:
             System.out.println("Thanks for playing ... goodbye.");
      }
      return;
   }
   
   public void loadSavedGame(){
      
   }
   public void displayHelpMenu(){
      
   }
   public void saveGame(){
      
   }
   */
   
}
