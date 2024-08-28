package org.example.jpatest.repositories;

import org.example.jpatest.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneTim() {
        List<Student> list = studentRepository.findAllByName("Tim");
        assertEquals(0, list.size());
    }

    @Test
    void testOneJohn() {
        List<Student> list = studentRepository.findAllByName("John");
        assertEquals(1, list.size());
    }

}