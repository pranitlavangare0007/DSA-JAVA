package Arrays;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    
    public static boolean wordPattern(String pattern, String s) {
        
        String words[] = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        Map<Character,String> charToWord= new HashMap<>();
        Map<String,Character> wordToChar = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(ch) && !charToWord.get(ch).equals(word)){
                return false;
            }else{
                charToWord.put(ch, word);
            }

            if(wordToChar.containsKey(word) && !wordToChar.get(word).equals(ch)){
                return false;
            }
            else{
                wordToChar.put(word, ch);
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
