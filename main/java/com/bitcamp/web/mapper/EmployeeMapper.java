package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {

    public void insertEmployee(EmployeeDTO employee);
    public List<EmployeeDTO> selectEmployees();
    public List<EmployeeDTO> selectEmployeesByOption(String employee_Manager);
    public EmployeeDTO selectEmployeeByEmployeeId(String employee_Id);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(String employee_Id);
}