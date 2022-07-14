package br.com.gustavo.store.order.action;

import br.com.gustavo.store.order.Order;

public interface AfterGenerateOrderAction {

    public void executeAction(Order order);

}
