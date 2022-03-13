package org.example.level7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {

    @Test
    public void evenTests() {
        assertEquals("dd", MiddleChar.getMiddle("middle"));
        assertEquals("es", MiddleChar.getMiddle("test"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleChar.getMiddle("testing"));
        assertEquals("A", MiddleChar.getMiddle("A"));
    }

}