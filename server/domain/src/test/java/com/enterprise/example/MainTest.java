package com.enterprise.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnHello() {
        assertEquals("Hello World!", Main.Greetings());
    }
}