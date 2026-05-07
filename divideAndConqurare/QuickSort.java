package divideAndConqurare;

public class QuickSort {

    public static void quickSort(int arr[] , int si , int ei){

        if( si >= ei){
            return;
        }

        int pidx = partation(arr, si ,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);

    }

    public static int partation(int arr[] , int si , int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if( arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={5,6,2,8,1,-1};
       quickSort(arr, 0, arr.length-1);

       for(int n:arr){
        System.out.print(n+" ");
       }
    }
}
