package Strings;

public class LongestPalindromSubstring {

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
    public static String longestPalindrome(String s) {
        StringBuilder longest = new StringBuilder();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                String sub =s.substring(i,j+1);
                if(isPalindrome(sub)){

                    if(sub.length() > longest.length()){
                        longest.setLength(0);
                    longest.append(sub);
                    }
                    
                }
            }
        }
        return longest.toString();
    }
    public static void main(String[] args) {

        String s="babad";
        System.out.println(longestPalindrome(s));
        
    }
    
}
