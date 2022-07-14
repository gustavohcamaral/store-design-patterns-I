package br.com.gustavo.store.order;

import br.com.gustavo.store.quote.Quote;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//COMMAND
public class GenerateOrder {

    private String client;
    private BigDecimal quoteValue;
    private int quantityOfItems;

    public GenerateOrder(String client, BigDecimal quoteValue, int quantityOfItems) {
        this.client = client;
        this.quoteValue = quoteValue;
        this.quantityOfItems = quantityOfItems;
    }
    public String getClient() {
        return client;
    }

    public BigDecimal getQuoteValue() {
        return quoteValue;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }
}
