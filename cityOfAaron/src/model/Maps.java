package model;
import cityofaaron.CityOfAaron;
import java.util.Scanner;

/**
 *
 * @author seanbunker
 */
public class Maps{
    
   //Stores the number of rows
   //Stores the number of columns
   //A reference to a 2-dimensional array of Location Objects
   private int rowCount;
   private int colCount;
   private Location[][] locations;

   // default Map constructor
   // Purpose: Set data members to default values
   // Parameters: none
   // Returns: none
   public Maps(){
   
   }

   // parameterized Map constructor
   // Purpose: Sets row and column values
   //    and creates an array of Location objects
   // Parameters: row count and column count
   // Returns: none
   public Maps(int _rows, int _cols){
      rowCount = _rows;
      colCount = _cols;

      // create the array of location objects
      locations = new Location[_rows][_cols];        
   }
   
   public Location[][] getLocations(){
      return locations;
   }
   
   public int getColCount(){
      return colCount;
   }
   
   public int getRowCount(){
      return rowCount;
   }
   
   // The getLocation method
   // Purpose: returns the location object at the given row and column
   // Parameters: a row and column
   // Returns: a Location object
   public Location getLocation(int row, int col){
       return locations[row][col];
   }

   // The setLocation method
   // Purpose: stores a location object at the  row and column
   // Parameters: a row and column, and a reference to a location object
   // Returns: void
   public void setLocation(int row, int col, Location _location){
       locations[row][col] = _location;
   }
}