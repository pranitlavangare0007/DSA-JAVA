package Arrays;

public class FindMinimumInSortedRoatedArrayII {
     public static int findMin(int[] nums) {
        int low=0;
    

        for(int i=1;i<nums.length;i++){
           
            if(nums[i-1] > nums[i]){
                if(nums[low] > nums[i]){
                     low=i;
                }
               
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int arr[]={4,4,4,1,2};
        System.out.println(findMin(arr));
    }
}
