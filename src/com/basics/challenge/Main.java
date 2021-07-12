package com.basics.challenge;

import java.util.Scanner;

public class Main {

    private static double mortgageFormula(long P, double r, int n) {
        /**
         * P: Principal in USD.
         * r: interest in scala 0 to 1.
         * n: 
         * */
        return 0.1;
    };

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        long principal = scanner.nextLong();
        System.out.println("Annual Interest Rate: ");
        Double interest = scanner.nextDouble();
        System.out.println("Period (Years): ");
        int period = scanner.nextInt();
    }
}
