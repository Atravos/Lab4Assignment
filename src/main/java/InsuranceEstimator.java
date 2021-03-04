
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunterwalker
 */
public class InsuranceEstimator {
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your age user?");
    double input = keyboard.nextDouble();

    double cost = calculateCost(input);

    System.out.println("Your insurance cost will be $" + cost + " a year.");
  }

  public static double calculateCost(double age) {
    if (age < 0) {
      return 0;
    }

    double result = 5 * age + 300;
    return result;
  }
}
