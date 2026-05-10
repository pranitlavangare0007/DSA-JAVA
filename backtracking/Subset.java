package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
     public static void helper(int[] nums, int i,
                       List<Integer> current,
                       List<List<Integer>> result) {

       
        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

       
        current.add(nums[i]);
        helper(nums, i + 1, current, result);

       
        current.remove(current.size() - 1);

        
        helper(nums, i + 1, current, result);
    }
     public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), result);

        return result;
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    subsets(arr);
}
}
