package recursion;

public class PrintFactorialOfNumber {

    public static int factorial(int n){
        if(n==0){
           return 1;
        }
      int fn_1=  factorial(n-1);
     return  fn_1*n;  
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
