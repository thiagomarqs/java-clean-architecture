package org.example.school.domain.student;

import org.example.school.domain.student.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EmailTest {

    @Test
    void emailShouldBeValid() {
        assertDoesNotThrow(() -> new Email("teste@email.com.br"));
    }

    @Test
    void emailShouldBeInvalidIfNoTLD() {
        assertThrows(IllegalArgumentException.class, () -> new Email("teste@email"));
    }

    @Test
    void emailShouldBeInvalidIfNoAt() {
        assertThrows(IllegalArgumentException.class, () -> new Email("testeemail.com"));
    }
}