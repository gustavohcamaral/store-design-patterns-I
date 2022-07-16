package br.com.gustavo.store;

import br.com.gustavo.store.order.GenerateOrder;
import br.com.gustavo.store.order.OrderLog;
import br.com.gustavo.store.order.action.GenerateOrderHandler;
import br.com.gustavo.store.order.action.SendOrderEmail;
import br.com.gustavo.store.order.action.StoreOrderInDataBaseAction;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTest {

    public static void main(String[] args) {
        String client = "Gustavo";//args[0];
        BigDecimal quoteValue = new BigDecimal("300");//new BigDecimal(args[1]);
        int quantityOfItems = Integer.parseInt("2");//Integer.parseInt(args[2]);

        GenerateOrder generator = new GenerateOrder(client, quoteValue, quantityOfItems);
        //disparando os observers
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(new StoreOrderInDataBaseAction(),
                        new SendOrderEmail(),
                        new OrderLog()));
        //FACADE
        handler.execute(generator);
    }

}
