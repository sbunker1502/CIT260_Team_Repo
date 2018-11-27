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


public class Game implements Serializable{
   private Map theMap;
   private Player thePlayer;
   private CropData cropData;
    private ArrayList<ListItem> animals ;
    private ArrayList<ListItem> tools ;
    private ArrayList<ListItem> provisions ;
    
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
   /* 
    public Tools getTools() {
    }
    public void setTools(void Tools) {
    }
    
  
    public Animals getAnimals() {
    }
    public void setAnimals(void Animals) {
    }
   */
    public ArrayList<ListItem> getProvisions() {
       return provisions;
    }
    public void setProvisions(provisions1) {
       provisions = provisions1
    }
   
    
}