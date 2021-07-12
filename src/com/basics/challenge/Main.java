package com.basics.challenge;

import java.util.Scanner;

public class Main {

    private static double mortgageFormula(long P, double r, int n) {
        /**
         * P: Principal in USD.
         * r: Interest in scala 0 to 1.
         * n: Period in months.
         * M: Mortgage payment per month.
         * */

        double M = P * (r * Math.pow(1+r, n) ) / (Math.pow(1+r, n) - 1);
        return M;
    };

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble() / 100.0;
        System.out.print("Period (Years): ");
        int period = scanner.nextInt() * 12;

        double result = mortgageFormula(principal, interest, period);
        System.out.println("Mortgage: $" + result);
    }
}
