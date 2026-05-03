package Arrays;

public class MaximumAverageOfSubArrayI {

    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        

        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        
        int i=0;
        int j=k;
        int maxSum=sum;
       
        while (j < nums.length) {

            sum -= nums[i];
            sum += nums[j];

            maxSum=Math.max(sum, maxSum);
           
            i++;
            j++;
            
        }

        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        int arr[]={1,12,-5,-6,50,3};
        int k=4;

        System.out.println(findMaxAverage(arr, k));
    }
    
}
