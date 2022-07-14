package br.com.gustavo.store.quote.status;

import br.com.gustavo.store.DomainException;
import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

//STATE
public abstract class QuoteStatus {

    public BigDecimal calculateExtraDiscountValue(Quote quote){
        return BigDecimal.ZERO;
    }
    public void approve(Quote quote){
        throw new DomainException("Quote can not be approved");
    }

    public void disapprove(Quote quote){
        throw new DomainException("Quote can not be disapproved");
    }

    public void finish(Quote quote){
        throw new DomainException("Quote can not be finished");
    }

}
