package br.com.gustavo.store;

import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.tax.ICMS;
import br.com.gustavo.store.tax.ISS;
import br.com.gustavo.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {
    public static void main(String[] args) {
        Quote quote = new Quote();
        TaxCalculator calculator = new TaxCalculator();
        //DECORATOR
        System.out.println(calculator.calculate(quote, new ISS(new ICMS(null))));
    }
}
