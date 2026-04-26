package Strings;



import java.util.Collections;


public class reverseWord {

    public static String reverseWords(String s) {
        
        String word[] = s.trim().split("\\s+");
       Collections.reverse(java.util.Arrays.asList(word));
        
        String result= String.join(" ", word);
        
        return result;
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    
}
