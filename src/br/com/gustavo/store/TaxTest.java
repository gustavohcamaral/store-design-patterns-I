package br.com.gustavo.store;

import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.tax.ISS;
import br.com.gustavo.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {
    public static void main(String[] args) {
        Quote quote = new Quote(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calculate(quote, new ISS()));
    }
}
