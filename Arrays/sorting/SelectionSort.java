package Arrays.sorting;

public class SelectionSort {

    public static void selection(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minimum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                    
                }
                int temp=arr[minimum];
                arr[minimum]=arr[i];
                arr[i]=temp;
            }
        }

    }
    public static void main(String[] args) {
         int arr[]={5,8,6,655,64556,1};
        selection(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
