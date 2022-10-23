package org.example.school.infra.student;

import org.example.school.domain.student.PasswordCypher;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class BcryptPasswordCypher implements PasswordCypher {

    @Override
    public String cypher(String password) {
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(password, salt);
    }

    @Override
    public boolean validate(String cypheredPassword, String password) {
        return BCrypt.checkpw(cypheredPassword, password);
    }

}
