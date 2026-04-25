package Strings;

public class IsPalindrom {

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
    public static void main(String[] args) {
        String str ="0P";
        System.out.println(isPalindrome(str));
    }
    
}
