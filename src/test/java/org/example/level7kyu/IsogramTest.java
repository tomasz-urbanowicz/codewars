package org.example.level7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsogramTest {

    Isogram isogram = new Isogram();

    @Test
    public void FixedTests() throws IllegalAccessException {
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }

    @Test(expected = NullPointerException.class)
    public void testThrowException() throws IllegalAccessException {
        Isogram.isIsogram(null);
    }

}