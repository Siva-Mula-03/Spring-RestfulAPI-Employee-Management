
/*
The DepartmentRepository interface serves as a data access layer for the Department entity,
providing methods to interact with the underlying database without having to write the actual implementation. 
*/

package org.example.employeemanagement.mapper;

import org.example.employeemanagement.entity.Department;
import org.example.employeemanagement.model.DepartmentRequestDTO;

public interface DepartmentMapper {
    public DepartmentRequestDTO toDTO(Department department);
    public Department toEntity(DepartmentRequestDTO departmentRequestDTO);
}
