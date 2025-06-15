package com.devops.currency_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("From currency (USD, INR, EUR, GBP, JPY): ");
        String from = scanner.next().toUpperCase();
        System.out.print("To currency (USD, INR, EUR, GBP, JPY): ");
        String to = scanner.next().toUpperCase();

        try {
            double result = converter.convert(from, to, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
