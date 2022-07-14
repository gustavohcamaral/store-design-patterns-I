package br.com.gustavo.store.discount;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class BudgetDiscountMoreFiveItems extends Discount{

    public BudgetDiscountMoreFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Quote quote){
        return quote.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Quote quote) {
        return quote.getQuantityOfItems() > 5;
    }

}
