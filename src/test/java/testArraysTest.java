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
public class testArraysTest {
    
    public testArraysTest() {
    }

   
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] testArray = {1,2,3,4};
        int expResult = 10;
        int result = testArrays.getTotal(testArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] testArray = {1,2,3,4};
        double expResult = 2.5;
        double result = testArrays.getAverage(testArray);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] testArray = {1,2,3,4};
        double expResult = 4;
        double result = testArrays.getHighest(testArray);
        assertEquals(expResult, result, 4.0);
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] testArray = {1,2,3,4};
        double expResult = 1;
        double result = testArrays.getLowest(testArray);
        assertEquals(expResult, result, 1.0);
    }
    
}
