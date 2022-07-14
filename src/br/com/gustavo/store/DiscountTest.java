package br.com.gustavo.store;

import br.com.gustavo.store.discount.DiscountCalculator;
import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Quote firstQuote = new Quote(new BigDecimal("200"), 6);
        Quote secondQuote = new Quote(new BigDecimal("1000"), 1);
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(firstQuote));
        System.out.println(calculator.calculate(secondQuote));
    }
}
