package Strings;

public class RemoveAllOccuranceOfSubstring {

    public static String removeOccurrences(String s, String part) {
       

        StringBuilder str = new StringBuilder();
        
        for(char c : s.toCharArray()){
            str.append(c);

            if(str.length() >= part.length()){
                if(str.substring(str.length() - part.length()).equals(part) ){
                    str.delete(str.length()-part.length(), str.length());
                }
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
    
}
