package Arrays;



public class Arrays {
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int merged[] = new int[n+m];
        int idx=0;
        int n1=0;
        int n2=0;

        while(n1 < n && n2 < m){

            if(nums1[n1] < nums2[n2] ){
                merged[idx]=nums1[n1];
                n1++;
            }else{
                merged[idx]=nums2[n2];
              
                n2++;
            }
            idx++;
        }

        while(n1 < n){
            merged[idx]=nums1[n1];
                n1++;
                idx++;
        }
         while(n2 < m){
            merged[idx]=nums2[n2];
              
                n2++;
                idx++;
        }

        for(int l: merged){
            System.out.print(l+" ");
        }
        System.out.println();
       if(merged.length % 2 == 0){

       int mid = (0 + merged.length)/2;
       
       System.out.println(merged[mid] + " " +merged[mid+1] + " "+mid);
       return (merged[mid]+merged[mid-1] )/(double)2;
       
       }else{
         return merged[0+merged.length/2];

       }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2}, nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

       }
       
    }
    

