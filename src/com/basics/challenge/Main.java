package com.basics.challenge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static double mortgageFormula(int P, float r, int n) {
        /**
         * P: Principal in USD.
         * r: Monthly interest in percent.
         * n: Number of payments.
         * M: Mortgage payment per month.
         * */

        double M = P * (r * Math.pow(1+r, n) ) / (Math.pow(1+r, n) - 1);
        return M;
    };

    public static void main(String[] args) {
	    final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte periodInYears = scanner.nextByte();
        int numberOfPayments = periodInYears * MONTHS_IN_YEAR;

        double mortgage = mortgageFormula(principal, monthlyInterest, numberOfPayments);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
