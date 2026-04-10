package Loops;
import java.util.Scanner;

public class SumOfEvenOddInt {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    
    int evenSum = 0;
    int oddSum =0;
    int isContinue =1;

    do{
         System.out.print("Enter number : ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            evenSum += number;
        }else{
            oddSum += number;
        }
        System.out.println("to continue press 1 else to exit press 0");
         isContinue = sc.nextInt();
    }while(isContinue ==1);

    System.out.println("sum of even numbers : "+evenSum);
    System.out.println("sum of odd numbers : "+oddSum);

}   
}
