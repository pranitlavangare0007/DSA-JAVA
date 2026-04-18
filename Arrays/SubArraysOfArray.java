package Arrays;

public class SubArraysOfArray {

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
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4};
        subArrays(arr);
    }
    
}
