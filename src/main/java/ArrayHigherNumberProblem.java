/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunterwalker
 */
import java.util.Scanner;

public class ArrayHigherNumberProblem {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int userNum = 25;

    int[] testedArray = {1,2,3,4, 50 };

    System.out.println("These numbers are greater than " + userNum + " within the test array: ");

    testGreater(testedArray);
  }

  public static double testGreater(int[] testArray) {
    double userNum = 25;
    for (int x = 0; x < testArray.length; x++) {
      if (testArray[x] > userNum)
        System.out.println(testArray[x]);
    }
    return userNum;
  }
}