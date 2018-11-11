/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author seanbunker
 */
public class GameMenuView {

    Scanner keyboard = new Scanner(System.in);
    private String gameMenu;
    private int max;

    public GameMenuView() {
        // The GameMenuView constructor
        // Purpose: Initialize the menu data
        // Parameters: none
        // Returns: none
        // ===================================

        gameMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - View Map\n"
                + " 2 - View List\n"
                + " 3 - Move To New Location\n"
                + " 4 - Manage Crops\n"
                + " 5 - Back to the Main Menu\n";
        max = 5;
    }

    public void displayMenuView() {
        int menuOption;
        do {
            // Display the menu
            System.out.println(gameMenu);

            // Prompt the user and get the user’s input
            menuOption = getMenuOption();

            // Perform the desired action
            doAction(menuOption);

        } while (menuOption != max);
    }

    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption() {
        int userInput = 0;
        // begin loop
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            // loop back to the top of the loop if input was not valid
            if (userInput < 1 || userInput > max) {
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
            }
            // end loop
        } while (userInput < 1 || userInput > max);
        return userInput;
    }

    public void doAction(int option) {
        switch (option) {
            case 1:
                viewMap();
                break;
            case 2:
                viewList();
                break;
            case 3:
                moveToNewLocation();
                break;
            case 4:
                manageCrops();
                break;
            case 5:
                // return to main menu
                return;
        }
        return;
    }

    public void viewMap() {
        System.out.println("\n View Map");
    }

    public void viewList() {
        System.out.println("\n View List");
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenuView();
    }

    public void moveToNewLocation() {
        System.out.println("\n Move Player to New Location");
    }

    public void manageCrops() {
        System.out.println("\n Manage Crops.");
        //CropView cv = new CropView(); this is not needed
        CropView.runCropView();
    }
}
