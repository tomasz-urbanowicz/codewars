package org.example.level8kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeToMillisecondConverterTest {
    @Test
    public void test1(){
        assertEquals(61000, TimeToMillisecondConverter.Past(0,1,1));
        assertEquals(43860000 , TimeToMillisecondConverter.Past(12,11,0));

    }
}