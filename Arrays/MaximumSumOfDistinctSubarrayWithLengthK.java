package Arrays;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubarrayWithLengthK {

     public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum=0;
        long maxSum=0;

        int i=0;
        for(int j=0;j<nums.length;j++){
        while(set.contains(nums[j])){
            set.remove(nums[i]);
            sum -= nums[i];
            i++;
        }

        set.add(nums[j]);
        sum += nums[j];

        if(j-i+1 == k){
            maxSum=Math.max(maxSum, sum);
            set.remove(nums[i]);
            sum -= nums[i];
            i++;
        }

        }

        return maxSum;
    
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,2,9,9,9};
        int k=3;
System.out.println(maximumSubarraySum(arr, k));

    }
}
