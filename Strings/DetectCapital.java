package Strings;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        
        if(word.matches("^[A-Z][a-z]*$") || word.matches("^[A-Z]+$") || word.matches("^[a-z]+$")){
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        String word = "g";
        System.out.println(detectCapitalUse(word));

    }
}
