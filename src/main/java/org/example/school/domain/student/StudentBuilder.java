package org.example.school.domain.student;

public class StudentBuilder {

    private Student student = new Student();

    public StudentBuilder withNameCPFEmail(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentBuilder withPhone(String ddd, String phone) {
        this.student.addPhone(ddd, phone);
        return this;
    }

    public Student build() {
        return this.student;
    }

}
