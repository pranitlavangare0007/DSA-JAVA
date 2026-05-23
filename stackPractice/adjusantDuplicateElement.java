package stackPractice;

import java.util.Stack;

public class adjusantDuplicateElement {
     public static String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                 stack.push(ch);
            }
           
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        removeDuplicates(s);

    }
}
