package com.preparation.EmployeeManagementSystem.service;

import com.preparation.EmployeeManagementSystem.model.Employee;
import com.preparation.EmployeeManagementSystem.repository.IEmployeeRepository;
import com.preparation.EmployeeManagementSystem.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;
    public EmployeeResponse saveEmployeeDetails(Employee employee){
        employeeRepository.save(employee);
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setEmployeeName(employee.getEmployeeName());
        employeeResponse.setEmployeeEmail(employee.getEmployeeEmail());
        return employeeResponse;

    }
}
