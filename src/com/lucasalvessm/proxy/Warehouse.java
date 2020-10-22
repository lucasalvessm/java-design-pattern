package com.lucasalvessm.proxy;

import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList())
            this.stock.replace(item.getSku(), stock.get(item) - 1);
        /* Process the order for shipment and delivery */
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.getSku()))
            return stock.get(item.getSku()).intValue();
        return 0;
    }
}
