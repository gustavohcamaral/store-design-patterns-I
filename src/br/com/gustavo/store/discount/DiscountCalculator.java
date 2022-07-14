package br.com.gustavo.store.discount;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public class DiscountCalculator {
    //CHAIN OF RESPONSIBILITY
    public BigDecimal calculate(Quote quote){
        Discount discountChain = new BudgetDiscountMoreFiveItems(
                new BudgetDiscountValueOverFiveHundred(
                        new NoBudgetDiscount()));
        return discountChain.calculate(quote);
    }

}