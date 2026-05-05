package Strings;

import java.util.Arrays;

public class RotateString {
    public static void reveeseOfArray(char[] arr, int i, int j) {

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        char[] res = goal.toCharArray();
        int i = 0;
         if (arr.equals(res)) {
                return true;
            }
        while (i < arr.length) {
            reveeseOfArray(arr, 0, 0);
            reveeseOfArray(arr, 1, arr.length - 1);
            reveeseOfArray(arr, 0, arr.length - 1);

            if (Arrays.equals(arr, res)) {
                return true;
            }
            i++;
        }
       
        return false;

    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

}
