package Arrays;

public class DuplicateNumber {

    public static int findDuplicate(int[] nums) {
        
int i=0;
int j=nums.length-1;
int res=0;
while (i<j) {
res ^= nums[i] ^ nums[j];

i++;
j--;
    
}

        return res;
    }

    public static void main(String[] args) {
        int arr[]={3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
