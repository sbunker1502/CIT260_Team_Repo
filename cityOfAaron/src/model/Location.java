/*
* The main() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Shawn Curtis, Tyler Watson, Sean Bunker
* This is the location java file
*/
package model;

/**
*
* @author seanbunker
*/
public class Location {
   
   private String description;
   private String symbol;

   public Location() {
   }

   public Location(String description, String symbol) {
      setDescription(description);
      setSymbol(symbol);
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getSymbol() {
      return symbol;
   }

   public void setSymbol(String symbol) {
      this.symbol = symbol;
   }
   
}