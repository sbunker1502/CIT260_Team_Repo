/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import java.util.Scanner;

public class MainMenuView {
   public void MainMenuView(){
      
   }
   
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
      Scanner keyboard = new Scanner(System.in);

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
   
   
   
   
   
   
   // The startNewGame method
   // Purpose: creates game object and starts the game
   // Parameters: none
   // Returns: none
   // ===================================     
   public void startNewGame()
   {
       System.out.println("\nStart new game option selected.");
   }
   
   
   
   
   
   
   
   
   
   
   

   public void loadSavedGame(){
      
   }
   public void displayHelpMenu(){
      
   }
   public void saveGame(){
      
   }
   
   
}