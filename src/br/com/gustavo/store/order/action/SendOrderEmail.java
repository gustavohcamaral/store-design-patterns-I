package br.com.gustavo.store.order.action;

import br.com.gustavo.store.order.Order;

//OBESERVER
public class SendOrderEmail implements AfterGenerateOrderAction{
    public void executeAction(Order order){
        System.out.println("Sending order email!");
    }
}
