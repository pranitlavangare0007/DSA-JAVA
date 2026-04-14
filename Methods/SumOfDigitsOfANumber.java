package Methods;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static int sumOfDigits(int n){

        int sum=0;
while(n>0){
    int rem = n % 10;
    sum += rem;
    n /= 10;
}
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int res =sumOfDigits(number);
    System.out.println(res);
    }
    

}
