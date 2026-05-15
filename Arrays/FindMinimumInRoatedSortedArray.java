package Arrays;

public class FindMinimumInRoatedSortedArray {
     public static int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;

        for(int i=1;i<nums.length;i++){
            System.out.println(nums[i-1] + " "+ nums[i]);
            if(nums[i-1] > nums[i]){
                if(nums[low] > nums[i]){
                     low=i;
                }
               
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
