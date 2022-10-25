package org.example.school;

import org.example.school.application.enrollment.EnrollStudent;
import org.example.school.application.enrollment.StudentDto;
import org.example.school.domain.student.StudentRepository;
import org.example.school.infra.student.InMemoryStudentRepository;

import java.util.Scanner;

import static java.lang.System.out;

public class App {
    public static void main( String[] args ) {

        StudentRepository repository = new InMemoryStudentRepository();
        EnrollStudent enrollStudent = new EnrollStudent(repository);
        Scanner sc = new Scanner(System.in);

        out.println("\n**** Student enrollment ****\n");

        out.print("Enter the student's name: ");
        String name = sc.nextLine();

        out.print("Enter the student's CPF: ");
        String cpf = sc.nextLine();

        out.print("Enter the student's email: ");
        String email = sc.nextLine();

        StudentDto dto = new StudentDto(cpf, name, email);

        enrollStudent.enroll(dto);

    }
}
