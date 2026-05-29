package Arrays;

public class MinElement {

    public static int sum(int n){

        int sum=0;
        String str = String.valueOf(n);

        for(int i=0;i<str.length();i++) {
            int num = Character.getNumericValue(str.charAt(i));
            sum += num;
        }

        return sum;
    }
    public static int minElement(int[] nums) {

        int min=Integer.MAX_VALUE;
        for(int i=0 ;i<nums.length;i++ ){
            int n=nums[i];
            nums[i]=sum(n);
            
            min=Math.min(min, nums[i]);
        }
        return min;
        
    }
    public static void main(String[] args) {
        int arr[]={10,12,13,14};
        System.out.println(minElement(arr));

    }
}
