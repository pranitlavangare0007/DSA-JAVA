package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

     public static void helper(int[] nums, 
                       List<Integer> current,
                       List<List<Integer>> result, boolean used[]) {

       
        if ( nums.length == current.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){


            if(used[i]){
                continue;
            }

            used[i]=true;
            int curr=nums[i];
            current.add(curr);

            helper(nums, current, result, used);

            current.remove(current.size() - 1);
            used[i] = false;

            
        }

    }

     public static List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         boolean used[] = new boolean[nums.length];


          helper(nums, new ArrayList<>(), result,used);

        return result;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3};
       List<List<Integer>> ans = permute(arr);

       System.out.println(ans);
    }
}
