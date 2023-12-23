package com.preparation.EmployeeManagementSystem.controller;

import com.preparation.EmployeeManagementSystem.model.Employee;
import com.preparation.EmployeeManagementSystem.response.EmployeeResponse;
import com.preparation.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ems")

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/addemployee")
    public EmployeeResponse addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployeeDetails(employee);
    }
}
