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
public class ArrayHigherNumberProblemTest {
    
    public ArrayHigherNumberProblemTest() {
    }

   
    @Test
    public void testTestGreater() {
        System.out.println("testGreater");
        int[] testArray = {1,2,3,4,50};
        double expResult = 50;
        double result = ArrayHigherNumberProblem.testGreater(testArray);
        assertEquals(expResult, result, 50);
    }
    
}
