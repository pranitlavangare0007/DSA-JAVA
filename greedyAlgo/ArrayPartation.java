package greedyAlgo;

import java.util.Arrays;

public class ArrayPartation {
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
    

        int i = 0;
       
        while ( i < nums.length) {
            sum +=nums[i];
            i=i+2;
           
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 6, 5, 1, 2 };
        System.out.println(arrayPairSum(arr));
    }
}
