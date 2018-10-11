/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Winter 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the game java file.
 */
package model;

/**
 *
 * @author seanbunker
 */
public class Game implements Serializable{
    
    // Class variables
    private Map theMap;
    private Player player;
    private CropData cropData;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
    
    // inserted constructors
    public Game(Map theMap, Player player, CropData cropData, ArrayList<ArrayList> animals, ArrayList<ArrayList> tools, ArrayList<ArrayList> provisions) 
    {
        this.theMap = theMap;
        this.player = player;
        this.cropData = cropData;
        this.animals = animals;
        this.tools = tools;
        this.provisions = provisions;
    }
    
    // inserted getters and setters
    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public ArrayList<ArrayList> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ArrayList> animals) {
        this.animals = animals;
    }

    public ArrayList<ArrayList> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ArrayList> tools) {
        this.tools = tools;
    }

    public ArrayList<ArrayList> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ArrayList> provisions) {
        this.provisions = provisions;
    }
  
       @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.theMap);
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.cropData);
        hash = 53 * hash + Objects.hashCode(this.animals);
        hash = 53 * hash + Objects.hashCode(this.tools);
        hash = 53 * hash + Objects.hashCode(this.provisions);

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
        final Game other = (Game) obj;
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.cropData, other.cropData)) {
            return false;
        }
        
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        if (!Objects.equals(this.provisions, other.provisions)) {
            return false;
        }
         
        return true;
    }

    @Override
    public String toString() {
        return "theMap=" + "Game" + theMap + ", player=" + player + ", cropData=" + cropData +  ", animals=" + animals + ", tools=" + tools + ", provisions=" + provisions + "}";
    }
    
}
