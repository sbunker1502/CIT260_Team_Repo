/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shawn Curtis
 */
public class CropData {
   private int year;
   private int population;
   private int acresOwned;
   private int cropYield;
   private int wheatInStore;
   private int numberWhoDied;
   private int newPeople;
   private int harvest;
   private int peopleFed;
   private int acresPlanted;
   private int wheatForPeople;
   private int offeringPercentage;
   
   public CropData() {
   
   }
   
   public void setYear(int year1){
      year = year1;
   }
   public int getYear(){
      return year;
   }
   
   public void setPopulation(int population1){
      population = population1;
   }
   public int getPopulation(){
      return population;
   }
   
   public void setAcresOwned(int acresOwned1){
      acresOwned = acresOwned1;
   }
   public int getAcresOwned(){
      return acresOwned;
   }
   
   public void setCropYield(int cropYield1){
      cropYield = cropYield1;
   }
   public int getCropYield(){
      return cropYield;
   }
   public void setWheatInStore(int wheatInStore1){
      wheatInStore = wheatInStore1;
   }
   public int getWheatInStore(){
      return wheatInStore;
   }
   
   public void setNumberWhoDied(int numberWhoDied1){
      numberWhoDied = numberWhoDied1;
   }
   public int getNumberWhoDied(){
      return numberWhoDied;
   }
   
   public void setNewPeople(int newPeople1){
      newPeople = newPeople1;
   }
   public int getNewPeople(){
      return newPeople;
   }
   
   public void setHarvest(int harvest1){
      harvest = harvest1;
   }
   public int getHarvest(){
      return harvest;
   }
   
   public void setPeopleFed(int peopleFed1){
      peopleFed = peopleFed1;
   }
   public int getPeopleFed(){
      return peopleFed;
   }
   
   public void setAcresPlanted(int acresPlanted1){
      acresPlanted = acresPlanted1;
   }
   public int getAcresPlanted(){
      return acresPlanted;
   }
   
   public void setWheatForPeople(int wheatForPeople1){
      wheatForPeople = wheatForPeople1;
   }
   public int getWheatForPeople(){
      return wheatForPeople;
   }
   
   public void setOfferingPercentage(int percentageToOffer){
      offeringPercentage = percentageToOffer;
   }
   public int getOfferingPercentage(){
      return offeringPercentage;
   }

    public void setOffering(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setOfferingBushels(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
