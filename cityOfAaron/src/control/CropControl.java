package control;


import java.util.Random;
import model.*;
import exceptions.*;

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
   //public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
      
      //if acresToBuy < 0, return -1
   //   if(acresToBuy < 0){
  //       return -1;
   //   }
      
      //set totalPrice to landPrice*acresToBuy
  //    int totalPrice = landPrice * acresToBuy;
      
      //if totalPrice > wheatInStore, return -2
      
      /*
       if (acresToBuy < 0) { 
                throw new CropException("A negative value was input.");  
               }
       */
       
     // if(totalPrice > wheatInStore){
       //  return -2;
      //}
      
      //set owned to cropData.getAcresOwned()
   //   int acresOwned = cropData.getAcresOwned();
      /*
           if (cropData.getWheatInStore() < totalPrice) { 
                throw new CropException("There is isnt enough wheat."); 
            }
           */ 
      //add acresToBuy to owned
   //   acresOwned += acresToBuy;
       /*
       if ((cropData.getPopulation() * 10) < (cropData.getAcresOwned() + acresToBuy)) { 
                throw new CropException("The population isnt big enough.");  
            }
       
        */
      //add totalPrice to wheatInStore
      //wheatInStore -= totalPrice;
      
      //set this.acresOwned to owned
  //    cropData.setAcresOwned(acresOwned);
      //set this.wheatInStore to wheatInStore
      
      //cropData.setWheatInStore(wheatInStore);
      //return owned
  //    return acresOwned;
  // }
      public static void buyLand(CropData theCrop, int toBuy, int landCost) throws CropException
      {
         // check parameters - do they meet the contract
         if(toBuy < 0){
             throw new CropException("A negative value was input");
         }
         int wheat = theCrop.getWheatInStore();
         if(wheat < toBuy * landCost){
             throw new CropException("There is insufficient wheat to buy this much land");
         }
         // add the number of acres to buy to current number of acres
         int acresOwned = theCrop.getAcresOwned();
         acresOwned += toBuy;
         theCrop.setAcresOwned(acresOwned);

         // deduct cost from wheatInStore
         wheat = theCrop.getWheatInStore();
         wheat -= (toBuy * landCost);
         theCrop.setWheatInStore(wheat);
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
   public static int feedPeople(int wheatInStore, int wheatForPeople, CropData cropData) {
      //if wheatForPeople < 0, return -1
      if (wheatForPeople < 0){
          return -1;
      }

      //if wheatInStore < WheatForPeople return 
      if(wheatForPeople > wheatInStore) {
          return -2;
      }

      //wheatInStore = wheatInStore - wheatForPeople
      wheatInStore -= wheatForPeople;
      cropData.setWheatInStore(wheatInStore);

      // wheat for people
      cropData.setWheatForPeople(wheatForPeople);

      //return wheatInStore
      return 1;
   }
   
   public int setOffering(int precentageToOffer, CropData cropData){
      // setOffering function

      // purpose: to set the percentage of bushels harvested to be offered.

      // parameter: the number of bushels to be offered

      // returns: 1 for success, -1 for error

      // pre-conditions: the number passed in needs to be greater than or equal to 0, and can’t exceed 100
      if (precentageToOffer < 0 || precentageToOffer > 100){
          return -1;
      }
      
      cropData.setOfferingPercentage(precentageToOffer);
      return 1;
      
   }
}