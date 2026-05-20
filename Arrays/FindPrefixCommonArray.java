package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPrefixCommonArray {
     public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;

        int res[] = new int[n];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB =new HashSet<>();


        int count = 0;

        for(int i=0;i<n;i++){

            setA.add(A[i]);
            setB.add(B[i]);

            if(setB.contains(A[i])){
                count++;
            }
             if (A[i] != B[i] && setA.contains(B[i])) {
                count++;
            }
            res[i]=count;
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]= {1,3,2,4}, B[] = {3,1,2,4};
        int res[]=findThePrefixCommonArray(a, B);

        for(int n:res){
            System.out.print(n+" ");
        }
    }
}
