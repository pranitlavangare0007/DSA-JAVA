package Arrays;

public class ProductOfArrayExceptSelf {

     public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i] *= nums[i];
        }

        
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
    }
}