package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;

import org.springframework.stereotype.Component;

@Component
public interface OrderService {

    public void addOrder(OrderDTO order);
    public List<OrderDTO> findOrders();
    public List<OrderDTO> findOrdersByOption(String ordeDate);
    public OrderDTO findOrderByOrderId(String orderId);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(String orderId);
}