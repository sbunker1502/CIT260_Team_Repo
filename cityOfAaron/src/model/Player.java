/*
    
    // Array to store games
    private ArrayList<Game> games = new ArrayList<Game>();


 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the player java file
 */
package model;

/**
 *
 * @author seanbunker
 */
import java.io.Serializable;

public class Player implements Serializable{
    
    // Private Variable: 'name'
    private String name;  
 
    // Default Constructor
    public Player() {
    }
 
    // name getter
    public String getName() {
        return name;
    }
     
    // name setter
    public void setName(String playerName) {
        name = playerName;
    }
}