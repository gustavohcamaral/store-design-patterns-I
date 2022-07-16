package br.com.gustavo.store.order;

import br.com.gustavo.store.order.action.AfterGenerateOrderAction;

public class OrderLog implements AfterGenerateOrderAction {
    @Override
    public void executeAction(Order order) {
        System.out.println("the order "+ order +" has been generated!");
    }
}
