package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;
import com.bitcamp.web.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(EmployeeDTO employee) {

    }

    @Override
    public List<EmployeeDTO> findEmployees() {
        return null;
    }

    @Override
    public List<EmployeeDTO> findEmployeesByOption(String employeeManager) {
        return null;
    }

    @Override
    public EmployeeDTO findEmployeeByEmployeeId(String employeeId) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employee) {

    }

    @Override
    public void deleteEmployee(String employeeId) {

    }

    
}