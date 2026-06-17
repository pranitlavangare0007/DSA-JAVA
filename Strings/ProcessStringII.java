package Strings;

public class ProcessStringII {
    public static char processStr(String s, long k) {
        long len = 0;

       
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                len++;
            } else if (ch == '*') {
                if (len > 0) len--;
            } else if (ch == '#') {
                len *= 2;
            }
           
        }

        if (k < 0 || k >= len) {
            return '.';
        }

       
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                if (k == len - 1) {
                    return ch;
                }
                len--;
            }
            else if (ch == '*') {
                len++;
            }
            else if (ch == '#') {
                long half = len / 2;
                k %= half;
                len = half;
            }
            else if (ch == '%') {
                k = len - 1 - k;
            }
        }

        return '.';
    }

    public static void main(String[] args) {
        String s = "a#b%*";
        long k = 1;
        System.out.println(processStr(s, k));

    }
}
