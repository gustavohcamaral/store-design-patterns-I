package br.com.gustavo.store.quote.status;


import br.com.gustavo.store.quote.Quote;

public class Disapproved extends QuoteStatus {

    public void finish(Quote quote){
        quote.setStatus(new Finished());
    }

}
