/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author T2000
 */
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
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
        return 0;
    }


    
}
