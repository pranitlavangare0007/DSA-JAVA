package Strings;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        StringBuilder sb[] = new StringBuilder[numRows];

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int row = 0;
        int dir = 1;
        int i = 0;
        while (i < s.length()) {

            sb[row].append(s.charAt(i));
            row = row + dir;

            if (row == numRows - 1) {
                dir = -1;
            }
            if (row == 0) {
                dir = 1;
            }
            i++;

        }
        StringBuilder ans =  new StringBuilder();

        for (int j = 0; j < sb.length; j++) {
           ans.append(sb[j]);
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    }
}
