package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.mapper.CustomerMapper;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerDTO customer) {

    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return customerMapper.selectCustomers();
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(String customerName) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {

    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨틀ㄹ러에서 넘어온 아이디" + customer.getCustomer_Id());
        System.out.println("컨틀ㄹ러에서 넘어온 아이디" + customer.getPassword());
    
        return customerMapper.login(customer); 
           
        
    }

    @Override
    public int countAll() {
        return customerMapper.countAll();
    }


}