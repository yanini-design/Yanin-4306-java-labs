/**
 * SavingsCalculator computes the amount in a savings account after a number of years
 * of compound interest, given principal, annual rate, and years as
 * three program arguments.
 * 
 * Author: Yanin Insorn
 * ID: 693040430-6
 * Sec: 1
 * Last updated: 2026-11-28
 */
package insorn.yanin.lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly three arguments");
            return;
        }
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        if (principal < 0 || rate < 0 || years < 0) {
            System.err.println("Error: The principal, rate, and years must not be negative");
            return;
        }

        double amount = principal * Math.pow(1 + rate / 100, years);

        BigDecimal roundedPrincipal = BigDecimal.valueOf(principal).setScale(2, RoundingMode.HALF_UP);
        BigDecimal roundedAmount = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Principal: " + roundedPrincipal + "Bath");
        System.out.println("Amount after: " + years + "years: " + roundedAmount + "Bath");
    }

}