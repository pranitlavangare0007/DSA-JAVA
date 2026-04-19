package Arrays;

public class SubArraysOfArray {


    // Brute force 
    public static void subArrays(int[] arr){
        int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] +" ");
                    sum += arr[k];
                    
                }
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
                System.out.println( "sum is : "+sum);
                
                System.out.println();
            }
        }
        System.out.println("min is : "+min);
        System.out.println("max is : "+max);
    }


    // kadans algorithem

    public static void kadansAlgo(int arr[]){

        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        int isNegative=Integer.MIN_VALUE;
        boolean allNegative = true;


        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 0){
                allNegative = false;
            }
            isNegative = Math.max(isNegative, arr[i]);
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
           maxSum = Math.max(maxSum, currentSum);
        }
        if(allNegative){
            maxSum=isNegative;
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int[] arr ={-1,-2,-3,-4};
        // subArrays(arr);
        kadansAlgo(arr);
    }
    
}
