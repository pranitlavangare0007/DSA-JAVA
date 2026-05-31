package greedyAlgo;

public class SplitAnArray {
    public static boolean isValid(int[] nums , int number , int k){

        int count =1;
        int sum=nums[0];

        for(int i=1;i<nums.length;i++){

            sum += nums[i];
            if(sum > number){
                sum = nums[i];
                count++;
            }
        }

        return count <= k;
    }
     public static int splitArray(int[] nums, int k) {
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            sum += nums[i];
        }
        int low=max , high=sum;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;

            if(isValid(nums,mid,k)){
                ans = mid;
                high = mid-1;
                
            }else{
                low = mid+1;
            }
            
        }
       
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {7,2,5,10,8}, k = 2;
        System.out.println(splitArray(nums, k));
    }
}
