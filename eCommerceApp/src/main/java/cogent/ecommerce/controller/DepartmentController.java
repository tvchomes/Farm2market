package cogent.ecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.ecommerce.exception.*;

import cogent.ecommerce.entity.*;
import cogent.ecommerce.repository.*;



@RestController
@RequestMapping("/api/v1")
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
public class DepartmentController {

	@Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/departments")
    public List <Department > getAllDepartment() {
        return departmentRepository.findAll();
    }

    @GetMapping("/departments/{id}")
    public ResponseEntity < Department > getDeppartmentById(@PathVariable(value = "id") Long deptid)
    throws ResourceNotFoundException {
        Department department = departmentRepository.findById(deptid)
            .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + deptid));
        return ResponseEntity.ok().body(department);
    }

    @PostMapping("/departments")
    public Department createDepartment(@Valid @RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @PutMapping("/departments/{id}")
    public ResponseEntity <Department> updateDepartment(@PathVariable(value = "id") Long deptid,
        @Valid @RequestBody Department departmentDetails) throws ResourceNotFoundException {
        Department department = departmentRepository.findById(deptid)
            .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + deptid));

        department.setDepartments(departmentDetails.getDepartments());
       
        final Department updatedDepartment = departmentRepository.save(department);
        return ResponseEntity.ok(updatedDepartment);
    }

    @DeleteMapping("/department/{id}")
    public Map < String, Boolean > deleteDepartment(@PathVariable(value = "id") Long deptid)
    throws ResourceNotFoundException {
        Department department = departmentRepository.findById(deptid)
            .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + deptid));

        departmentRepository.delete(department);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
}
