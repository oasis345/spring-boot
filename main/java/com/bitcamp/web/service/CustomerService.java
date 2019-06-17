package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

@Component
public interface CustomerService {

    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(String customerName);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(String customerId);
    public CustomerDTO login(CustomerDTO customer);
    public int countAll();
}