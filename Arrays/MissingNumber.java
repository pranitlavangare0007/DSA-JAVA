package Arrays;



public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int n=nums.length;
        int actualSum=n*(n+1)/2;
        int expectedSum=0;
        for(int i=0;i<n;i++){
            expectedSum += nums[i];
        }
            return actualSum-expectedSum;
    }
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
