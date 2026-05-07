package Arrays;

public class ContainsDuplicateIII {

     public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if( i != j && Math.abs(i -j) <= indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
       int arr[]={1,5,9,1,5,9};
        int indexDiff = 2, valueDiff = 3;

        System.out.println(containsNearbyAlmostDuplicate(arr, indexDiff, valueDiff));
    }
}
