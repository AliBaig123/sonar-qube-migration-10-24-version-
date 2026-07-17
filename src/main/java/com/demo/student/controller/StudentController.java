package com.demo.student.controller;

import com.demo.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }
}