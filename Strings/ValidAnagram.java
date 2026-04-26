package Strings;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int arr[]= new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0 ;i<s.length();i++){
            arr[s.charAt(i)- 'a'] ++;
            arr[t.charAt(i)- 'a']--;
        }

        for(int i: arr){
            if( i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String  s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
    
}
