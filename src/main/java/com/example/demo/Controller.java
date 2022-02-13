package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/get")
    public List<Student> get(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        repo.save(student);
        return "Added successfully...";
    }

    @GetMapping("/find/{id}")
    public Optional<Student> getOne(@PathVariable int id){
        return repo.findById(id);
    }



    
    
}
