package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void cpfShouldBeValid() {
        assertDoesNotThrow(() -> new CPF("123.456.789-00"));
    }

    @Test
    void cpfShouldBeInvalidIfNotEnoughDigits() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("123.456.789-0"));
    }

    @Test
    void cpfShouldBeInvalidIfNoPunctuation() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678900"));
    }

}