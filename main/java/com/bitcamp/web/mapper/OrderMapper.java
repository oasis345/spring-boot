package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.OrderDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {

    public void insertOrder(OrderDTO order);
    public List<OrderDTO> selectOrders();
    public List<OrderDTO> selectOrdersByOption(String orde_Date);
    public OrderDTO selectOrderByOrderId(String order_Id);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(String order_Id);
}