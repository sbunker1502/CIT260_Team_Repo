/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Curtis
 */
public class ListMenuViewTest {
   
   public ListMenuViewTest() {
   }

   /**
    * Test of displayMenuView method, of class ListMenuView.
    */
   @Test
   public void testDisplayMenuView() {
      System.out.println("displayMenuView");
      ListMenuView instance = new ListMenuView();
      instance.displayMenuView();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of getMenuOption method, of class ListMenuView.
    */
   @Test
   public void testGetMenuOption() {
      System.out.println("getMenuOption");
      ListMenuView instance = new ListMenuView();
      int expResult = 0;
      int result = instance.getMenuOption();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of doAction method, of class ListMenuView.
    */
   @Test
   public void testDoAction() {
      System.out.println("doAction");
      int option = 0;
      ListMenuView instance = new ListMenuView();
      instance.doAction(option);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of listAnimals method, of class ListMenuView.
    */
   @Test
   public void testListAnimals() {
      System.out.println("listAnimals");
      ListMenuView instance = new ListMenuView();
      instance.listAnimals();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of listTools method, of class ListMenuView.
    */
   @Test
   public void testListTools() {
      System.out.println("listTools");
      ListMenuView instance = new ListMenuView();
      instance.listTools();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of listProvisions method, of class ListMenuView.
    */
   @Test
   public void testListProvisions() {
      System.out.println("listProvisions");
      ListMenuView instance = new ListMenuView();
      instance.listProvisions();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of listTeam method, of class ListMenuView.
    */
   @Test
   public void testListTeam() {
      System.out.println("listTeam");
      ListMenuView instance = new ListMenuView();
      instance.listTeam();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }
   
}
