package Arrays;

public class MergeSortedArray {

     public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int index=m+n -1;
         int i=m-1;
         int j=n-1;

         while(i>= 0 && j>=0){

            if(nums1[i] <= nums2[j]){
                nums1[index]=nums2[j];
                index--;
                j--;
            }
            else{
                nums1[index]=nums1[i];
                i--;
                index--;
            }
         }

         while(j>=0){
            nums1[index]=nums2[j];
            index--;
            j--;
         }


    }
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int num2[]={2,5,6};
        int m=3;
        int n=3;

        merge(num1, m, num2, n);
        for(int i:num1){
            System.out.print(i+" ");
        }

    }
    
}
