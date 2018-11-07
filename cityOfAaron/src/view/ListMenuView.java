/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
/**
 *
 * @author Curtis
 */
public class ListMenuView {
   Scanner keyboard = new Scanner(System.in);
   private String listMenu;
   private int max;

   public ListMenuView(){
      // The GameMenuView constructor
      // Purpose: Initialize the menu data
      // Parameters: none
      // Returns: none
      // ===================================

      listMenu =         "\n" +
                        "**********************************\n" +
                        "* CITY OF AARON: MAIN GAME MENU  *\n" +
                        "**********************************\n" +
                        " 1 - Start new game\n" +
                        " 2 - Get and start a saved game\n" +
                        " 3 - Get help on playing the game\n" +
                        " 4 - Save game\n" +
                        " 5 - Back to the Main Menu\n";
      max = 5;
   }

   public void displayMenuView(){
      int menuOption;
      do{
         // Display the menu
         System.out.println(listMenu);

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

   public void doAction(int option)
   {
      switch(option){
         case 1: // create and start a new game
            //startNewGame();
            break;
         case 2: // get and start a saved game
          //  startSavedGame();
            break;
         case 3: // get help menu
          //  displayHelpMenuView();
            break;
         case 4: // save game
          //  displaySaveGameView();
            break;
         case 5:
            // return to main menu
            return;
      }
      return;
   } 
  
  public void listAnimals(){
       System.out.println("\n listAnimals");
   }
   
           
   public void listTools(){
       System.out.println("\n listTools");
   }
   
           
   public void listProvisions(){
       System.out.println("\n listProvisions");
   }
  
   
   public void listTeam(){
       System.out.println("\n listTeam");
   }
}
