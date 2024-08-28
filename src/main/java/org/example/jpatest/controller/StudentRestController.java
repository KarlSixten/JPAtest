package org.example.jpatest.controller;

import org.example.jpatest.model.Student;
import org.example.jpatest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        var obj = studentRepository.findAll();
        return obj;
    }

    @GetMapping("/addstudent")
    public void addStudent() {
        studentRepository.save(new Student("Alex Johnson", LocalDate.of(2005, 4, 12), LocalTime.of(14, 35, 45)));
        studentRepository.save(new Student("Taylor Smith", LocalDate.of(2006, 7, 23), LocalTime.of(9, 15, 30)));
        studentRepository.save(new Student("Jordan Davis", LocalDate.of(2004, 11, 6), LocalTime.of(8, 45, 20)));
        studentRepository.save(new Student("Morgan Brown", LocalDate.of(2007, 3, 18), LocalTime.of(16, 22, 10)));
        studentRepository.save(new Student("Casey Wilson", LocalDate.of(2005, 9, 30), LocalTime.of(12, 10, 5)));
        studentRepository.save(new Student("Jamie Lee", LocalDate.of(2006, 2, 14), LocalTime.of(11, 55, 40)));
        studentRepository.save(new Student("Riley Clark", LocalDate.of(2004, 8, 25), LocalTime.of(13, 47, 35)));
        studentRepository.save(new Student("Avery Lewis", LocalDate.of(2007, 6, 12), LocalTime.of(10, 25, 15)));
        studentRepository.save(new Student("Peyton Walker", LocalDate.of(2005, 1, 7), LocalTime.of(17, 18, 50)));
        studentRepository.save(new Student("Quinn Young", LocalDate.of(2006, 10, 19), LocalTime.of(7, 33, 25)));
        studentRepository.save(new Student("Drew Martinez", LocalDate.of(2004, 5, 3), LocalTime.of(15, 5, 10)));
        studentRepository.save(new Student("Skylar Allen", LocalDate.of(2007, 12, 28), LocalTime.of(18, 40, 55)));
        studentRepository.save(new Student("Harper Hill", LocalDate.of(2005, 3, 15), LocalTime.of(9, 20, 0)));
        studentRepository.save(new Student("Charlie Adams", LocalDate.of(2006, 11, 4), LocalTime.of(14, 50, 30)));
        studentRepository.save(new Student("Rowan White", LocalDate.of(2004, 7, 9), LocalTime.of(16, 15, 45)));
    }

    @GetMapping("students/{name}")
    public List<Student> getAllStudentsByName (@PathVariable String name) {
        return studentRepository.findAllByName(name);
    }
}
