package org.example.school.infra.student;

import org.example.school.domain.student.CPF;
import org.example.school.domain.student.Student;
import org.example.school.domain.student.StudentNotFoundException;
import org.example.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository  {

    private List<Student> students = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.students.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.students
            .stream()
            .filter(s -> s.getCpf().equals(cpf.getCpf()))
            .findFirst()
            .orElseThrow(() -> new StudentNotFoundException(cpf.getCpf()));
    }

    @Override
    public List<Student> findAllEnrolledStudents() {
        return this.students;
    }

}
