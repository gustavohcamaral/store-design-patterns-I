package br.com.gustavo.store.discount;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    protected abstract BigDecimal performCalculation(Quote quote);
    protected abstract boolean shouldApply(Quote quote);
    //TEMPLATE METHOD
    public BigDecimal calculate(Quote quote) {
        if(shouldApply(quote)){
            return performCalculation(quote);
        }
        return next.calculate(quote);
    }
}