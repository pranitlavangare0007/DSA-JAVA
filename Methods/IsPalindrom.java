package Methods;

import java.util.Scanner;

public class IsPalindrom {
    public static boolean isPalindrom(int n){
          int duplicate = n;
        int rev=0;
        
        while(duplicate > 0){
            int rem = duplicate % 10;
            rev = (rev*10)+rem;
            duplicate /= 10;
        }
        if(n == rev){
           return true;
        }
       
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(isPalindrom(number));
       
    }
}
