/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the game java file.
 */
package model;
import java.io.Serializable;

import java.io.*; 
import java.util.*; 
import java.io.PrintWriter;
import java.io.IOException;


public class Game implements Serializable{
   private Maps theMap;
   private Player thePlayer;
   private CropData cropData;
   private ArrayList<ListItem> animals;
   private ArrayList<ListItem> tools;
   private ArrayList<ListItem> provisions;
    
   // inserted constructors
   public Game() 
   {
   }
  
   public Player getPlayer() {
       return thePlayer;
   }
   public void setPlayer(Player player) {
       thePlayer = player;
   }
  
   
   public CropData getCropData() {
      return cropData;
   }
   public void setCropData(CropData cropData1) {
      cropData = cropData1;
   }
    
   public ArrayList<ListItem> getTools(){
      return tools;
   }
   public void setTools(ArrayList<ListItem> tools1) {
      tools = tools1;
   }


   public ArrayList<ListItem> getAnimals(){
      return animals;
   }
   public void setAnimals(ArrayList<ListItem> animals1){
      animals = animals1;
   }

   public ArrayList<ListItem> getProvisions() {
      return provisions;
   }
   public void setProvisions(ArrayList<ListItem> provisions1) {
      provisions = provisions1;
   }
   
}