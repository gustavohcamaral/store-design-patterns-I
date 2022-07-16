package br.com.gustavo.store.quote;

import br.com.gustavo.store.DomainException;
import br.com.gustavo.store.http.HttpAdapter;

import java.util.Map;

public class QuoteRecord {

    private HttpAdapter http;

    //adapter
    public QuoteRecord(HttpAdapter http) {
        this.http = http;
    }

    public void record(Quote quote) {
        if (!quote.isFinished()) {
            throw new DomainException("quote is not finished");
        }
        String url = "http://api.external/quote";
        Map<String, Object> data = Map.of(
                "value", quote.getValue(),
                "quantityOfItems", quote.getQuantityOfItems()
        );
        http.post(url, data);
    }

}
