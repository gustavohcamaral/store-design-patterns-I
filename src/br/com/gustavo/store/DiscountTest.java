package br.com.gustavo.store;

import br.com.gustavo.store.discount.DiscountCalculator;
import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.quote.QuoteItem;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Quote firstQuote = new Quote();
        firstQuote.addItem(new QuoteItem(new BigDecimal("200")));
        Quote secondQuote = new Quote();
        secondQuote.addItem(new QuoteItem(new BigDecimal("200")));
        Quote ThirdQuote = new Quote();
        ThirdQuote.addItem(new QuoteItem(new BigDecimal("200")));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(firstQuote));
        System.out.println(calculator.calculate(secondQuote));
        System.out.println(calculator.calculate(ThirdQuote));
    }
}
