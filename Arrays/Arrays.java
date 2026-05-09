package Arrays;


import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        // Integer arr[]={3,5,5,7,8,9,1,2,3};
        // java.util.Arrays.sort(arr,Collections.reverseOrder());

        // for(int n:arr){
        //     System.out.print(n+" ");
        // }
        // System.out.println((double)5/2);
       String s= "   fly me   to   the moon  ";
        String[] new1 = s.trim().split("\\s+");

        System.out.println(new1[new1.length-1].length()); 

       for(String s1 : new1){
System.out.println(s1+" ");
       }
       
    }
    
}
