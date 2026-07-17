package com.demo.student.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String getStudent(Long id) {

        if (id == null) {
            return "Invalid student id";
        }

        return "Student found with id: " + id;
    }
}