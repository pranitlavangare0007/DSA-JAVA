package Arrays;


import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        Integer arr[]={3,5,5,7,8,9,1,2,3};
        java.util.Arrays.sort(arr,Collections.reverseOrder());

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    
}
