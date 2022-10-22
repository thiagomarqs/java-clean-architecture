package org.example;

import java.util.List;

public class Student {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Phone> phones;

    public Student() {}

    public Student(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void addPhone(String ddd, String phone) {
        this.phones.add(new Phone(ddd, phone));
    }
}
