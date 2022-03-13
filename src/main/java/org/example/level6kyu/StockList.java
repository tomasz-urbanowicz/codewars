package org.example.level6kyu;

public class StockList {

    /**
     * Method
     *
     * @param listOfArt       is the stocklist (L in example),
     * @param listOf1stLetter is list of categories (M in example)
     * @return number of all books of lstOf1stLetter category
     */
    public static String stockSummary(String[] listOfArt, String[] listOf1stLetter) {
        String[] split = new String[listOfArt.length * 2];
        for (int i = 0; i < listOfArt.length; i++) {
            split = listOfArt[i].split(" ");
        }
        for (String s : split) {
            System.out.println(s);
        }

        // Map<String, Integer> lstOfArtMap;
        for (int i = 0; i < listOf1stLetter.length; i++) {
            for (int j = 0; j < listOfArt.length; j++) {

            }
        }
        // your code here
        return "...";
    }
}
