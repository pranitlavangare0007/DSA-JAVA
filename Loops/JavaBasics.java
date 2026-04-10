package Loops;
import java.util.Scanner;

class JavaBasics{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    //   int a = sc.nextInt();
    //   int b = sc.nextInt();
    //   int c = sc.nextInt();
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();



    //   int sum = a+b+c;

    //   double avg = sum/3;
    // int square = c *c;
    float bill = pencil+pen+eraser;
    float billWithgst =(bill * 0.18f) + bill;
      System.out.println(billWithgst);
      int $ = 10;
      System.out.println($);
    }
}