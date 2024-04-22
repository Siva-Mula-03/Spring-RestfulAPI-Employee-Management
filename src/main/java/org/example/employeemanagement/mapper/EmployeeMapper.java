package org.example.employeemanagement.mapper;

import org.example.employeemanagement.entity.Employee;
import org.example.employeemanagement.model.EmployeeRequestDTO;
//Represents the DTO (Data Transfer Object) class for Employee requests.

//EmployeeMapper interface, which will define the methods for mapping between Employee entities and EmployeeRequestDTO objects.

public interface EmployeeMapper {
    public EmployeeRequestDTO toDTO(Employee employee);
    public Employee toEntity(EmployeeRequestDTO employeeRequestDTO);
}
