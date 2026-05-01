package Loops;

public class ReverseInteger {
    public static int reverse(int x) {
       int duplicate = x;
        int rev=0;
        x = Math.abs(x);
        while(x > 0){
            int rem = x % 10;
            rev = (rev*10)+rem;
            x /= 10;
        }
        if(duplicate <0){
            rev= -rev;
            if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
                rev=0;
            }
        }

        return rev ;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
