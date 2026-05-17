package Arrays;

public class JumpGameII {
     public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int maxReach =0 ;
        int jumps = 0;
        int end=0;

        for(int i=0;i<nums.length-1;i++){

            maxReach = Math.max(maxReach, i + nums[i]);

            
            if (i == end) {
                jumps++;
                end = maxReach;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
