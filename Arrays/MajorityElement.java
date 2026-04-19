package Arrays;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int baseSize = nums.length / 2;
        HashMap<Integer, Integer> hashtable = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(nums[i])) {
                hashtable.put(nums[i], hashtable.get(nums[i]) + 1);
            } else {
                hashtable.put(nums[i], 1);
            }
        }
       
       for(int key :hashtable.keySet()){
        if(hashtable.get(key) > baseSize){
            return key;
        }
       }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

}
