package com.globallogic.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.department.entity.DeptEntity;

@Repository
public interface DeptRepo extends JpaRepository<DeptEntity, Long> {

}
