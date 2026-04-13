package Loops;
import java.util.Scanner;

public class NumberIsPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int duplicate = number;
        int rev=0;
        
        while(duplicate > 0){
            int rem = duplicate % 10;
            rev = (rev*10)+rem;
            duplicate /= 10;
        }
        if(number == rev){
            System.out.println("number is palindrom");

        }
        else{
            System.out.println("number is not palindrom");
        }

    }
}
