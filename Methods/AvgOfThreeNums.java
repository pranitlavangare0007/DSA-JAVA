package Methods;

import java.util.Scanner;

public class AvgOfThreeNums {
    public static double avgOfThree(int a,int b, int c){
        int total = a+b+c;
      return total/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        System.out.print("Enter third number : ");
        int num3=sc.nextInt();
        System.out.println("Avrage is : "+avgOfThree(num1, num2, num3));
    }
    
}
