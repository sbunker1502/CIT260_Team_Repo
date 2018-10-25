package control;


import java.util.Random;
import model.*;

public class CropControl {

   //constants
   private static final int LAND_BASE = 17;
   private static final int LAND_RANGE = 10;

   //random number generator
   private static Random random = new Random();

   //calcLandCost() method
   //Purpose: Calculate a random land cost between 17 and 26 bushels/acre
   //Parameters: none
   //Returns: the land cost
   public static int calcLandCost() {
       int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
       return landPrice;
   }

   // The sellLand method
   // Purpose: To sell land
   // Parameters: the price of land, the number of acres to sell, and
   // a reference to a CropData object 
   // Returns: the acres owned after the sale
   // Pre-conditions: acres to sell must be positive
   // and <= acresOwned
   public static int sellLand(int landPrice, int acresToSell, CropData cropData) {

      //if acresToSell < 0, return -1
      if(acresToSell < 0){
         return -1;
      }
      
      //if acresToSell > acresOwned, return -1
      int owned = cropData.getAcresOwned();
      if(acresToSell > owned){
         return -1;
      }
      //acresOwned = acresOwned - acresToSell
      owned -= acresToSell ;
      cropData.setAcresOwned(owned);
      
      //wheatInStore = wheatInStore + acresToSell * landPrice
      int wheat = cropData.getWheatInStore();
      wheat += (acresToSell * landPrice) ;
      cropData.setWheatInStore(wheat);
      
      //return acresOwned
      return owned ;
   }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package control;


public class CropControl { public static int feedPeople(int wheatForPeople, CropData cropData){
        try {
        int wheatInStore = cropData.getWheatInStore(); 
        
        if (wheatForPeople < 0) {
            throw new CropException("A negative value was input.");
        }
        
        
        if (wheatInStore < wheatForPeople) {
            throw new CropException("Sorry, you don't have enough wheat.");
        }
        
         if (wheatForPeople < wheatInStore) {
            wheatInStore -= wheatForPeople; 
            cropData.setWheatInStore(wheatInStore);
            cropData.setWheatForPeople(wheatForPeople);
            return cropData.getWheatInStore();
        }
        
        }
        catch (CropException e) {
            System.out.println("I cannot do that Sir");
            System.out.println(e.getMessage());
        }
        return 0;
    }

 
    
}

*/