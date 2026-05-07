package divideAndConqurare;

public class SortAnArrayOfString {

    public static void sort(String arr[] , int si , int ei){

        if(si >= ei){
            return;

        }

        int mid = si + (ei-si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si , int mid , int ei){
        
        String temp[] = new String[ei-si+1];

        int i=si;
        int j=mid+1;
        int idx=0;

        while (i <= mid && j <= ei) {

            if(arr[i].compareTo( arr[j]) < 0){
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
         String  arr[] = { "sun", "earth", "mars", "mercury"};
    }
   
}
