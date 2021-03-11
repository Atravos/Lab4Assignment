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

public class testArrays {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int userNum = 0;

    int[] testArray = { 1,2,3,4 };

    getTotal(testArray);
    getAverage(testArray);
    getHighest(testArray);
    getLowest(testArray);
  }

  public static int getTotal(int[] testArray) 
  {

    int userNum = 0;
        for( int x : testArray) {
        userNum += x;
        
      }

        System.out.println("The total value of array is " + (userNum));
        return userNum;
  }

  public static double getAverage(int[] testArray) {
    double userNum = 0;
    for ( int y = 0; y < testArray.length; y++){
         userNum += testArray[y];
         }

    double average = userNum/testArray.length;

    System.out.println("Average value of array is " + average); 
    return average; 
  }

    public static double getHighest(int[] testArray) {
      double highest = testArray[0];
    for ( int z = 0; z < testArray.length; z++){
         if (testArray[z] > highest) {
           highest = testArray[z];
          }
        }
         System.out.println("The Highest value of array is " + (highest));
         return highest;
       }

       public static double getLowest(int[] testArray) {
      double lowest = testArray[0];
    for ( int a = 0; a < testArray.length; a++){
         if (testArray[a] < lowest) {
           lowest = testArray[a];
          }
        }
         System.out.println("The Lowest value of array is " + (lowest));
         return lowest;
       }
    }
