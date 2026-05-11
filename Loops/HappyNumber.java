package Loops;

import java.util.HashSet;

public class HappyNumber {

    public static int sumOfSquareOfAllDigits(int n){
        int newNum=0;
        while (n > 0) {
            int rem= n % 10;

            newNum += rem*rem;
             n /= 10;
        }

        return newNum;
    }
    
    public static boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumOfSquareOfAllDigits(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
