/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Shawn Curtis, Tyler Watson, Sean Bunker
 * This is the team member java file
 */
package model;

/**
 *
 * @author seanbunker
 */
public enum TeamMembers {

   withAnH("Curtis", "Mister"),
   withAnE("Bunker", "Mister"),
   withAT("Watson", "Mister");
    
   private String memberName;
   private String memberTitle;
   
   TeamMembers(String name, String title){
      memberName = name;
      memberTitle = title;
   }
   
   public String getName(){
      return memberName;
   }
   
   public String getTitle(){
      return memberTitle;
   }
}
