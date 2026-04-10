package Loops;
import java.util.Scanner;

public class MultiplicationTableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(i*number);
        }
    }
}
