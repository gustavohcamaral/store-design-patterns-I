package br.com.gustavo.store.discount;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class BudgetDiscountValueOverFiveHundred extends Discount {

    public BudgetDiscountValueOverFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Quote quote) {
        return quote.getValue().compareTo(new BigDecimal("500")) > 0;
    }

}
