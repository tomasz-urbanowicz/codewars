package org.example.level7kyu;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SpecialNumberTest {
    @org.junit.jupiter.api.Test
    public void check_single_digit_number() {
        assertEquals("Special!!", SpecialNumber.specialNumber(2));
        assertEquals("Special!!", SpecialNumber.specialNumber(3));
        assertEquals("NOT!!", SpecialNumber.specialNumber(9));
        assertEquals("NOT!!", SpecialNumber.specialNumber(7));
    }

    @org.junit.jupiter.api.Test
    public void check_two_digit_number() {
        assertEquals("Special!!", SpecialNumber.specialNumber(23));
        assertEquals("NOT!!", SpecialNumber.specialNumber(79));
        assertEquals("Special!!", SpecialNumber.specialNumber(32));
        assertEquals("NOT!!", SpecialNumber.specialNumber(39));
        assertEquals("Special!!", SpecialNumber.specialNumber(55));
    }

    @org.junit.jupiter.api.Test
    public void check_three_digit_number() {
        assertEquals("Special!!", SpecialNumber.specialNumber(513));
        assertEquals("NOT!!", SpecialNumber.specialNumber(709));
        assertEquals("NOT!!", SpecialNumber.specialNumber(538));
    }

    @org.junit.jupiter.api.Test
    public void check_large_number() {
        assertEquals("Special!!", SpecialNumber.specialNumber(513));
        assertEquals("NOT!!", SpecialNumber.specialNumber(970569));
        assertEquals("Special!!", SpecialNumber.specialNumber(11350224));
    }
}