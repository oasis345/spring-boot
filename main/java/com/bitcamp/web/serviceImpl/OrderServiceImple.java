package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;
import com.bitcamp.web.service.OrderService;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImple implements OrderService {

    @Override
    public void addOrder(OrderDTO order) {

    }

    @Override
    public List<OrderDTO> findOrders() {
        return null;
    }

    @Override
    public List<OrderDTO> findOrdersByOption(String ordeDate) {
        return null;
    }

    @Override
    public OrderDTO findOrderByOrderId(String orderId) {
        return null;
    }

    @Override
    public void updateOrder(OrderDTO order) {

    }

    @Override
    public void deleteOrder(String orderId) {

    }

    
}