package com.example.crudApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee,Long> {
    
}