/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab6unittests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexa
 */
public class ItemTest {

    public ItemTest() {
    }

    @Test
    public void testConstructor() {
        //Arrange-set up variables
        String expectedName = "Box";
        int expectedQuantity = 1;
        double expectedPrice = 1.5;

        //Act-Call code to be tested
        Item item = new Item (expectedName, expectedQuantity, expectedPrice);
        String actualName = item.getName();
        int actualQuantity = item.getQuantity();
        double actualPrice = item.getPrice();
        
        //Assert-check if it's correct
        assertEquals(expectedName, actualName);
        assertEquals(expectedQuantity, actualQuantity);
        assertEquals(expectedPrice, actualPrice, .00001);
    }

    @Test
    public void testToString() {
        //Arrange
        String expectedToString = "Box 1.5";
        
        //Act
        Item item = new Item ("Box", 1, 1.5);
        String actualToString = item.toString();
        
        //Assert
        assertEquals(expectedToString, actualToString);
    }

    @Test
    public void testPurchaseSucess() {
        //Arrange
        int expectedQuantityLeft = 1;
        boolean expectedSucess = true;
        
        //Act
        Item item = new Item ("Box", 2, 1.5);
        /*Is this right?*/boolean actualSucess = item.purchase(1);
        int actaulQuantity = item.getQuantity();
        
        //Assert
        assertEquals(expectedQuantityLeft, actaulQuantity);
        assertEquals(expectedSucess, actualSucess);
    }
    
    @Test
    public void testPurchaseFail() {
        //Arrange
        int expectedQuantityLeft = 1;
        boolean expectedSucess = false;
        
        //Act
        Item item = new Item ("Box", 1, 1.5);
        /*Is this right?*/boolean actualSucess = item.purchase(2);
        int actaulQuantity = item.getQuantity();
        
        //Assert
        assertEquals(expectedQuantityLeft, actaulQuantity);
        assertEquals(expectedSucess, actualSucess);
    }

}
