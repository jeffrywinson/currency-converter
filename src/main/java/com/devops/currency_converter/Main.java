package com.devops.currency_converter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        if (args.length < 3) {
            System.out.println("Usage: java -jar app.jar <amount> <from_currency> <to_currency>");
            return;
        }

        double amount = Double.parseDouble(args[0]);
        String from = args[1];
        String to = args[2];

        try {
            double result = converter.convert(from, to, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
