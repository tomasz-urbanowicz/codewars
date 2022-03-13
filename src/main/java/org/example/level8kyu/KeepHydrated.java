package org.example.level8kyu;


public class KeepHydrated {

    public int Liters(double time) throws IllegalAccessException {

        if (time < 0) throw new IllegalAccessException("Negative number! Please provide correct data");

        int result = (int) (Math.floor(time) * 0.5);
        return result;

    }

}