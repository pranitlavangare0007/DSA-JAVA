package Arrays;

public class IsPerfectSquare {
    
     public static boolean isPerfectSquare(int num) {
        
        if(num == 1) return true;

        int left=0;
        int right=num/2;

        while(left <= right){
            int mid = left + (right- left)/2;
            int sq=mid*mid;
            System.out.println(sq);
            if(sq == num){
                return true;
            }
            else if( sq < num){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int  num = 808201;
        System.out.println(isPerfectSquare(num));
    }
}
