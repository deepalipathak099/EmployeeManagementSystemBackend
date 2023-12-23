package com.preparation.EmployeeManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employee_details")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="employee_name")
    String employeeName;
    @Column(name="employee_email")
    String employeeEmail;
    @Column(name="employee_mobile_number")
    String employeeMobileNumber;
    @Column(name="employee_address")
    String employeeAddress;
    @Column(name="employee_age")
    int employeeAge;
    @Column(name="employee_id")
    String employeeId;
    @Column(name="employee_designation")
    String employeeDesignation;
    @Column(name="employee_department")
    String employeeDepartment;
    @Column(name="employee_manager_name")
    String employeeManagerName;
    @Column(name="employee_manager_email")
    String employeeManagerEmail;
    @Column(name="employee_work_location")
    String employeeWorkLocation;

}
