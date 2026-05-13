package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static void helper(int[] nums, int index,
                       List<Integer> current,
                       List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

          
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);

            helper(nums, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), result);

        return result;
    }
    public static void main(String[] args) {
        
    }
}
