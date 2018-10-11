/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Winter 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the team member java file
 */
package model;

/**
 *
 * @author seanbunker
 */
public enum TeamMember {

    // enum attributes
    private String name;
    private String title;
    
    // constructor 1: 2 arguements
    TeamMember(String name, String title) {
        this.name = name;
        this.title = title;
    }
    
  
    // getter: name
    public String getName() {
        return name;
    }
    
    // setter: name
    public void setName(String name) {
        this.name = name;
    }
    
    // getter: title
    public String getTitle() {
        return title;
    }
    
    // setter: title
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }
    
}
