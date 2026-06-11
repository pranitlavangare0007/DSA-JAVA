package Strings;

public class LongestPalindrom {

    
    
     public static int longestPalindrome(String s) {
        
       int freq []= new int[128];

       for(char ch : s.toCharArray()){
        freq[ch]++;
       }

       int length=0;
       boolean isOdd=false;
       for(int i=0;i<128;i++){
        if(freq[i] % 2 == 0){
            length += freq[i];
        }else{
            length += freq[i]-1;
            isOdd=true;
        }
       }

       if(isOdd) length++;
       return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
