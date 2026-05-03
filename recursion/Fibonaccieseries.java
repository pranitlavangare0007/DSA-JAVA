package recursion;

public class Fibonaccieseries {

    public static int fib(int n){
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }
       int fn_1=fib(n-1);
       int fn_2=fib(n-2);
       return fn_1+fn_2;
    }
    public static void main(String[] args) {
        System.out.println(fib(2));
    }
    
}
