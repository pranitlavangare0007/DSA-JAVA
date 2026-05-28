package Arrays;

public class minimumAbsDiffBetweenTwoValues {
     public static int minAbsoluteDifference(int[] nums) {
        
       
        int min  = Integer.MAX_VALUE;
        for(int i=0 ;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){

                if(nums[i] == 1 && nums[j] == 2){
                    min=Math.min(min, Math.abs(i-j));
                }
            }
        }
        return min == Integer.MAX_VALUE?-1:min;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,2,0,1};
        System.out.println(minAbsoluteDifference(arr));
    }
}
