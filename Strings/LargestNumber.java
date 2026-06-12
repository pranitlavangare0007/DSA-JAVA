package Strings;

import java.util.Arrays;

public class LargestNumber {
    
     public static String largestNumber(int[] nums) {

        String arr[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        
        Arrays.sort(arr,(a,b)-> (b+a).compareTo(a+b));

        StringBuilder ans = new StringBuilder();

        for(String s :arr){
            ans.append(s);
        }
        

        return ans.toString();
    }

    
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9}; 
        System.out.println(largestNumber(nums));
    }
}
