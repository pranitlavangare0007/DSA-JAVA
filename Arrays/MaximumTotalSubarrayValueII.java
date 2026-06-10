package Arrays;

public class MaximumTotalSubarrayValueII {

    public static long maxTotalValue(int[] nums, int k) {
        int min[] = new int[nums.length];
        int max[] = new int[nums.length];

        min[nums.length - 1] = nums[nums.length - 1];
        max[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
            max[i] = Math.max(nums[i], max[i + 1]);
        }

        for(int n:max){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n:min){
            System.out.print(n+" ");
        }
        long ans=0;
        for(int i=0;i<k;i++){
            ans += max[i] - min[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1,3,2 }, k = 2;
        System.out.println(maxTotalValue(nums, k));
    }
}
