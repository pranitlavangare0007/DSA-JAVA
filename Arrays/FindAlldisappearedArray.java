package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAlldisappearedArray {

     public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean arr[]= new boolean[nums.length];

       

        for(int i=0;i<nums.length;i++){
           
                arr[nums[i]-1]=true;
               
        }
        for(int i=0;i<nums.length;i++){
            
            if(arr[i] == false){
                list.add(i+1);
            }
        }

        return list;
         
    }
    
    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
