/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package view;

import java.util.Scanner;
/**
 *
 * @author Sean Bunker
 */

public class GameMenuView extends MenuView{
   
   // The GameMenuView constructor
   // Purpose: Initialize the menu data
   // Parameters: none
   // Returns: none
   // ===================================
   public GameMenuView() {
      super("\n"
               + "**********************************\n"
               + "* CITY OF AARON: GAME MENU  *\n"
               + "**********************************\n"
               + " 1 - View Map\n"
               + " 2 - View List\n"
               + " 3 - Move To New Location\n"
               + " 4 - Manage Crops\n"
               + " 5 - Back to the Main Menu\n",
            5);
    }

   // The doAction method
   // Purpose: performs the selected action
   // Parameters: none
   // Returns: none
   // ===================================       
   @Override public void doAction(int option) {
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

    // The viewList() method
    // Purpose: Creates a ListMenuView object and calls its
    //    displayMenu( ) method       
    // Parameters: none
    // Returns: none
    public void viewList()
    {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
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
