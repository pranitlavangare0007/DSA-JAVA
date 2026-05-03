package recursion;

public class FirstOccuranceOfelementInarray {

    public static int firstOccurance(int arr[],int i,int key ){

        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return firstOccurance(arr, i+1, key);
        }

        return firstOccurance(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,4,5,1};
        System.out.println(firstOccurance(arr, 0, 5));
    }
}
