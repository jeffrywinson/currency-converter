package com.devops.currency_converter;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);       // Base
        exchangeRates.put("INR", 83.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("JPY", 157.0);
    }

    public double convert(String from, String to, double amount) {
        if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
            throw new IllegalArgumentException("Unsupported currency");
        }
        double inUSD = amount / exchangeRates.get(from);
        return inUSD * exchangeRates.get(to);
    }
}
