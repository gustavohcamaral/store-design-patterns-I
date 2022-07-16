package br.com.gustavo.store.tax;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

//DECORATOR
public abstract class Tax {
    private final Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal performCalculation(Quote quote);
    public BigDecimal calculate(Quote quote) {
        BigDecimal taxValue = performCalculation(quote);
        BigDecimal otherTaxValue = BigDecimal.ZERO;
        if (otherTax != null) {
            otherTaxValue = otherTax.performCalculation(quote);
        }
        return taxValue.add(otherTaxValue);
    }
}
