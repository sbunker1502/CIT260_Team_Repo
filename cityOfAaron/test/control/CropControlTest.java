/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Curtis
 */
public class CropControlTest {
   
   public CropControlTest() {
   }

   /**
    * Test of calcLandCost method, of class CropControl.
    */
   @Test
   public void testCalcLandCost() {
      System.out.println("calcLandCost");
      int expResult = 0;
      int result = CropControl.calcLandCost();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of sellLand method, of class CropControl.
    */
   @Test
   public void testSellLand() {
      System.out.println("sellLand");
      int landPrice = 0;
      int acresToSell = 0;
      CropData cropData = null;
      int expResult = 0;
      int result = CropControl.sellLand(landPrice, acresToSell, cropData);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

 /**
   * Test of buyLand method, of class CropControl.
   */
  @Test
  public void testBuyLand1() {
     System.out.println("buyLand - Test Case 1");
     CropData cropData = new CropData();
     cropData.setAcresOwned(2800);
     int landPrice = 20;
     int acresToBuy = 10;
     int wheatInStore = 3000;
     int expResult = 2810;
     int result = CropControl.buyLand(landPrice, acresToBuy, wheatInStore, cropData);
     assertEquals(expResult, result);
  }
  @Test
  public void testBuyLand2() {
     System.out.println("buyLand - Test Case 2");
     CropData cropData = new CropData();
     cropData.setAcresOwned(2800);
     int landPrice = 20;
     int acresToBuy = -5;
     int wheatInStore = 3000;
     int expResult = -1;
     int result = CropControl.buyLand(landPrice, acresToBuy, wheatInStore, cropData);
     assertEquals(expResult, result);
  }
  @Test
  public void testBuyLand3() {
     System.out.println("buyLand - Test Case 3");
     CropData cropData = new CropData();
     cropData.setAcresOwned(2800);
     int landPrice = 20;
     int acresToBuy = 188;
     int wheatInStore = 3000;
     int expResult = -2;
     int result = CropControl.buyLand(landPrice, acresToBuy, wheatInStore, cropData);
     assertEquals(expResult, result);
  }
  @Test
  public void testBuyLand4() {
     System.out.println("buyLand - Test Case 4");
     CropData cropData = new CropData();
     cropData.setAcresOwned(2800);
     int landPrice = 20;
     int acresToBuy = 150;
     int wheatInStore = 3000;
     int expResult = 2950;
     int result = CropControl.buyLand(landPrice, acresToBuy, wheatInStore, cropData);
     assertEquals(expResult, result);
  }
  @Test
  public void testBuyLand5() {
     System.out.println("buyLand - Test Case 5");
     CropData cropData = new CropData();
     cropData.setAcresOwned(2800);
     int landPrice = 20;
     int acresToBuy = 0;
     int wheatInStore = 3000;
     int expResult = 2800;
     int result = CropControl.buyLand(landPrice, acresToBuy, wheatInStore, cropData);
     assertEquals(expResult, result);
  }
}
