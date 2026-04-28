package Arrays;


public class DuplicateNumber {

    public static int findDuplicate(int[] nums) {
       
        // int i=0;
        // while (i < nums.length) {

        //     for(int j=i+1;j< nums.length;j++){
                
        //         if( nums[i] == nums[j]){
        //             return nums[j];
        //         }
        //     }
        //     i++;
            
        // }
        // return -1;


        // Set<Integer> set = new HashSet<>();

        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return nums[i];
        //     }else{
        //         set.add(nums[i]);
        //     }
        // }

        // return -1;

        boolean[] isVisited= new boolean[nums.length];

        for(int n:nums){
            if(isVisited[n]){
                return n;
            }
            else{
                isVisited[n]=true;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }
}
