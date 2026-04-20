package Arrays;

public class TwoSum {

    public static int[] twoSumii(int[] numbers, int target){


        int left=0;
        int right=numbers.length-1;

        while(left < right){
            int sum=numbers[left]+numbers[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }


        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
       int[] res= twoSumii(arr, target);
       for (int i : res) {
        System.out.print(i);
       }

    }
    
}
