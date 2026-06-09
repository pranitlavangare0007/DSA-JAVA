package Arrays;

public class MaximumSumOfSubarray {
    
    public static long maxTotalValue(int[] nums, int k) {
        Long max =Long.MIN_VALUE;
        Long min = Long.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            max=Math.max(max,  nums[i]);
            min=Math.min(min, nums[i]);
        }
        return k *(max - min);
    }
    public static void main(String[] args) {
       int  nums[] = {1,3,2}, k = 2;
       System.out.println(maxTotalValue(nums, k));
    }
}
