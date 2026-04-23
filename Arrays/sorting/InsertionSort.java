package Arrays.sorting;

public class InsertionSort {
    

    public static void insertionnSort(int[] arr){

       
        for(int i=1;i<arr.length;i++){
            int prev=i-1;
            int current=arr[i];
            while( prev >= 0 && arr[prev] > current){
                arr[prev+1]=arr[prev];
                prev--;
              
            }
            arr[prev+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,-1,0,4,6};
        insertionnSort(arr);
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
    
}
