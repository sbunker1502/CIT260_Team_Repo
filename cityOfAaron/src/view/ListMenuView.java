/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import model.*;
import control.*;

public class ListMenuView extends MenuView{
   /**
 *
 * @author Shawn Curtis
 */
   
   // The ListMenuView constructor
   // Purpose: Initialize the menu data
   // Parameters: none
   // Returns: none
   // ===================================
   public ListMenuView(){
      super("\n" +
               "**********************************\n" +
               "* CITY OF AARON: LIST MENU  *\n" +
               "**********************************\n" +
               " 1 - List Animals\n" +
               " 2 - List Tools\n" +
               " 3 - List Provisions\n" +
               " 4 - List Team\n" +
               " 5 - Back to the Main Menu\n",
            5);
   }

   

   // The doAction method
   // Purpose: performs the selected action
   // Parameters: none
   // Returns: none
   // ===================================       
   @Override public void doAction(int option)
   {
      switch(option){
         case 1: 
            listAnimals();
            break;
         case 2: 
            listTools();
            break;
         case 3: 
            listProvisions();
            break;
         case 4: 
            listTeam();
            break;
         case 5:
            return;
      }
      return;
   } 
  
  public void listAnimals(){
       System.out.println("\n listAnimals");
   }
   
           
   public void listTools(){
       System.out.println("\n listTools");
       GameControl.showListTools();
   }
   
           
   public void listProvisions(){
       System.out.println("\n listProvisions");
   }
  
   
   public void listTeam(){
       System.out.println("\n listTeam");
   }
   
   
    /*private void printToolsReport() {
        GameControl gc = new GameControl();
        gc.printToolsReport();
   }*/
    
}
