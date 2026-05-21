package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestCommonPrefix {
    
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set1=  new HashSet<>();

        for(int i=0;i<arr1.length;i++){

            int prefix =arr1[i];

            while(prefix > 0){

               
                    set1.add(prefix);
                
               
                prefix /= 10;
            }
        }
       
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++){
            int prefix=arr2[i];

            while (prefix > 0) {

                if(set1.contains(prefix)){
                    max=Math.max(max,String.valueOf(prefix).length());
                }
                prefix /= 10;

                
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr1[] = {1,10,100}, arr2[] = {1000};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
}
