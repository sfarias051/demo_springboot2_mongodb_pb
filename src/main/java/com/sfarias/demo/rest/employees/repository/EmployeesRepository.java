package com.sfarias.demo.rest.employees.repository;

import com.sfarias.demo.rest.employees.model.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employee, String> {
    Employee findBy_id(ObjectId objectId);
}
