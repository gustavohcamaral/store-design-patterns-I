package br.com.gustavo.store.order;

import br.com.gustavo.store.quote.Quote;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime date;
    private Quote quote;

    public Order(String client, LocalDateTime date, Quote quote) {
        this.client = client;
        this.date = date;
        this.quote = quote;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Quote getQuote() {
        return quote;
    }
}
