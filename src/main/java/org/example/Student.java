package org.example;

import java.util.List;

public class Student {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Phone> phones;

    public void addPhone(String ddd, String phone) {
        this.phones.add(new Phone(ddd, phone));
    }
}
