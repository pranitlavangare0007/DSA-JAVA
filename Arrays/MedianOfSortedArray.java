package Arrays;

public class MedianOfSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int sorted[]=new int[n+m];

        int i=n-1;
        int j=m-1;
        int idx=sorted.length-1;


        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                sorted[idx]=nums1[i];
                i--;
                idx--;
            }else{
                sorted[idx]=nums2[j];
                j--;
                idx--;
            }
        }

        while(i >=0 ){
            sorted[idx]=nums1[i];
            i--;
            idx--;
        }

         while(j >=0 ){
            sorted[idx]=nums1[j];
            j--;
            idx--;
        }

       if(sorted.length == 1) return sorted[0];
       if(sorted.length == 2) return (double)(sorted[0] + sorted[1]) / 2;

       if(sorted.length % 2 == 0){
        int mid = (0 + sorted.length-1)/2;

        return (double)(sorted[mid] + sorted[mid+1])/2;
       }
       else{
        int mid=(0+sorted.length-1)/2;
        return sorted[mid];
       }
       
    }
    public static void main(String[] args) {
        int arr[] ={1,2} , arr2[]={3,4};

        System.out.println(findMedianSortedArrays(arr, arr2));
    }
}
