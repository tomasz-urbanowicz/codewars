package org.example.level8kyu;

import java.util.Arrays;
import java.util.Collections;

//A wolf in sheep's clothing
// Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend
// to be sheep. Fortunately, you are good at spotting them.
//Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of
// the queue which is at the end of the array:
//[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
//   7      6      5      4      3             2     1
// If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi!
// Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
//
// Note: there will always be exactly one wolf in the array.
public class ZywOo {

    public static String warnTheSheep(String[] array) {
        String result = "";
        int counter = 1;

        if (array == null) throw new NullPointerException("The array doesn't exist!");

        if (array.length == 0) return "The given array is empty";

        if (array[array.length - 1].equals("wolf")) {
            result = "Pls go away and stop eating my sheep";
        }

        for (int i = array.length - 1; i > 0; i--, counter++) {
            if (array[i].equals("sheep") && array[i - 1].equals("wolf")) {
                result = "Oi! Sheep number " + counter + "! You are about to be eaten by a wolf!";
            }
        }
        return result;
    }

    public static String warnTheSheep2(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }

    public static String warnTheSheep3(String[] array) {
        int wolfPos = Arrays.asList(array).indexOf("wolf") + 1;
        return wolfPos == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfPos) + "! You are about to be eaten by a wolf!";
    }

    public static String warnTheSheep4(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals("wolf")) {
                return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
            }
        }
        return "Pls go away and stop eating my sheep";
    }


}
