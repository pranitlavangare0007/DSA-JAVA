package Strings;

import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;
        int freq[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int start = 0;
        int end = s1.length();
        int freq1[] = new int[26];

        for (int i = start; i < end; i++) {
            freq1[s2.charAt(i) - 'a']++;
        }
        while (end < s2.length()) {

            if (Arrays.equals(freq, freq1)) {
                return true;
            }

            freq1[s2.charAt(start) - 'a']--;
            freq1[s2.charAt(end) - 'a']++;

            start++;
            end++;

        }
         if (Arrays.equals(freq, freq1)) {
                return true;
            }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
