package com.devops.currency_converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CurrencyConverterTest {

    CurrencyConverter converter = new CurrencyConverter();

    @Test
    public void testUsdToInr() {
        double result = converter.convert("USD", "INR", 1);
        assertEquals(83.0, result, 0.01);
    }

    @Test
    public void testInrToUsd() {
        double result = converter.convert("INR", "USD", 83);
        assertEquals(1.0, result, 0.01);
    }

    @Test
    void testInvalidCurrency() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert("ABC", "INR", 100);
        });
    }

}
