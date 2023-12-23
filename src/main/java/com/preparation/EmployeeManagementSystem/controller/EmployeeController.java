package com.preparation.EmployeeManagementSystem.controller;

import com.preparation.EmployeeManagementSystem.model.Employee;
import com.preparation.EmployeeManagementSystem.response.EmployeeResponse;
import com.preparation.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ems")

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/addemployee")
    public EmployeeResponse addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployeeDetails(employee);
    }
    @GetMapping("/getemployee")
    public Employee getEmployeeById(@RequestParam int Id){
        return  employeeService.searchEmployeeById(Id);
    }
    @GetMapping("/getemployee/employeeId")
    public List<Employee> fetchEmployeeByEmployeeId(@RequestParam String employeeId){
        return  employeeService.fetchEmployeeByEmployeeId(employeeId);
    }
    @GetMapping("/getemployeebyaddressandage")
    public List<Employee> findEmployeeBasedOnAddressAndAge(@RequestParam String employeeAddress,@RequestParam int minAge,@RequestParam int maxAge){
        return employeeService.findEmployeeBasedOnAddressAndAge(employeeAddress,minAge,maxAge);
    }

    @GetMapping("/getemployeebynameandemail")
    public Employee findEmployeeByEmployeeNameAndEmployeeEmail(@RequestParam String employeeName,@RequestParam String employeeEmail){
        return employeeService.findEmployeeByEmployeeNameAndEmail(employeeName,employeeEmail);
    }

    @GetMapping("/getemployeebyfirstletter")
    public List<Employee> findEmployeeBasedOnFirstLetterOfName(@RequestParam String firstLetter){
        return employeeService.findEmployeeBasedOnFirstLetter(firstLetter);
    }
}
