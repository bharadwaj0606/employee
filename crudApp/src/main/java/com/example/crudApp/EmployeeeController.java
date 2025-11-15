package com.example.crudApp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeeController {
    @Autowired
    employeeRepository repo;

    @PostMapping("/employees")
    public employee create(@RequestBody employee e){
        return repo.save(e);
    }

    @GetMapping("/employees")
    public List <employee> getAll(){
        return repo.findAll();
    }

    @DeleteMapping("/employees/{id}") 
        public void delete(@PathVariable Long id){
         repo.deleteById(id);
        }
    
}