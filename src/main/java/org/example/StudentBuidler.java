package org.example;

public class StudentBuidler {

    private Student student;

    public StudentBuidler withNameCPFEmail(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentBuidler withPhone(String ddd, String phone) {
        if(this.student == null) return this;
        this.student.addPhone(ddd, phone);
        return this;
    }

    public Student build() {
        return this.student;
    }

}
