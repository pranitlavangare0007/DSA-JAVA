import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        boolean isPrime=true;
        if(number<=1) {
            System.out.println("number is not prime");
            return;
        }
        for(int i =2;i<number;i++){
            if(number % i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
