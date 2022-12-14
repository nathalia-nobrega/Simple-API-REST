package com.nnobrega.userdept.repositories;

import com.nnobrega.userdept.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
