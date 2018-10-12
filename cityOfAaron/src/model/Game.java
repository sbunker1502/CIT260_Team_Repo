/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the game java file.
 */
package model;
import java.io.Serializable;
/**
 *
 * @author seanbunker
 */
public class Game implements Serializable{
    private Player thePlayer;
    
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
}
