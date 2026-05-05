package Strings;

public class LongestSubstringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
    boolean[] arr = new boolean[256];

    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {

        while (arr[s.charAt(right)]) {
            arr[s.charAt(left)] = false;
            left++;
        }

        arr[s.charAt(right)] = true;
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
    public static void main(String[] args) {
        String p="pwwkew";
        System.out.println(lengthOfLongestSubstring(p));
       
    }
}
