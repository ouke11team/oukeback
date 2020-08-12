package com.ouke.ouke.service;

import com.ouke.ouke.po.Orders;

import java.util.List;

public interface OrdersService {
    public int createOrders(Orders orders,Integer[] cartId);
    List<Orders>listOrdersByUserId(String userId);
}
