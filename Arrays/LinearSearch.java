package Arrays;

public class LinearSearch {
    public static int linearSearchDemo(String arr[] , String target){

        for(int i=0 ;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }

            return -1;
    }
    public static void main(String[] args) {
        
        String str[]={"dosa","paniPuri","vadaPav","iceCream"};
        String target ="vadaPav";
        System.out.println(linearSearchDemo(str, target));
    }
    
}
