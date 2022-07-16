package br.com.gustavo.store.tax;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class ICMS extends Tax{
    public ICMS(Tax otherTax) {
        super(otherTax);
    }

    public BigDecimal performCalculation(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.1"));
    }
}
