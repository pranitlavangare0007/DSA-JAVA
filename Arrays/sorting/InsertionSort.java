package Arrays.sorting;

public class InsertionSort {
    

    public static void insertionnSort(int[] arr){

       
        for(int i=1;i<arr.length;i++){
            int j=i;
            while( j>0 && arr[j] < arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,4,6};
        insertionnSort(arr);
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
    
}
