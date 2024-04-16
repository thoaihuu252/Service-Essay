package com.ecomm.nhom4.Service.Service.Imp;

import com.ecomm.nhom4.Service.Entity.Order;
import com.ecomm.nhom4.Service.Repository.OrderRepository;
import com.ecomm.nhom4.Service.Service.Interface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepository orderReposity;
    @Override
    public Order saveOrder(Order order) {
        return   orderReposity.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderReposity.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderReposity.findById(id);
    }

    @Override
    public void deleteOrder(Long id) {
        orderReposity.deleteById(id);

    }
}
