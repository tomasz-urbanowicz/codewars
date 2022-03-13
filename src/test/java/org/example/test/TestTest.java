package org.example.test;


import org.example.level7kyu.Test;
import org.junit.jupiter.api.Assertions;

class TestTest {

    @org.junit.jupiter.api.Test
    public void check_single_digit_number() {
        Assertions.assertEquals("Special!!", Test.specialNumber(2));
        Assertions.assertEquals("Special!!", Test.specialNumber(3));
        Assertions.assertEquals("NOT!!", Test.specialNumber(9));
        Assertions.assertEquals("NOT!!", Test.specialNumber(7));
    }

    @org.junit.jupiter.api.Test
    public void check_two_digit_number() {
        Assertions.assertEquals("Special!!", Test.specialNumber(23));
        Assertions.assertEquals("NOT!!", Test.specialNumber(79));
        Assertions.assertEquals("Special!!", Test.specialNumber(32));
        Assertions.assertEquals("NOT!!", Test.specialNumber(39));
        Assertions.assertEquals("Special!!", Test.specialNumber(55));
    }

    @org.junit.jupiter.api.Test
    public void check_three_digit_number() {
        Assertions.assertEquals("Special!!", Test.specialNumber(513));
        Assertions.assertEquals("NOT!!", Test.specialNumber(709));
        Assertions.assertEquals("NOT!!", Test.specialNumber(538));
    }

    @org.junit.jupiter.api.Test
    public void check_large_number() {
        Assertions.assertEquals("Special!!", Test.specialNumber(513));
        Assertions.assertEquals("NOT!!", Test.specialNumber(970569));
        Assertions.assertEquals("Special!!", Test.specialNumber(11350224));
    }
}