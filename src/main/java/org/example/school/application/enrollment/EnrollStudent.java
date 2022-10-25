package org.example.school.application.enrollment;

import org.example.school.domain.student.Student;
import org.example.school.domain.student.StudentRepository;

public class EnrollStudent {

    private final StudentRepository repository;

    public EnrollStudent(StudentRepository repository) {
        this.repository = repository;
    }

    public void enroll(StudentDto studentDto) {
        Student student = studentDto.toStudent();
        repository.enroll(student);
    }
}
