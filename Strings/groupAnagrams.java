package Strings;

import java.util.Arrays;
import java.util.List;

public class groupAnagrams {

    
    public static void main(String[] args) {
        String arr[]={"eat","tea","tan","ate","nat","bat"};
        Arrays.sort(arr);
        for(String s : arr){
            System.out.print(s+" ");
        }
    }
}
