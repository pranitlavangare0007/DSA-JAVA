package Arrays;

public class LargestNumberInArray {

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {44444444,4,84,55,95,4,44445};
        System.out.println(largest(arr));
    }
    
}
