package org.example.level8kyu;

/*Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to milliseconds.*/

import java.time.Duration;

public class TimeToMillisecondConverter {

    public static int Past(int h, int m, int s) {

        return (h * 3600000) + (m * 60000) + (s * 1000);
    }

    public static int Past2(int h, int m, int s) {
        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
