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

/**
 *
 * @author Team Awesome
 */

public class MainMenuView extends MenuView {
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================

    public MainMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: MAIN GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Get and start a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Save game\n"
                + " 5 - Quit\n",
                5);
    }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override
    public void doAction(int option) {
        switch (option) {
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
                saveGame();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
        return;
    }

    public void startNewGame() {
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

        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    }

    // The startSavedGame method
    // Purpose: loads a saved game object from disk and start the game
    // Parameters: none
    // Returns: none
    // ===================================    
    public void startSavedGame() {
        System.out.println("\n Start saved game option selected.");

        // get rid of nl character left in the stream
        keyboard.nextLine();
        // prompt user and get a file path
        System.out.println("File path of the game wanted: ");
        String filepath = keyboard.nextLine();
        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl gc = new GameControl();
        gc.getSavedGame(filepath);        
        // display the game menu for the loaded game
        GameMenuView gm = new GameMenuView();
        gm.displayMenu();
    }

    public void displayHelpMenuView() {
        System.out.println("\n Display help menu selected.");
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenu();
    }

     // The saveGame method
    // Purpose: saves a game object to disk
    // Parameters: none
    // Returns: none
    // ===================================   
    public void saveGame() {
        System.out.println("\n Save game selected.");
        
        // get rid of nl character left in the stream
        keyboard.nextLine();
        // prompt user and get a file path
        System.out.println("Where should the game be saved?: ");
        String filepath = keyboard.nextLine();
        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl gc = new GameControl();
        gc.saveGame(filepath);        
        // display the game menu for the loaded game
        GameMenuView gm = new GameMenuView();
        gm.displayMenu();
    }
}
