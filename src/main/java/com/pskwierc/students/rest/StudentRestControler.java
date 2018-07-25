package com.pskwierc.students.rest;

import com.pskwierc.students.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestControler {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Adam", "Abacki"));
        students.add(new Student("Barbara", "Babacki"));
        students.add(new Student("Czeslaw", "Cabacki"));

        return students;

    }
}
