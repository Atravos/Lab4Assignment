/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hunterwalker
 */
public class BankFeesTest {
    
    public BankFeesTest() {
    }

   @Test
    public void testCalculateCost() {
        System.out.println("calculateCost");
        double calculation = 10;
        double expResult = 11;
        double result = BankFees.calculateCost(calculation);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateCost2() {
        System.out.println("calculateCost");
        double calculation = 45;
        double expResult = 12.7;
        double result = BankFees.calculateCost(calculation);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateCost3() {
        System.out.println("calculateCost");
        double calculation = 55;
        double expResult = 13.3;
        double result = BankFees.calculateCost(calculation);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateCost4() {
        System.out.println("calculateCost");
        double calculation = 65;
        double expResult = 12.6;
        double result = BankFees.calculateCost(calculation);
        assertEquals(expResult, result, 0.0);
    }
    
}
