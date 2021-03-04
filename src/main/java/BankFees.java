
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
public class BankFees {
      public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many checks did you write this month?");
    double numberChecks = keyboard.nextInt();

    double cost = calculateCost(numberChecks);

    System.out.println("Service fees: $" + cost);
  }

  public static double calculateCost(double calculation) {
    double initFee = 10;
    double checkCost = 0;

    if (calculation < 20) {
      checkCost = 0.10;

    } else if (calculation >= 20 && calculation < 40) {
      checkCost = 0.08;

    } else if (calculation >= 40 && calculation < 60) {
      checkCost = 0.06;

    } else {
      checkCost = 0.04;

    }

    double result = initFee + (checkCost * calculation);
    return result;
  }
}
