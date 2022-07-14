package br.com.gustavo.store.tax;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal calculate(Quote quote);
}
