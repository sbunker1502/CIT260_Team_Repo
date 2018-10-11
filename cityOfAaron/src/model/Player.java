/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Winter 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the player java file
 */
package model;

/**
 *
 * @author seanbunker
 */
public class Player implements Serializable{
    
    // Private Variable: 'name'
    private String name;
    
    // Array to store games
    private ArrayList<Game> games = new ArrayList<Game>();
    
 
    
    // Default Constructor
    public Player() {
    }
    

    // name getter
    public String getName() {
        return name;
    }
    
    // name setter
    public void setName(String name) {
        this.name = name;
    }
    
    // games array getter
    public ArrayList<Game> getGames() {
        return games;
    }
    
    // games array setter
    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    // equals() and toString() methods
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
