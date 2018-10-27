package control;


import java.util.Random;
import model.*;

public class CropControl {
   private int landPrice;
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
   
   
   
   // The buyLand method
   // Purpose: To buy land
   // Parameters: the price of land, the number of acres to buy, a
   // a reference to a CropData object, and the number of wheat bushels in store. 
   // Returns: the acres owned after the purchase
   // Pre-conditions: acres to buy must be >= 0,
   // and landPrice * acresToBuy must be <= wheatInStore
   public static int buyLand(int landPrice, int acresToBuy, int wheatInStore, CropData cropData) {
      
      //if acresToBuy < 0, return -1
      if(acresToBuy < 0){
         return -1;
      }
      
      //set totalPrice to landPrice*acresToBuy
      int totalPrice = landPrice * acresToBuy;
      
      //if totalPrice > wheatInStore, return -2
      if(totalPrice > wheatInStore){
         return -2;
      }
      
      //set owned to cropData.getAcresOwned()
      int acresOwned = cropData.getAcresOwned();
      
      //add acresToBuy to owned
      acresOwned += acresToBuy;
      //add totalPrice to wheatInStore
      wheatInStore -= totalPrice;
      
      //set this.acresOwned to owned
      cropData.setAcresOwned(acresOwned);
      //set this.wheatInStore to wheatInStore
      cropData.setWheatInStore(wheatInStore);
      //return owned
      return acresOwned;
   }
   
   
   public static int plantCrops(int acresPlanted, int acresOwned, int population, int wheatInStore, CropData cropData){              
      /* Purpose : Planting Acres
      Method : plant crops
      */
      if(acresPlanted < 0){
         return -1;
      }
      if(acresPlanted > acresOwned){
         return -2;
      }
      
      int workCapacity = population * 10;
      int workersNeeded = acresPlanted / 10;
      if(workersNeeded > workCapacity){
         return -3;
      }
      
      int plantCapacity = wheatInStore * 2;
      int bushelsNeeded = acresPlanted / 2;
      if(bushelsNeeded > plantCapacity){
         return -4;
      }
      
      wheatInStore -= bushelsNeeded;
      //set this.wheatInStore to wheatInStore
      cropData.setWheatInStore(wheatInStore);
      cropData.setAcresPlanted(acresPlanted);
      
      return 1;
   }    
   
    /*public static int plantCrops(int population, int wheatInStore, int acresOwned){          */    
      /* Purpose : Planting Acres
      Method : plant crops
      */
      
    /*  Wheat in store is get from Crop data.
   If wheat in store is less than zero then an exception is generated that  wheat in store cannot be negative
   Then wheat in store is set to wheatInStore variable
   Then wheat for people  is set to wheatForPeople  variable
   Wheat in store is returned
         */
      
      /*   if (acresByWheat > acresOwned && acresByPopulation > acresOwned)
      { 
          return acresOwned;
      }
      else if (acresByWheat < acresOwned && acresByWheat < acresByPopulation)
      {
          return acresByWheat;
      }
      else 
      {
          return acresByPopulation;
      }
      int acresPlanted = wheatInStore * 2;
      int acresByPopulation = population * 10;
   }     */
}
