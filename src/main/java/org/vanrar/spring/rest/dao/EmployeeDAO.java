package org.vanrar.spring.rest.dao;

import org.vanrar.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void deleteEmployee(int id);

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployees(int id);
}
