package org.example.employeemanagement.controller;

import lombok.RequiredArgsConstructor;
import org.example.employeemanagement.entity.Department;
import org.example.employeemanagement.model.DepartmentRequestDTO;
import org.example.employeemanagement.service.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//Indicates that this class is a REST controller, meaning it will handle HTTP requests and return responses in JSON or XML format.
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

//Pagination is a technique used in web and software applications to divide a large set of data into smaller, more manageable chunks or "pages.
    @GetMapping("/pages")
    public Page<Department> getAllDepartmentsByPages(Pageable pageable){
        return departmentService.getAllDepartmentsByPages(pageable);
    }

    @GetMapping("/{id}")
    public Department getDepartmentDetailsById(@PathVariable(name = "id") Long id){
        return departmentService.getDepartmentDetailsById(id);
    }

    @PostMapping("/add")
    public String addNewDepartment(@RequestBody DepartmentRequestDTO departmentRequestDTO){
        return departmentService.addNewDepartment(departmentRequestDTO);
    }

    @PutMapping("/update/{id}")
    public String updateDepartment(@RequestBody DepartmentRequestDTO departmentRequestDTO, @PathVariable(name = "id") Long id){
        return departmentService.updateDepartment(departmentRequestDTO, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable(name = "id") Long id){
        return departmentService.deleteDepartment(id);
    }

//  "/departments/search?query=john"
    @GetMapping("/search")
    public List<Department> Search(@RequestParam String query){
        return departmentService.search(query);
    }
}
