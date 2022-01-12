package com.example.springbootrestapistudent1.controller;

import com.example.springbootrestapistudent1.model.Cat;
import com.example.springbootrestapistudent1.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test() {
        catRepository.save(new Cat(1, "Baxie"));
        return "ok";
    }
}
