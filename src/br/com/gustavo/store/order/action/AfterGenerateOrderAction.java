package br.com.gustavo.store.order.action;

import br.com.gustavo.store.order.Order;

//OBSERVER
public interface AfterGenerateOrderAction {

    public void executeAction(Order order);

}
