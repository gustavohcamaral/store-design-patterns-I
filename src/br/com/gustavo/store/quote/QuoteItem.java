package br.com.gustavo.store.quote;

import java.math.BigDecimal;

public class QuoteItem implements Quotable {

    private BigDecimal value;

    public QuoteItem(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
