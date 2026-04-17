package Arrays;

public class BinarySearch {
public static int binarySearch(int[] arr,int target){

   int mid=0;
   int left=0;
   int right = arr.length;

   while(left < right){
    mid= (left+right)/2;
    if(arr[mid] == target){
        return mid;
    }else if(arr[mid] < target){
       mid =left;
        left++;
    }
    else{
       mid = right;
        right--;
    }
   }
   return -1;

}
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int target=8;
        System.out.println(binarySearch(arr, target));
    }
    
}
