package Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

       int number=0;
        for(int num : nums){
            number ^= num;
        }
        
        return number;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1};
        System.out.println(singleNumber(arr));
    }
    
}
