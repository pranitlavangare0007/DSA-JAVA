package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartation {

     public static boolean isPalindrome(String s) {
        StringBuilder updated = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                updated.append(Character.toLowerCase(s.charAt(i)));
            }
        }
       
        int i=0;
        int j= updated.length()-1;

        while (i < j) {

            if(updated.charAt(i) != updated.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }

        return true;
    }

     public static void subset(String s , String ans , int i,List<List<String>> result){

        if(i == s.length()){

            if(isPalindrome(ans)){
                 List<String> temp = new ArrayList<>();
                result.add(temp);
            }
          
            return;
        }

        subset(s, ans+s.charAt(i), i+1,result);
        subset(s, ans, i+1,result);
    }
     public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        subset(s, "", 0,result);
        return result;
    }

    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> res = partition(s);
        System.out.println(res);

    }
    
}
