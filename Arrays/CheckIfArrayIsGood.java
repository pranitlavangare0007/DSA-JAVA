package Arrays;

import java.util.Arrays;

public class CheckIfArrayIsGood {

    public static boolean isGood(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n-2;i++){
           if(nums[i] == nums[i+1]){
            
            return false;
           }
        }
  
        if(nums[n-1] != n-1 || nums[n-1] != nums[n-2]){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={9,9};

        System.out.println(isGood(arr));
    }
}
