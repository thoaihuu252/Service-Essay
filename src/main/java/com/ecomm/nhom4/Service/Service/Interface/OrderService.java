package com.ecomm.nhom4.Service.Service.Interface;

import com.ecomm.nhom4.Service.Entity.Order;


import java.util.List;
import java.util.Optional;

public interface OrderService {
    public Order saveOrder(Order order);
    public List<Order> getAllOrder();
    public Optional<Order> getOrderById(Long id);
    public void deleteOrder(Long id);
}
