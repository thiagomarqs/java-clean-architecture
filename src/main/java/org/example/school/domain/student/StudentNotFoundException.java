package org.example.school.domain.student;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String cpf) {
        super("Student with CPF " + cpf + " not found");
    }
}
