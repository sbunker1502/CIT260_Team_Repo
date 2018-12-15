package model;
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
   
   /*public void displayMap(int row, int col, Location _location){

    //Declare the map array
    String playerMap[][] = new String[5][5];
    
    //This is the map display and the symbols used
    String[][] mappy = {
    {"///","///","^^^","^^^","~~~"},
    {"///","///","^^^","^^^","~~~"},
    {"$$$","$$$","^^^","^^^","~~~"},
    {"$$$","$$$","^^^","^^^","'''"},
    {"$$$","$$$","^^^","^^^","'''"}};

    //For loops are used to call the array locations in the map
    for(int i = 0; i < mappy.length; i++){
        output i + "|";
        for(int j = 0; j < mappy[i].length; j++){
             System.out.println(mappy[i][j].getSymbol() + "|");
        }
   
    output "\n";
   
    //This is the legend for the map
    System.out.println( "Key:\n" +
        "/// - farmland\n" +
        "^^^ - mountain\n" +
        "~~~ - river\n" +
        "$$$ - trading post\n" +
        "''' - plains");
    }
        System.out.println("***   VILLAGE MAP   ***\n"  
        + "     1     2     3     4     5");
}*/  
   
   
   
   
}