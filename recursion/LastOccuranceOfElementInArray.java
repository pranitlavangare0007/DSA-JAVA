package recursion;

public class LastOccuranceOfElementInArray {

    public static int lastOccuranceOfElementInArray(int arr[] , int key,int i){
        if(i == arr.length){
            return -1;
        }

        int isFound= lastOccuranceOfElementInArray(arr, key, i+1);

        if (isFound == -1 && arr[i] == key) {
            return i;
            
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,8,7,5};
        System.out.println(lastOccuranceOfElementInArray(arr, 2, 0));

    }
}
