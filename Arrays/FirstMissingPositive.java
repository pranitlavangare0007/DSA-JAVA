package Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {

            if (nums[i] >= 1 && nums[i] < nums.length) {

                if (nums[i] != nums[nums[i] - 1]) {
                    int correct = nums[i] - 1;

                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;

                }else{
                    i++;
                }

            }else{
                i++;
            }

        }
       
        for(int j=0;j<nums.length;j++){

            if(nums[j] != j+1){
                return j+1;
            }

        }
        return nums.length;

    }

    public static void main(String[] args) {
        int arr[] = { 3,4,-1,1 };
        System.out.println(firstMissingPositive(arr));
    }

}
