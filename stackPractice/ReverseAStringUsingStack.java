package stackPractice;

import java.util.Stack;

public class ReverseAStringUsingStack {
     public static String reverseStringHelper( Stack<Character> s , String ans){

       if(s.isEmpty()){
        return ans;
       }
       return  reverseStringHelper(s,ans+s.pop());

    }

    public static String reverseString(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }

        return reverseStringHelper(stack ,"");
    }
    
    public static void main(String[] args) {
        
        String s="hellow";
        System.out.println(reverseString(s));
    }
}
