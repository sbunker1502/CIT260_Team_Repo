/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import control.*;
import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * @author thomaswatson
 */
    public class HelpMenuView extends MainMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String helpMenu;
    private int max;
    
    /**
     * Constructor
     * Purpose: Initialize Help Menu Data
     * Parameters: None
     * Returns: None
     */
    public HelpMenuView() {
        
        "\n" +  
                "*********************************\n" + 
                "*   CITY OF AARON : HELP MENU   *\n" +
                "*********************************\n" +
                " 1 - View Goals\n" +
                " 2 - Map\n" +
                " 3 - Movement\n" + 
                " 4 - List\n" + 
                " 5 - Quit\n",
                5);
    }
    
    
      // The MainMenuView constructor
      // Purpose: performs selected option
      // Parameters: none
      // Returns: none
    
        public void doAction(int option) {
        // governing switch statement
        switch (option) {
            // If option 1, call viewGoals()
            case 1:
                viewGoals();
                break;
            // if option 2, call viewMapHelp()
            case 2:
                viewMapHelp();
                break;
            // if option 3, call viewMoveHelp()
            case 3:
                viewMoveHelp();
                break;
            // if option 4, call viewListHelp()
            case 4:
                viewListHelp();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
      // Method: viewGoals
      // Purpose: view the goals of the game
      // Parameters: none
      // Returns: none
    public void viewGoals() {
        System.out.println("View Goals Option Selected");
    }
   
      // Method: viewMapHelp
      // Purpose: help with the map
      // Parameters: none
      // Returns: none
    public void viewMapHelp() {
        System.out.println("View Map Help Option Selected");
    }
      // Method: viewMoveHelp
      // Purpose: get help moving
      // Parameters: none
      // Returns: none
    public void viewMoveHelp() {
        System.out.println("View Move Help Option Selected");
    }
      // Method: viewListHelp
      // Purpose: vview the list help options
      // Parameters: none
      // Returns: none
    public void viewListHelp() {
        System.out.println("View List Help Option Selected");
    }
    
}
