package Strings;

import java.util.HashSet;
import java.util.Set;

public class GretestEnglishLetter {
    
     public static String greatestLetter(String s) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

       char ans=' ';

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                lower.add(ch);
            }else{
                upper.add(Character.toLowerCase(ch));
            }
        }

        for(char ch = 'a' ;ch<= 'z';ch++){

            if(lower.contains(ch) && upper.contains(ch) ){
                if(ch > ans){
                    ans=ch;
                }
                
            }
        }
        return String.valueOf(ans).toUpperCase();

    }

    public static void main(String[] args) {
        String s = "arRAzFif";
        System.out.println(greatestLetter(s));
    }
}
