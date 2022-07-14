package br.com.gustavo.store.quote.status;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class Approved extends QuoteStatus {

    public BigDecimal calculateExtraDiscountValue(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.02"));
    }

    public void finish(Quote quote){
        quote.setStatus(new Finished());
    }


}
