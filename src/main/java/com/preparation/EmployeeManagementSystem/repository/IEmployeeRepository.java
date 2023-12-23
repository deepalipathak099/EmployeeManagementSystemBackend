package com.preparation.EmployeeManagementSystem.repository;

import com.preparation.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByEmployeeId(String employeeId);
    @Query("SELECT e FROM Employee e WHERE e.employeeAddress = :employeeAddress AND e.employeeAge BETWEEN :minAge AND :maxAge")
    List<Employee> findEmployeeBasedOnAddressAndAge(@Param("employeeAddress") String employeeAddress,@Param("minAge") int minAge,@Param("maxAge") int maxAge);
@Query("SELECT e FROM Employee e WHERE e.employeeName = :employeeName AND e.employeeEmail = :employeeEmail")
Employee findEmployeeByEmployeeNameAndEmail(@Param("employeeName") String employeeName,@Param("employeeEmail") String employeeEmail);
@Query("SELECT e FROM Employee e WHERE UPPER(SUBSTRING(e.employeeName, 1, 1)) = :firstLetter")
List<Employee> findEmployeeByFirstLetterOfName(@Param("firstLetter") String firstLetter);

}
