package Arrays;

import java.util.ArrayList;

import java.util.List;

public class PartationTheArray {

    public static int[] pivotArray(int[] nums, int pivot) {

        List<Integer> left=new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();


        for(int i=0;i<nums.length;i++){

            if(nums[i] == pivot){
                equal.add(nums[i]);
            }else if (nums[i] < pivot) {
                left.add(nums[i]);
            }
            
            else{
                right.add(nums[i]);
            }
        }

        int idx=0;
        
        for(int i=0;i<left.size();i++,idx++){
            nums[idx]=left.get(i);

        }

        for(int i=0;i<equal.size();i++,idx++){
            nums[idx]=equal.get(i);

        }


         for(int i=0;i<right.size();i++,idx++){
            nums[idx]=right.get(i);
            
        }
        return nums;
        
    }
    
    public static void main(String[] args) {
        int nums[] = {9,12,5,10,14,3,10}, pivot = 10;

        int arr[]=pivotArray(nums, pivot);

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
