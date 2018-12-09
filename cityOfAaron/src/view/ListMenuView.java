/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import model.*;
import control.*;
import java.io.PrintWriter;
import java.io.IOException;


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
            //listAnimals();
            outputList(1);
            break;
         case 2: 
            //listTools();
            outputList(2);
            break;
         case 3: 
            //listProvisions();
            outputList(3);
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
   
           
  /* public void listProvisions(){
      System.out.println("\n listProvisions");
      GameControl.createProvisionsList();
      int toDo;
      boolean paramsNotOkay;
      
       do{
         paramsNotOkay = false;
         System.out.print("\n Print List(1) or Save List (2): "); 
         //  Get the user’s input and save it.
         toDo = keyboard.nextInt();
         
         if(toDo == 1){
            //print list
            try{
               GameControl.outputList();
               }
               catch(IOException e)
               
                    System.out.println("I am sorry master, I cannot do this.");
                    System.out.println(e.getMessage());
                    paramsNotOkay = true;
               }
         }else if(toDo == 2){
            //save list
            try(PrintWriter out = new PrintWriter("data.txt"))
            {
               out.println("City: " + name + "\tPopulation: " + population);
            }
            catch(IOException e)
            {
               System.out.println("File Error.");
            }
         }
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
   }*/
  
   
   public void listTeam(){
       System.out.println("\n listTeam");
   }
   
   public void outputList(int listType){
      int toDo;
      boolean paramsNotOkay;
      
      do{
         paramsNotOkay = false;
         System.out.print("\n Print List(1) or Save List (2): "); 
         //  Get the user’s input and save it.
         toDo = keyboard.nextInt();
         try{
            GameControl.outputList(listType, toDo);
         }
         catch(IOException e){
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
         }
      }while(paramsNotOkay);
   }
   
    /*private void printToolsReport() {
        GameControl gc = new GameControl();
        gc.printToolsReport();
   }*/
   
   
    
}
