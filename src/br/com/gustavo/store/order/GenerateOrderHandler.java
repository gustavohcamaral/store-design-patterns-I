package br.com.gustavo.store.order;

import br.com.gustavo.store.order.action.AfterGenerateOrderAction;
import br.com.gustavo.store.quote.Quote;

import java.time.LocalDateTime;
import java.util.List;

//COMMAND HANDLER
//Classe que está disparando o observer
public class GenerateOrderHandler {

    private List<AfterGenerateOrderAction> actions;

    public GenerateOrderHandler(List<AfterGenerateOrderAction> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data){
        Quote quote = new Quote(data.getQuoteValue(), data.getQuantityOfItems());
        Order order = new Order(data.getClient(), LocalDateTime.now(), quote);
        actions.forEach(a -> a.executeAction(order));
    }

}
