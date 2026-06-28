class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        int ans[] =new int[n];
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int idx=0;

        while(i < n && j<n ){
            int alice=nums[i];
            int bob=nums[j];
            ans[idx]=bob;
            idx++;
            ans[idx]=alice;
            i=i+2;
            j=j+2;
            idx++;
        }
        return ans;
    }
}