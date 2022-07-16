package br.com.gustavo.store.quote;

import java.math.BigDecimal;

public class ProxyQuote extends Quote{

    private BigDecimal value;
    private Quote quote;

    public ProxyQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public BigDecimal getValue(){
        if (value == null) {
            this.value = quote.getValue();
        }
        return this.value;
    }

}
