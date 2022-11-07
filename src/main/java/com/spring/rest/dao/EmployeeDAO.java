package com.spring.rest.dao;

import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public  void saveEmployee(Employee employee);

    Employee getEmployee(int id);
    void deleteEmployee(int id);
}

