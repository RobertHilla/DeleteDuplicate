package com.isa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateTest {

    @Test
    void removeDuplicateWords() {
        assertEquals("alpha beta gamma delta", Duplicate.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", Duplicate.removeDuplicateWords("my cat is my cat fat"));
    }
}