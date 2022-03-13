package org.example.level8kyu;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name == null) throw new NullPointerException("The text doesn't exist");
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
