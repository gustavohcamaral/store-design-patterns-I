package br.com.gustavo.store.tax;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class ISS implements Tax{
    public BigDecimal calculate(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.06"));
    }
}
