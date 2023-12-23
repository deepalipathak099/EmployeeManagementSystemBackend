package com.preparation.EmployeeManagementSystem.service;

import com.preparation.EmployeeManagementSystem.model.Employee;
import com.preparation.EmployeeManagementSystem.repository.IEmployeeRepository;
import com.preparation.EmployeeManagementSystem.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Employee searchEmployeeById(int Id){
        return employeeRepository.findById(Id).get();
    }
    public List<Employee> fetchEmployeeByEmployeeId(String employeeId){
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public List<Employee> findEmployeeBasedOnAddressAndAge(String employeeAddress, int minAge, int maxAge){
        return employeeRepository.findEmployeeBasedOnAddressAndAge(employeeAddress,minAge,maxAge);
    }

    public Employee findEmployeeByEmployeeNameAndEmail(String employeeName, String employeeEmail){
        return employeeRepository.findEmployeeByEmployeeNameAndEmail(employeeName,employeeEmail);
    }

    public List<Employee> findEmployeeBasedOnFirstLetter(String firstLetter){
        return employeeRepository.findEmployeeByFirstLetterOfName(firstLetter);
    }

}
