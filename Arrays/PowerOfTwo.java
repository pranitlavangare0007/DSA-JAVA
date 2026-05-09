package Arrays;

public class PowerOfTwo {

     public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
       
        int ans =n;

      while(ans > 1 ){
        int rem = ans % 2;
       
        if(rem % 2 != 0  ){
            return false;
        }
        ans /= 2;
        
      }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
    
}
