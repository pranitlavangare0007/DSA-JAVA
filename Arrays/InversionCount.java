package Arrays;

public class InversionCount {

       public static void sort(int arr[] , int si , int ei){

        if(si >= ei){
            return;

        }

        int mid = si + (ei-si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si , int mid , int ei){
        
        int temp[] = new int[ei-si+1];

        int i=si;
        int j=mid+1;
        int idx=0;

        while (i <= mid && j <= ei) {

            if(arr[i] < arr[j]){
                temp[idx] = arr[i];
                i++;
            }else{
                temp[idx] = arr[j];
                j++;
            }
            idx++;
            
        }

        while (i <= mid) {
            temp[idx++] = arr[i++];
        }
        while (j <= ei) {
            temp[idx++] = arr[j++]; 
        }

        for( int k=0,l=si;k<temp.length;k++,l++){
            arr[l]=temp[k];
        }

        
    }

    public static void main(String[] args) {
        
    }
}
