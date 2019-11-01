package com.cmz.dao;


import com.cmz.entity.OrderItem;

import java.util.List;

public interface OrderItemDao {

    void addOne(OrderItem orderItem);

    List<OrderItem> getByOrderId(int id);

    List<OrderItem> getOrderItemByPrice(int price);


}
