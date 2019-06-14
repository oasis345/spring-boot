package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {

    public void addEmployee(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployees();
    public List<EmployeeDTO> findEmployeesByOption(String employeeManager);
    public EmployeeDTO findEmployeeByEmployeeId(String employeeId);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(String employeeId);
}