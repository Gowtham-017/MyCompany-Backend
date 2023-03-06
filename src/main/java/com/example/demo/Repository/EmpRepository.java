package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.EmpDetails;

@Repository
public interface EmpRepository extends JpaRepository<EmpDetails,Integer>{

}
