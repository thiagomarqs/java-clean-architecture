package org.example.school.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private CPF cpf;
    private String name;
    private Email email;
    private List<Phone> phones = new ArrayList<>();

    public Student() {}

    public Student(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.name = nome;
        this.email = email;
    }

    public void addPhone(String ddd, String phone) {
        this.phones.add(new Phone(ddd, phone));
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
