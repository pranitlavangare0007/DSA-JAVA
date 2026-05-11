package Arrays;

public class SeprateTheDigitInArray {

     public static int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<nums.length;i++){
            sb.append(String.valueOf(nums[i]));
        }

        int arr[]= new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            arr[i]=sb.charAt(i) - '0';
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int arr[]={13,25,83,77};

        int res[]=separateDigits(arr);
        for(int n:res){
            System.out.print(n+" ");
        }
    }
}
