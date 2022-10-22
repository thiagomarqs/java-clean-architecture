package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void shouldBeValid() {
        assertDoesNotThrow(() -> new Phone("22", "10000000"));
        assertDoesNotThrow(() -> new Phone("11", "222222221"));
    }

    @Test
    void shouldBeInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Phone("333", "10000000"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("11", "2222222211"));
    }

}