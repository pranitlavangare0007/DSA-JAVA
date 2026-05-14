package Arrays;

import java.util.Arrays;

public class MaximumGap {

     public static int maximumGap(int[] nums) {
        int maxGap=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]  - nums[i] > maxGap){
                maxGap=nums[i+1]  - nums[i];
            }
        }
        return maxGap;
    }
    public static void main(String[] args) {
        int arr[]={3,6,9,1};
        System.out.println(maximumGap(arr));
    }
}
