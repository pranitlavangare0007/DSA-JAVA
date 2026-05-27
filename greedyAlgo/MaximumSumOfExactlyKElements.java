package greedyAlgo;

import java.util.Arrays;

public class MaximumSumOfExactlyKElements {
    public static int maximizeSum(int[] nums, int k) {
        int prev =0;
        Arrays.sort(nums);

        for(int i=1;i<= k;i++){

            int number=nums[nums.length-1];

            prev += number;
            nums[nums.length-1]=number+1;
        }

        return prev;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int k=3;
        System.out.println(maximizeSum(nums, k));
    }
}
