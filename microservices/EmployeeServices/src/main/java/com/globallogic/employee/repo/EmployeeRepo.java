package com.globallogic.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.employee.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo  extends JpaRepository<EmployeeEntity, Long>{

}
