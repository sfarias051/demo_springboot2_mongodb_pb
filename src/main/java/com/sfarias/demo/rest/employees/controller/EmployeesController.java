package com.sfarias.demo.rest.employees.controller;

import com.sfarias.demo.rest.employees.model.Employee;
import com.sfarias.demo.rest.employees.repository.EmployeesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping("")
    public List<Employee> getAllEmployees(){
        return employeesRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Employee getEmployeeById(@PathVariable("id") ObjectId id){
        return employeesRepository.findBy_id(id);
    }

    @PutMapping(value = "/{id}")
    public void updateEmployeeById(@PathVariable("id") ObjectId id, @Valid @RequestBody Employee employee){
        employee.set_id(id);
        employeesRepository.save(employee);
    }

    @PostMapping("")
    public Employee createEmployee(@Valid @RequestBody Employee employee){
        employee.set_id(ObjectId.get());
        employeesRepository.save(employee);
        return employee;
    }

    @DeleteMapping(value = "/{id}")
    public void removeEmployee(@PathVariable ObjectId id){
        employeesRepository.delete(employeesRepository.findBy_id(id));
    }
}
