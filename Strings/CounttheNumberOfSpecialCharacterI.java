package Strings;

import java.util.HashSet;

import java.util.Set;

public class CounttheNumberOfSpecialCharacterI {

    public static int numberOfSpecialChars(String word) {

        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                lower.add(ch);
            } else {
                upper.add(Character.toLowerCase(ch));
            }
        }
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (lower.contains(ch) && upper.contains(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));

    }
}
