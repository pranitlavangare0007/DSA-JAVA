package Strings;

import java.util.Arrays;

public class CountTheNumberOfSpecialCharsII {

    public static int numberOfSpecialChars(String word) {
        int count = 0;

        int lower[] = new int[26];
        int upper[] = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i;

            } else {
                int idx = Character.toLowerCase(ch) - 'a';

                if (upper[idx] == -1) {
                    upper[idx] = i;
                }
            }

        }

        for (int i = 0; i < lower.length; i++) {
            if (lower[i] != -1 && upper[i] != -1 && upper[i] > lower[i]) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "AbBCab";
        System.out.println(numberOfSpecialChars(word));
    }
}
