package br.com.gustavo.store;

import br.com.gustavo.store.http.JavaHttpClient;
import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.quote.QuoteItem;
import br.com.gustavo.store.quote.QuoteRecord;

import java.math.BigDecimal;

public class AdapterTest {

    public static void main(String[] args) {
        Quote quote = new Quote();
        quote.addItem(new QuoteItem(BigDecimal.TEN));
        quote.approve();
        quote.finish();

        QuoteRecord record = new QuoteRecord(new JavaHttpClient());
        record.record(quote);
    }

}
