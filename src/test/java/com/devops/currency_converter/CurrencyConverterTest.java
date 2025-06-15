package com.devops.currency_converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {

    @Test
    public void testValidConversion() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert("USD", "INR", 1.0);
        assertEquals(83.0, result, 0.01);
    }

    @Test
    public void testInvalidCurrency() {
        CurrencyConverter converter = new CurrencyConverter();
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert("ABC", "USD", 100.0);
        });
    }
}
