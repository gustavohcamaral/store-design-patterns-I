package br.com.gustavo.store.quote.status;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class UnderAnalysis extends QuoteStatus {

    public BigDecimal calculateExtraDiscountValue(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve(Quote quote){
        quote.setStatus(new Approved());

    }
    public void disapprove(Quote quote){
        quote.setStatus(new Disapproved());
    }

}
