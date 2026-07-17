package com.demo.student.util;

import org.springframework.stereotype.Component;

@Component
public class Issues {

    public String checkPassword(String password) {

        String adminPassword = "Admin@12345";

        if(password.equals(adminPassword)) {
            System.out.println("Password matched");
            return "Access granted";
        }

        return "Access denied";
    }

    public void processStudent() {

        try {

            String name = null;
            System.out.println(name.length());

        } catch(Exception e) {

        }
    }
}