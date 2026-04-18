package Arrays;

public class RotateAnArray {
     public static void reveeseOfArray(int[] arr , int i ,int j){
       

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[], int d) {

        if(d > arr.length) d %= arr.length;

        reveeseOfArray(arr, 0, d-1);
        reveeseOfArray(arr, d, arr.length-1);
        reveeseOfArray(arr, 0, arr.length-1);
        

       
    }

    public static void main(String[] args) {
        int[] arr = {  1, 2, 3, 4,5 };
        rotate(arr, 6);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
