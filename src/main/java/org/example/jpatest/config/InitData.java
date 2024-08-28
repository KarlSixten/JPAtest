package org.example.jpatest.config;

import org.example.jpatest.model.Student;
import org.example.jpatest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student();
        student1.setName("Aleksander");
        student1.setBornDate(LocalDate.of(2000, 1, 2));
        student1.setBornTime(LocalTime.of(5, 9, 30));
        studentRepository.save(student1);

        student1.setName("John");
        studentRepository.save(student1);


        Student student2 = new Student();
        student2.setName("Ikke Aleksander");
        student2.setBornDate(LocalDate.of(2000, 1, 2));
        student2.setBornTime(LocalTime.of(5, 9, 30));
        studentRepository.save(student2);
    }
}
