package com.ex01.rest.student;

import com.ex01.module.student.model.StudentInformationModel;
import com.ex01.module.student.repository.StudentInformationRepository;
import com.ex01.module.student.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

}
