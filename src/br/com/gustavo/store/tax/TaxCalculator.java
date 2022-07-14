package br.com.gustavo.store.tax;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class TaxCalculator {
    //DESIGN PATTERN - STRATEGY
    public BigDecimal calculate(Quote quote, Tax tax){
        return tax.calculate(quote);
    }
}
