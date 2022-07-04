package com.example.demo2.Controller;

import com.example.demo2.Model.Department;
import com.example.demo2.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DepartmentController {

    @Autowired
    private MongoTemplate mongoTemplate;
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department createDept(@RequestBody Department department) {
        departmentRepository.save(department);
        return department;
    }
    @GetMapping
    public List listDepts(){
        return departmentRepository.findAll();
    }

    public List findAll() {
        return mongoTemplate.findAll(Department.class);
    }

    @GetMapping("/{deptName}")
    public List findDeptByName(@PathVariable String deptName) {
        return departmentRepository.findDepartmentByName(deptName);
    }
    @GetMapping("{name}/emp")
    public Department listDept(@PathVariable String name){
        return departmentRepository.findDepartmentByEmployeeName(name);
    }
    @PutMapping("/{deptId}")
    public Department updateDept(@RequestBody Department department, @PathVariable String deptId) {
        department.setId(deptId);
        departmentRepository.save(department);
        return department;
    }

    public List findDepartmentByName(String deptName){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(deptName));
        return mongoTemplate.find(query, Department.class);
    }
    public Department update(Department department){
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(department.getId()));
        Update update = new Update();
        update.set("name", department.getName());
        update.set("description", department.getDescription());
        return mongoTemplate.findAndModify(query, update, Department.class);
    }

    public Department save(Department department) {
        mongoTemplate.save(department);
        return department;
    }
    @DeleteMapping("/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
        departmentRepository.deleteById(deptId);
        return deptId;
    }
}
