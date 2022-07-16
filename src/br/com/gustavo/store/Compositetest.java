package br.com.gustavo.store;

import br.com.gustavo.store.quote.ProxyQuote;
import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.quote.QuoteItem;

import java.math.BigDecimal;

public class Compositetest {

    public static void main(String[] args) {
        Quote old = new Quote();
        old.addItem(new QuoteItem(new BigDecimal("200")));
        old.disapprove();

        Quote newQuote = new Quote();
        newQuote.addItem(new QuoteItem(new BigDecimal("500")));
        newQuote.disapprove();
        newQuote.addItem(old);


        System.out.println("WITHOUT PROXY");
        System.out.println(newQuote.getValue());
        System.out.println(newQuote.getValue());
        System.out.println(newQuote.getValue());
        System.out.println(newQuote.getValue());
        System.out.println(newQuote.getValue());
        System.out.println(newQuote.getValue());

        //PROXY
        ProxyQuote proxyQuote = new ProxyQuote(newQuote);
        System.out.println("WITH PROXY");
        System.out.println(proxyQuote.getValue());
        System.out.println(proxyQuote.getValue());
        System.out.println(proxyQuote.getValue());
        System.out.println(proxyQuote.getValue());
        System.out.println(proxyQuote.getValue());
        System.out.println(proxyQuote.getValue());
    }

}
