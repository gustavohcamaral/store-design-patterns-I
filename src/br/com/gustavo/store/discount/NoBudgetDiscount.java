package br.com.gustavo.store.discount;


import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class NoBudgetDiscount extends Discount {

    public NoBudgetDiscount() {
        super(null);
    }

    public BigDecimal performCalculation(Quote quote){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Quote quote) {
        return true;
    }

}
