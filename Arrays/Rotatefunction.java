package Arrays;

public class Rotatefunction {

    // Brute force

    // public static void reveeseOfArray(int[] arr , int i ,int j){
       
    //     while(i<j){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }

    // public static void rotate(int arr[], int d) {

    //     if(d > arr.length) d %= arr.length;

    //     reveeseOfArray(arr, 0, d-1);
    //     reveeseOfArray(arr, d, arr.length-1);
    //     reveeseOfArray(arr, 0, arr.length-1);
       
    // }
    // public static int maxRotateFunction(int[] nums) {
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         int sum =0;
    //         for(int j=0;j<nums.length;j++){
    //             sum += (j * nums[j]);
    //         }
    //        max= Math.max(max, sum);
    //         rotate(nums, 1);

    //     }

    //     return max;
        
    // }

    // Optimized 

     public static int maxRotateFunction(int[] nums) {
        int f0 = 0;
        int sum =0;

        for(int i=0;i<nums.length;i++){
            f0 += i * nums[i];
            sum += nums[i];
        }

        int fk=f0;
        int fMax=f0;
        for(int k=1;k<nums.length;k++){
            fk= fk+sum - (nums.length * nums[nums.length-k]);
            fMax = Math.max(fMax, fk);
        }
        return fMax;
        
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        System.out.println(maxRotateFunction(arr));
    }
    
}
