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
    CustomerDTO customer;

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerDTO customer) {
        customerMapper.insertCustomer(customer);
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
    public CustomerDTO login(String customerId, String password) {
        customer = customerMapper.login(customerId, password);
        return customer;
    }

    @Override
    public int count() {
        return customerMapper.count();
    }


}