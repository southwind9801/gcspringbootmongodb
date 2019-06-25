package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentHandler {
    @Autowired
    private StudentRepository studentReposity;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentReposity.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") String id){
        return studentReposity.findById(id).get();
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentReposity.save(student);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentReposity.save(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") String id){
        studentReposity.deleteById(id);
    }
}
