package org.example.school.application.enrollment;

import org.example.school.domain.student.CPF;
import org.example.school.domain.student.Email;
import org.example.school.domain.student.Student;

public class StudentDto {

    private String cpf;
    private String name;
    private String email;

    public StudentDto(String cpf, String name, String email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public Student toStudent() {
        return new Student(new CPF(cpf), name, new Email(email));
    }
}
