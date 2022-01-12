package com.example.springbootrestapistudent1.repository;

import com.example.springbootrestapistudent1.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {
}
