package org.example.school.domain.student;

public interface PasswordCypher {

    String cypher(String password);

    boolean validate(String cypheredPassword, String password);

}
