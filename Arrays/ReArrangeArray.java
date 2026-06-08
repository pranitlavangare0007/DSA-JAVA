package Arrays;

public class ReArrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int positive[] = new int[nums.length / 2];
        int negative[] = new int[nums.length / 2];

        for (int i = 0, neg = 0, pos = 0; i < nums.length; i++) {

            int num = nums[i];

            if (num > 0) {
                positive[pos] = num;
                pos++;
            } else {
                negative[neg] = num;
                neg++;
            }
        }
        int pos = 0;
        int neg = 0;
        int idx = 0;

        while (pos < positive.length && neg < negative.length) {
            nums[idx] = positive[pos];
            idx++;
            pos++;
            nums[idx] = negative[neg];
            idx++;
            neg++;

        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };

        int arr[] = rearrangeArray(nums);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
