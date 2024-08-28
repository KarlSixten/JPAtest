package org.example.jpatest.repositories;

import org.example.jpatest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByName(String name);
}
