class Solution {
    public int[] sortArrayByParityII(int[] nums) {
            int n = nums.length;
    int[] ans = new int[n];

    int i = 0; 
    int j = 0; 

    for (int idx = 0; idx < n; idx++) {

        if (idx % 2 == 0) {
           
            while (i < n && nums[i] % 2 != 0) {
                i++;
            }
            ans[idx] = nums[i];
            i++; 
        } else {
           
            while (j < n && nums[j] % 2 == 0) {
                j++;
            }
            ans[idx] = nums[j];
            j++; 
        }
    }

    return ans;
    }
}