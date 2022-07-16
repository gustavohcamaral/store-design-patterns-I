package br.com.gustavo.store.order.action;

import br.com.gustavo.store.order.GenerateOrder;
import br.com.gustavo.store.order.Order;
import br.com.gustavo.store.order.action.AfterGenerateOrderAction;
import br.com.gustavo.store.quote.Quote;
import br.com.gustavo.store.quote.QuoteItem;

import java.time.LocalDateTime;
import java.util.List;

//COMMAND HANDLER - this class represents the ordering action
public class GenerateOrderHandler {

    //Classe que está disparando o observer através da interface AfterGenerateOrderAction
    private List<AfterGenerateOrderAction> actions;

    public GenerateOrderHandler(List<AfterGenerateOrderAction> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data){
        Quote quote = new Quote();
        quote.addItem(new QuoteItem(data.getQuoteValue()));
        Order order = new Order(data.getClient(), LocalDateTime.now(), quote);
        actions.forEach(a -> a.executeAction(order));
    }

}
