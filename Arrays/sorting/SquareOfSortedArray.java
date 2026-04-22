package Arrays.sorting;

public class SquareOfSortedArray {
     public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int index=res.length-1;

        int left=0;
        int right=nums.length-1;

        while(left <= right){
            int leftSquare=nums[left] * nums[left];
            int rigthSquare=nums[right]*nums[right];

            if(leftSquare < rigthSquare){
                res[index]=rigthSquare;
                right--;
                index--;
            }else{
                res[index]=leftSquare;
                left++;
                index--;
            }
        }

        return res;
        
    }
    public static void main(String[] args) {
         int arr[]={-4,-1,0,4,6};
       int[] res=  sortedSquares(arr);
       for(int n: res){
        System.out.print(n+" ");
       }

    }
    
}
