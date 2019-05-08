package com.sfarias.demo.rest.employees.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Class representation of Collection "Employees"
 *
 * @author sebastianfarias
 */
@Document(collection="employees")
public class Employee {

    @Id
    public ObjectId _id;

    public String name;
    public String lastName;
    public String designation;
    public String project;
    public Boolean status;
    public Date joinDate;


    public Employee(){}

    public Employee(ObjectId _id, String name, String lastName, String designation, String project, Boolean status, Date joinDate) {
        this._id = _id;
        this.name = name;
        this.lastName = lastName;
        this.designation = designation;
        this.project = project;
        this.status = status;
        this.joinDate = joinDate;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
