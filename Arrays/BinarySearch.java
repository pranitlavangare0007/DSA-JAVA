package Arrays;

public class BinarySearch {
public static int binarySearch(int[] arr,int target){

   int mid=0;
   int left=0;
   int right = arr.length-1;

   while(left <= right){
    mid= (left+right)/2;
    if(arr[mid] == target){
        return mid;
    }else if(arr[mid] < target){
       left = mid +1;
       
    }
    else{
      right = mid -1;
        
    }
   }
   return -1;

}
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int target=1;
        System.out.println(binarySearch(arr, target));
    }
    
}
